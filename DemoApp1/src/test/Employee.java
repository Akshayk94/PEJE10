package test;

public class Employee 
{
	public int employeeId;
	public String employeeName;
	public double employeeSalary;
	public int employeeAge;
	
	public Employee(int employeeId, String employeeName, double employeeSalary, int employeeAge) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAge = employeeAge;
	}
	
	public void displayInformation()
	{
		System.out.println("EMPLOYEE ID IS "+employeeId);
		System.out.println("EMPLOYEE NAME IS "+employeeName);
		System.out.println("EMPLOYEE SALARY IS "+employeeSalary);
		System.out.println("EMPLOYEE AGE IS "+employeeAge);
	}
}
