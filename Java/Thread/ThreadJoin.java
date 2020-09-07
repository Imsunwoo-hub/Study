package Thread;

// 쓰레드가 종료되더라도 자신이 생성한 쓰레드의 작업이 끝날때까지 기다림
// join() 메소드를 호출한 시점에서 block 상태가됨
// 자신이 생성한 쓰레드의 작업이 끝날때 block 상태에서 깨어남
class JoinThread implements Runnable{

	@Override
	public void run() {
		System.out.println("쓰레드 실행");
		
		try { Thread.sleep(2000); } catch(Exception e) {}
		System.out.println("쓰레드 종료");
	}
	
}

public class ThreadJoin {

	public static void main(String[] args) {
		
		JoinThread joinThread = new JoinThread();
		Thread thread = new Thread(joinThread);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");

	}

}
