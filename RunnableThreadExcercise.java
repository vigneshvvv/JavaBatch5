package BasicPractice;

public class RunnableThreadExcercise implements Runnable{
	
	Thread thread;
	String thread_name;
	
	public RunnableThreadExcercise(String thread_name) {
		this.thread_name = thread_name;
	}

	@Override
	public void run() {
		for(int i = 0; i <4; i++) {
			try {
				thread.sleep(3000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
	}
	
	
	public void createThread() {
		System.out.println("inside create thread");
		thread = new Thread(this, thread_name);
		thread.start();
	}

}
