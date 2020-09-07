package Thread;

// Runnable 인터페이스를 implements 하여 쓰레드를 생성하는 방법(합성)
class ImTask implements Runnable{

	@Override
	public void run() {
		System.out.println("thread 실행");
		
	}
	
}

public class Thread2 {

	public static void main(String[] args) {
		
		ImTask imTask = new ImTask();
		Thread thread = new Thread(imTask);
		thread.start();
		
		System.out.println("1번 출력");
		System.out.println("2번 출력");
		System.out.println("3번 출력");
		System.out.println("4번 출력");
		System.out.println("5번 출력");

	}

}
