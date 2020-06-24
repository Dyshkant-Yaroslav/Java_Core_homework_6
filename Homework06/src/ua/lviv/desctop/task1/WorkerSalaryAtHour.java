package ua.lviv.desctop.task1;

public class WorkerSalaryAtHour implements Salary {
	double rate;
	double hours;

	public WorkerSalaryAtHour(double rate, double hours) {
		super();
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public void salary() {
		System.out.println("The salary for a day = " + rate * hours);

	}

}
