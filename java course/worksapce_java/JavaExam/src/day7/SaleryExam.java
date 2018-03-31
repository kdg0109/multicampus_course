package day7;

class SalaryExpr {
	int bonus;
	SalaryExpr() {
		
//		bonus = 0;
		this(0);
	}
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	int getSalary(int grade){
		int salary = 0;
		switch (grade) {
		case 1:
			salary = bonus + 100;
			break;
		case 2:
			salary = bonus + 90;
			break;
		case 3:
			salary = bonus + 80;
			break;
		case 4:
			salary = bonus + 70;
		}
		return salary;
	}
}

public class SaleryExam {
	public static void main(String[] args) {
		int month = day5.MethodLab3.getRandom(12);
		int grade = day5.MethodLab3.getRandom(4);

		SalaryExpr salaryExpr = null;
		if(month%2 == 0)
			salaryExpr = new SalaryExpr(100);
		else
			salaryExpr = new SalaryExpr();
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, salaryExpr.getSalary(grade));
//		System.out.println(month + "월 " + grade + "등급의 월급은 " + salaryExpr.getSalary(grade) + "입니다.");	
	}

}
