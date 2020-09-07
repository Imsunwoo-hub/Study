package Thread;

// 쓰레드 종료시 stop() 메소드 사용을 지양함
// interrupt() 메소드를 사용하거나 플래그 변수를 사용한 종료를 권장함

class FlagThread implements Runnable{
	
	private boolean stoped = false;
	
	@Override
	public void run() {
		while(!stoped) {
			System.out.println("플래그 쓰레드 실행중 ");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
		System.out.println("플래그 쓰레드 종료");
	}
	
	public void flagStop(boolean stop) {
		this.stoped = stop;
	}
	
}

class InterruptThread implements Runnable {
	@Override
	public void run() {
		try {
			while(!Thread.currentThread().interrupted()) {
				System.out.println("인터럽트 쓰레드 실행중 ");
				Thread.sleep(500);
			}
			
		} catch(Exception e) {
			
		} finally {
			System.out.println("인터럽트 쓰레드 종료");
		}
	}
}

public class StopThread {

	public static void main(String[] args) {
		
		FlagThread flagThread = new FlagThread();
		Thread thread1 = new Thread(flagThread);
		thread1.start();
		
		try { Thread.sleep(1000); } catch(Exception e) {}
		
		flagThread.flagStop(true);
		
		InterruptThread interruptThread = new InterruptThread();
		Thread thread2 = new Thread(interruptThread);
		thread2.start();
		
		try { Thread.sleep(1000); } catch(Exception e) {}
		
		thread2.interrupt();
	}

}
