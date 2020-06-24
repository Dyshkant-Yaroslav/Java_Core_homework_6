package ua.lviv.desctop.task1;

public class WorkerAtFixedSalary implements Salary {
	int months;
	double rate;

	public WorkerAtFixedSalary(int months, double rate) {
		super();
		this.months = months;
		this.rate = rate;
	}

	@Override
	public void salary() {
		System.out.println("The salary from period of " + months + " months = " + months * rate);

	}

}
