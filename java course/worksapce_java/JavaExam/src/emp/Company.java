package emp;

public class Company {

	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new Secretary("Duke", 1, "secretary", 800);
		emps[1] = new Sales("Tuxi", 2, "sales", 1200);
		printEmployee(emps, false);
		System.out.println("인센티브 100 지급");
/*		((Secretary)emps[0]).incentive(100);
		((Sales)emps[1]).incentive(100);*/
		((Bonus)emps[0]).incentive(100);			//Bonus라는 또다른 부모로도 바꿀 수 있음. 
		((Bonus)emps[1]).incentive(100);
		printEmployee(emps, true);
	}
	public static void printEmployee(Employee[] emp, boolean isTax) {
		String resultTitle = "";
		String resultEmp = "";
		resultTitle += "name\t\t\tdepartment\t\t\tsalary";
		if(isTax) {
			resultTitle += "\t\t\ttax\n";
			resultTitle += "---------------------------------------------------------------";
		}else {
			resultTitle += "\n------------------------------------------------";
		}
		resultTitle += "\n";
		
		for(Employee em : emp) {
			resultEmp += em.getName() + "\t\t\t" +  em.getDepartment() + "\t\t\t" + em.getSalary();
			if(isTax) {
				resultEmp += "\t\t\t" + String.format("%.1f",em.tax());
			}
			resultEmp += "\n";
		}
		System.out.println(resultTitle + resultEmp);
	}
}
