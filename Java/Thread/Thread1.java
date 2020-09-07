package Thread;

// Thread 클래스를 extends 하여 쓰레드를 생성하는 방법(상속)
class ExTask extends Thread{
	
	@Override
	public void run() {
		System.out.println("thread 실행");
	}
	
}

public class Thread1 {

	public static void main(String[] args) {
		
		ExTask task = new ExTask();
		task.start();
		
		System.out.println("1번 출력");
		System.out.println("2번 출력");
		System.out.println("3번 출력");
		System.out.println("4번 출력");
		System.out.println("5번 출력");
		
	
	}

}
