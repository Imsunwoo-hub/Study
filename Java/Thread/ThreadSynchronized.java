package Thread;

class Producer extends Thread{
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			buffer.put(i);
			System.out.println("생산 : "+i);
			//try{ sleep(1000);} catch(Exception e) {}
		}
	}
}

class Customer extends Thread{
	private Buffer buffer;
	
	public Customer(Buffer buffer) {
		this.buffer = buffer;
	}
	public void run() {
		int value = 0;
		for(int i=0; i<10; i++) {
			value = buffer.pop();
			System.out.println("소비 : "+value);
		}
	}
}

class Buffer {
	private int contence;
	private boolean bol = false;
	
	public synchronized int pop() {
		while(bol==false) {
			try {
				wait();
			} catch(Exception e) {
				
			}
		}
		notify();
		bol = false;
		return contence;
	}
	
	public synchronized void put(int x) {
		while(bol==true) {
			try {
				wait();
			} catch(Exception e) {
				
			}
		}
		notify();
		this.contence = x;
		bol = true;
		
	}
}

public class ThreadSynchronized {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Producer producer = new Producer(buffer);
		Customer customer = new Customer(buffer);
		
		producer.start();
		customer.start();
		
	
	}

}
