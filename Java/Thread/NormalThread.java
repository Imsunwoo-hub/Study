package Thread;

// 자바는 애플리케이션 내부의 모든 쓰레드가 종료되어야 JVM이 종료됨
// main() 쓰레드가 종료되어도 다른 쓰레드가 종료되지 않으면 애플리케이션은 종료되지 않음

class Normal implements Runnable{

	@Override
	public void run() {
		System.out.println("노멀 쓰레드 시작");
		try { Thread.sleep(2000);} catch(Exception e) {}
		System.out.println("노멀 쓰레드 종료");
	}
	
}

public class NormalThread {

	public static void main(String[] args) {
		
		Normal normal = new Normal();
		Thread thread = new Thread(normal);
		thread.start();
		try { Thread.sleep(500);} catch(Exception e) {}
		System.out.println("메인 쓰레드 종료");

	}

}
