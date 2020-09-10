package kr.gracelove.exam;

import io.reactivex.Observable;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class FirstExample {
	public void emit() {
		Observable.just(1, 2, 3, 4, 5)
				.subscribe(System.out::println);
	}

	public static void main(String[] args) {
		FirstExample demo = new FirstExample();
		demo.emit();
	}
}
