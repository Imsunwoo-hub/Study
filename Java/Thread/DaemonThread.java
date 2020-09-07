package Thread;

// main() 쓰레드가 종료될때 강제로 종료되는 쓰레드
// 서비스 쓰레드라고도 함, 백그라운드에서 실행되는 쓰레드(우선순위가 낮음)
// 가비지 컬렉터가 대표적인 데몬쓰레드

class Daemon implements Runnable{

	@Override
	public void run() {

		System.out.println("데몬 쓰레드 실행");
		try {Thread.sleep(1000000000); } catch(Exception e) {}
		System.out.println("데몬 쓰레드 종료");
	}
	
}

public class DaemonThread {

	public static void main(String[] args) {
		
		Daemon daemon = new Daemon();
		Thread thread = new Thread(daemon);
		thread.setDaemon(true);
		thread.start();
		try {Thread.sleep(500); } catch(Exception e) {}
		System.out.println("메인 스레드 종료");
	}

}
