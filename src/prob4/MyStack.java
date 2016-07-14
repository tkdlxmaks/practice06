package prob4;

public class MyStack implements Stack {

	String[] buffer = null;
	int count = 0;
	int capacity;

	public MyStack(int capacity) {
		this.capacity = capacity;
		buffer = new String[capacity];
	}

	@Override
	public void push(String item) {

		if (count == capacity) {
			resize();
		}

		buffer[count] = item;
		count++;

	}

	private void resize() {
		this.capacity += capacity; // 6
		String[] temp = new String[capacity];
		for (int i = 0; i < buffer.length; i++) {
			temp[i] = buffer[i];

		}
		buffer = new String[temp.length];

		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = temp[i];

		}
	}

	@Override
	public String pop() throws MyStackEmptyException {

		if (count < 0) {
			throw new MyStackEmptyException();
		}
		if (buffer[count] == null) {
			count--;
		}

		String pop = buffer[count];
		count--;

		return pop;
	}

	@Override
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return count;
	}

}
