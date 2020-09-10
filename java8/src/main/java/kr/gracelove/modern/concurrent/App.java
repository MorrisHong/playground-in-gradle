package kr.gracelove.modern.concurrent;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class App {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + Thread.currentThread().getName());
		});
		thread.start();
		System.out.println("Hello: " + Thread.currentThread().getName());
	}
}
