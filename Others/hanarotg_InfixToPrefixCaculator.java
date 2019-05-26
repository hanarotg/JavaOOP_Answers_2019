package hanar.naver_test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.util.Scanner;

// 자료구조 과제3 : 자바 스택 활용 계산기
// 컴퓨터학부 이태경 20182645

// 계산에 활용할 배열 스택 클래스
class ArrayStack{
	
	// 수식을 차례대로 저장할 문자열 배열
	String[] arrayStack;
	int top;
	boolean parenth; // 열린괄호 존재 여부 변수
	
	// 생성자를 통해 top 값 저장
	ArrayStack(int index){
		// 문자열 배열이 비어 있는 경우 : 0
		top = 0;
		parenth = false;
		arrayStack = new String[index];
	}
	
	// 스택 push 메소드
	void push(String inputOperator) {
		arrayStack[top++] = inputOperator;
	}
	
	// 스택 pop 메소드
	void pop() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		} else {
			arrayStack[top--] = null;
		}
	}
	
	// 스택 top에 해당하는 문자열을 리턴하는 메소드
	 String peek(){
		 if (isEmpty()) {
			throw new IndexOutOfBoundsException();
		} else {
			return arrayStack[top - 1];
		}
	}
	
	// 스택이 비었는지 확인하는 메소드
	boolean isEmpty() {
		if(arrayStack[0] == null) {
			return true; 
		} else {
			return false;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayStack arrOperatorStack = new ArrayStack(100); // 연산자를 저장할 스택 클래스
		String inputTempInfixString = new String(); 
		String outputPostfixString = new String();
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
		System.out.println("자료구조 과제 3 : 자바 스택 활용 계산기");
		System.out.println("수식을 공백 구분하여 입력하여 주십시오");
		System.out.println("입력 예 :3 * 5 + ( 2 - 12 ) - 1");
		
		// 입력한 수식을 inputInfixString 에 저장
		System.out.print("계산을 원하는 수식을 입력하시오: ");
		
		// 올바르지 않은 값을 입력한 경우 예외처리
		try{
			inputTempInfixString = sc.nextLine();
		} catch (IllegalArgumentException e) {
			// 예외발생 시 프로그램 종료
			System.out.println("Exception : " + e);
			sc.close();
			return;
		}
		
		// 입력받은 문자열을 공백 구분을 통해 inputInfixString 문자열 배열에 저장
		String[] inputInfixString = inputTempInfixString.split("\\s");
		
		// 저장한 수식을 스택과 배열을 활용하여 outputPostfixString 문자열에 저장
		for(int i = 0; i<inputInfixString.length; i++) {
			// 비연산자(수)일 경우 그대로 outputPostfixString에 이어서 저장 
			if(isNumeric(inputInfixString[i]) == true) {
				outputPostfixString = outputPostfixString.concat(inputInfixString[i]);
			}
			
			// 여는괄호 인 경우 스택에 push
			else if (inputInfixString[i].equals("(") == true){
				arrOperatorStack.push("(");
				arrOperatorStack.parenth = true;
			}
			
			// 닫는 괄호인 경우 
			else if (inputInfixString[i].equals(")") == true) {
				
				// 열린 괄호를 찾을 때까지 스택에 내용을 pop및  배열에 저장
				while((arrOperatorStack.peek()).equals("(") == false){
					outputPostfixString = outputPostfixString.concat(arrOperatorStack.peek());
					arrOperatorStack.pop();
				}
				// 열린 괄호 pop
				arrOperatorStack.pop();
			}
			
			// 연산자인 경우 
			else if (isOperator(inputInfixString[i]) == 0 ||
					isOperator(inputInfixString[i]) == 1){
				
				// 스택에 열린 괄호가 없는  경우 스택이 빌 때 까지 또는 상위 연산자를 만나지 전까지 pop 및 저장
				if(arrOperatorStack.parenth == false) {
					while( arrOperatorStack.top != 0 && 
							isOperator(arrOperatorStack.peek()) >= isOperator(inputInfixString[i])) {
							outputPostfixString = outputPostfixString.concat(arrOperatorStack.peek());
							arrOperatorStack.pop();
					}
				}
				// 그 후 현재 읽은 연산자를 스택에 push
				arrOperatorStack.push(inputInfixString[i]);
			}
		}
		
		// 위 반복문이 종료된 후 스택에 남은 모든 수식들을 차례대로 pop 및 배열에 저장한다.
		while(arrOperatorStack.top != 0) {
			outputPostfixString = outputPostfixString.concat(arrOperatorStack.peek());
			arrOperatorStack.pop();
		}
		
		// Postfix 문자열 출력
		System.out.println("변환된 Postfix : " + outputPostfixString);
		
		
		// Postfix를 Infix 로 변환할지 선택한다.
		System.out.println("계산하겠습니까? (Y/N) : ");
		String str = sc.next();
		
		if(str.equals("Y") == true) {
			// Postfix 계산식 출력
			try {
				System.out.println(engine.eval(inputTempInfixString));
			} catch(ScriptException e) {
				System.out.println("Exception! : " + e);
			} catch(NullPointerException e) {
				System.out.println("Exception! : " + e);
			}
		} else {
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		sc.close();
		
		
	}
	
	// 해당 문자열이 수인지 확인하는 메소드
	static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch(NumberFormatException e) {
		    return false;
		}
	}
	
	// 해당 문자열이 */, +- 연산자인지 확인하고 우선순위 값을 리턴하는 메소드
	// * 또는 / 일 경우 0을 리턴
	// + 또는 - 일 경우 1을 리턴
	static int isOperator(String str) {
		if(str.equals("+") == true ||
				str.equals("-") == true) {
			return 0;
		} else if(str.equals("*") == true ||
				str.equals("/") == true){
			return 1;
		} else {
			return 2;
		}
	}
}
