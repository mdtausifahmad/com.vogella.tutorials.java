
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
