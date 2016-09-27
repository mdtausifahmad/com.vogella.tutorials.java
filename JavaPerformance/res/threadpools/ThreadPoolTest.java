
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	private static final int NTHREDS = 10;
	private ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

	public void runThreads(int number) {
		for (int i = 0; i < number; i++) {
			Runnable worker = new MyRunnable();
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
	}

	public boolean isDone() {
		// isTerminated checks if all threads in the executor are finished.
		return executor.isTerminated();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ThreadPoolTest threadPoolTest = new ThreadPoolTest();
		threadPoolTest.runThreads(2000);
		while (!threadPoolTest.isDone()) {

		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Runtime " + elapsedTime);
	}
}
