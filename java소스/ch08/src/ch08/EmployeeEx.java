package ch08;

public class EmployeeEx {
	public static void main(String[] args) {
		Employee[] emp = new Employee[6];
		emp[0] = new SalaryMan("블랙핑크", 2000000);
		emp[1] = new SalaryMan("BTS", 500000);
		emp[2] = new SalaryMan("뉴진스", 1500000);
		emp[3] = new HourlyEmployee("보검", 100, 800);
		emp[4] = new HourlyEmployee("은우", 50, 1000);
		emp[5] = new HourlyEmployee("명수", 2, 1000);

		for (int i = 0; i < emp.length; i++) {
			int sal = emp[i].computeIncentive();
			int bonus = emp[i].computeIncentive();
			System.out.println("== " + emp[i].getName() + " ==");
			System.out.println("급여: " + sal);
			System.out.println("상여: " + bonus);
		}

	}
}
