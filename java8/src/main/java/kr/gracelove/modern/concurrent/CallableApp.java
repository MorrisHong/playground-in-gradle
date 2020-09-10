package kr.gracelove.modern.concurrent;

import java.util.concurrent.*;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class CallableApp {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		////
		ExecutorService executorForCallable = Executors.newSingleThreadExecutor();

		Callable<String> hello = () -> {
			Thread.sleep(2000L);
			return "Hello";
		};

		Future<String> helloFuture = executorForCallable.submit(hello);
		System.out.println(helloFuture.isDone());
		System.out.println("Started");

		helloFuture.get(); // 블로킹큐.

		System.out.println(helloFuture.isDone());
		System.out.println("End!");
		executorForCallable.shutdown();
	}
}
