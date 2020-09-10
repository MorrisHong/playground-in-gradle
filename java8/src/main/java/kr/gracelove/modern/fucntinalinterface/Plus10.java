package kr.gracelove.modern.fucntinalinterface;

import java.util.function.Function;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class Plus10 implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer integer) {
		return integer + 10;
	}
}
