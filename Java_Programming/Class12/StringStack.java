package Class12;

interface Stack {
	int length();	// 현재 스택에 저장된 개수 리턴
	int capacity();	// 스택의 전체 저장 가능한 개수 리턴
	String pop();	// 스택의 톱(top)에 실수 저장
	boolean push(String val);	// 스택의 톱에 저장된 실수 리턴
}


class StringStack implements Stack {
	
	private String[] stack;	// 문자열 저장공간
	private int size;
	private int top;	// 맨 꼭대기 LIFO
	
	public StringStack(int size) {
		this.size = size;
		stack = new String[size];
		top = 0;
	}
	
	@Override
	public int length() {
		return top;	// 현재 스택에 몇 개 들어있는지
	}

	@Override
	public int capacity() {
		return size - top;	// 몇 개 더 저장 가능한지
	}

	@Override
	public String pop() {	// 꺼내기 후입선출
		top--;
		return stack[top];
	}

	@Override
	public boolean push(String val) {	
		if(top >= size) {	// 스택이 차 있지 않으면 문자열 저장
			return false;
		}
		else {	
			stack[top] = val;
			top++;
			return true;
		}
	}
	
}





