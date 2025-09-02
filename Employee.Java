public class Employee {
	String EmpName="koushik";
	int EmpNum=3341;
	double EmpSalary=500000;
	public static void main(String[] args) {
		Employee E1=new Employee();
		System.out.println("Employee Name:"+E1.EmpName);
		System.out.println("Employee Number:"+E1.EmpNum);
		System.out.println("Employee Salary:"+E1.EmpSalary);
		Employee E2=new Employee();
		System.out.println("Employee Name:"+E2.EmpName);
		System.out.println("Employee Number:"+E2.EmpNum);
		System.out.println("Employee Salary:"+E1.EmpSalary);
	}
}
