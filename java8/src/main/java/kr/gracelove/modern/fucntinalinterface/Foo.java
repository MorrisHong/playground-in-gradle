package kr.gracelove.modern.fucntinalinterface;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/10
 */

public class Foo {
	public static void main(String[] args) {
		RunSomething runSomething = new RunSomething() {
			@Override
			public void doIt() {
				System.out.println("Just do it!");
			}
		};

		RunSomething runSomething2 = () -> System.out.println("Just do it! lambda");

		runSomething.doIt();
		runSomething2.doIt();

		/////

		ReturnSomething returnSomething = (number)-> number + 10;

		System.out.println(returnSomething.doIt(1));
		System.out.println(returnSomething.doIt(2));
		System.out.println(returnSomething.doIt(3));
		System.out.println(returnSomething.doIt(4));
	}
}
