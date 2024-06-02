package swingExample3;

class GStack<T> {
	int top;	// tos: top of stack
	int size;
	private Object[] stack;
	
	public GStack() {
		top = 0;
		size = 5;
		stack = new Object[size];
	}
	
	public void push(T item) {
		if(top == size) {
			return;
		}
		stack[top] = item;
		top++;
	}
	
	@SuppressWarnings("unchecked")
	public T pop() {
		if(top == 0) {
			return null;
		}
		top--;
		return (T)stack[top];
	}
}

public class MyStackTest {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();	// String 타입의 GStack생성
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n = 0; n < 3; n++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();	// Integer 타입의 GStack생성
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n = 0; n < 3; n++) {
			System.out.println(intStack.pop());
		}
	}

}
