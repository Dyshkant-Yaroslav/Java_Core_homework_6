package ua.lviv.desctop.task2.interface2;

import ua.lviv.desctop.task2.interface1.Numerable;

public class MyCalculator implements Numerable {

	double a;
	double b;

	public MyCalculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void plus() {
		System.out.println("The result of adding= " + (a + b));

	}

	@Override
	public void minus() {
		System.out.println("The result of substracing=" + (a - b));

	}

	@Override
	public void multiply() {

		System.out.println("The result of multiplyying= " + a * b);
	}

	@Override
	public void divide() {
		System.out.println("The result of dividing= " + a / b);

	}

}
