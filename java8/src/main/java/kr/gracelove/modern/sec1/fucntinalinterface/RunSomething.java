package kr.gracelove.modern.sec1.fucntinalinterface;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

@FunctionalInterface
public interface RunSomething {
	void doIt();
	static void printName() {
		System.out.println("Eunmo");
	}
	default void printAge() {
		System.out.println("30");
	}
}
