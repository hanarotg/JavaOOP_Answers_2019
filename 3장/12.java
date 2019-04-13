public class Add {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(i < args.length) {
			int addSumInt;
			
			// args[i] 정수 유무를 판단.
			try {
				addSumInt = Integer.parseInt(args[i]);
			} catch(NumberFormatException e) {
				// addSumInt 가 정수가 아닌 경우 
				continue;
			} finally {
				i++;
			}
			
			sum += addSumInt;
		}
		
		System.out.println(sum);
	}
}
