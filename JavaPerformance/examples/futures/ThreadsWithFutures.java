
package future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsWithFutures {
	private static final int NTHREDS = 10;
	private ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

	public void runThreads(int number) {
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		for (int i = 0; i < number; i++) {
			Callable<Long> worker = new MyCallable();
			Future<Long> submit = executor.submit(worker);
			list.add(submit);
		}
		long sum = 0;
		System.out.println(list.size());
		// now retrieve the result
		for (Future<Long> future : list) {
			try {
				sum += future.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println(sum);
	}

	public boolean isDone() {
		// isTerminated checks if all threads in the executor are finished.
		return executor.isTerminated();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ThreadsWithFutures threadPoolTest = new ThreadsWithFutures();
		threadPoolTest.runThreads(2000);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Runtime " + elapsedTime);
	}
}
