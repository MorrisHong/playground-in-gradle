package kr.gracelove.modern.concurrent;

import java.util.concurrent.*;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class ExecutorApp {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(() -> System.out.println("Thread : " + Thread.currentThread().getName()));
		executorService.submit(() -> System.out.println("Thread : " + Thread.currentThread().getName()));
		executorService.shutdown();
	}
}
