package ua.lviv.desctop.task1;

public class Main {

	public static void main(String[] args) {

		WorkerSalaryAtHour w1 = new WorkerSalaryAtHour(20.6, 8.0);
		w1.salary();

		WorkerAtFixedSalary w2 = new WorkerAtFixedSalary(9, 4500);
		w2.salary();

	}

}
