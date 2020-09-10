package kr.gracelove.modern.fucntinalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class BasicFunctionalInterfaceMain {
	public static void main(String[] args) {
		Plus10 plus10 = new Plus10();
		System.out.println(plus10.apply(1));

		/////

		Function<Integer, Integer> plus10Second = (i) -> i+10;
		System.out.println(plus10Second.apply(1));

		///// 함수의 조합
		Function<Integer, Integer> multiply2 = (i) -> i * 2;
		System.out.println("compose : " + plus10.compose(multiply2).apply(2));
		System.out.println("andThen : " + plus10.andThen(multiply2).apply(2));

		//UnaryOperator -> 입력타입과 리턴타입이 같은 경우. Function을 상속받았다.
		UnaryOperator<Integer> multiply2Second = (i) -> i * 2;
		System.out.println("compose : " + plus10.compose(multiply2Second).apply(2));
		System.out.println("andThen : " + plus10.andThen(multiply2Second).apply(2));

	}
}
