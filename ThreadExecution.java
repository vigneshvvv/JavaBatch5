package BasicPractice;

public class ThreadExecution {
	
	public static void main(String[] args) {
		RunnableThreadExcercise excercise = new  RunnableThreadExcercise("Thread-1");
		excercise.createThread();
		
		RunnableThreadExcercise excercise2 = new RunnableThreadExcercise("Thread-2");
		excercise2.createThread();
		
		RunnableThreadExcercise excercise3 = new RunnableThreadExcercise("Thread-2");
		excercise3.createThread();
		
		RunnableThreadExcercise excercise4 = new RunnableThreadExcercise("Thread-2");
		excercise4.createThread();
	}

}
