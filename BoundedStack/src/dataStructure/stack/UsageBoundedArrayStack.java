package dataStructure.stack;
import java.util.EmptyStackException;

public class BoundedArrayStack<E>{
	private final Object[] array;
	private int pointer = 0;
	
	public BoundedArrayStack(int size) {
		array = new Object[size];
	}
	
	public void push(E element) {
		if (pointer == array.length) throw new StackOverflowError();
		array[pointer] = element;
		++pointer;
	}
	
	@suppressWarnings("Unchecked")
	public E pop() {
		
	}
}
public class UsageBoundedArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
