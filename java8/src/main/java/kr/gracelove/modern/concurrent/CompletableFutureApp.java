package kr.gracelove.modern.concurrent;

import java.util.concurrent.*;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class CompletableFutureApp {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(() -> {
			System.out.println("Hello runAsync" + Thread.currentThread().getName());
		});
		runAsyncFuture.get();

		////

		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
			System.out.println("Hello supplyAsync" + Thread.currentThread().getName());
			return "supplyAsync";
		}).thenApply(String::toUpperCase);
		System.out.println(supplyAsync.get());
	}
}
