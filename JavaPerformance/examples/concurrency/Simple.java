
package simplethread;

import java.util.ArrayList;
import java.util.List;

package simplethread;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		long sum = 0;
		for (long i = 0; i < 10000000L; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

public class Simple {
	List<Thread> threads = new ArrayList<Thread>();

	public void runThreads(int number) {
		for (int i = 0; i < number; i++) {
			Runnable worker = new MyRunnable();
			Thread thread = new Thread(worker);
			thread.setName(String.valueOf(i));
			thread.start();
			threads.add(thread);
		}
	}

	public boolean isDone() {
		boolean isDone = true;
		for (Thread thread : threads) {
			if (thread.isAlive()) {
				isDone = false;
				break;
			}
		}
		return isDone;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Simple simpleTest = new Simple();
		simpleTest.runThreads(600);
		while (!simpleTest.isDone()) {

		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Runtime " + elapsedTime);
	}
}
