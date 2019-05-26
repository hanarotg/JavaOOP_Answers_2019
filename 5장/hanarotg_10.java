package hanar.naver_test;

//20182645 이태경 git:hanarotg
abstract class PairMap {
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	
	int num; 
	
	Dictionary(int num){
		// 생성자를 통해 받은 값 만큼 배열 생성
		keyArray = new String[num];
		valueArray = new String[num];
		this.num = num;
	}
	
	@Override
	void put(String key, String value) {
		
		int i = 0;
		boolean flag = false;
		// 동일 인물을 찾을 때까지 반복
		while(keyArray[i] != null) {
			// 동일 인물을 찾은 경우 valueArray[i] 깂 저장
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				flag = true;
				break;
			}
			i++;
		}
		
		// 동일 인물이 없는 경우 인물 정보를 추가
		if(flag == false) {
				keyArray[i] = key;
				valueArray[i] = value;
		} 
	}

	@Override
	String get(String key) {
		// flag 변수를 이용하여 배열에 인물 정보 유무를 판단
		int i = 0;
		boolean flag = false;
		while(keyArray[i] != null) {
			if(keyArray[i].equals(key)) {
				flag = true;
				break;
			}
			i++;
		}
		
		// 인물정보가 있는 경우 valueArray[i] 출력
		if(flag == true) {
			return valueArray[i];
		} else {
			return null;
		}
	}

	@Override
	String delete(String key) {
		// key와 동일한 인물을 배열에서 찾아 valueArray 값을 null로 변경
		int i = 0;
		while(keyArray[i] != null) {
			// 동일한 인물 정보를 찾은 경우 
			if(keyArray[i].equals(key)) {
				valueArray[i] = null;
				break;
			}
			i++;
		}
		return null;
	}

	@Override
	int length() {
		// 등록된 배열의 갯수를 출력
		int i = 0;
		while(keyArray[i] != null) {
			i++;
		}
		return i;
	}
}

public class Main {
	public static void main(String args[]){
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
 }
}
