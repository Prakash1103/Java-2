package week1.day2assignment;

public class EmployeeDetails {
	public void employeeName(String empName  ,  int empId) {
		System.out.println("employeName:"+ empName + "  emlployeeId:"+empId);
	}
	public void employeeAdress(String empAddress) {
		System.out.println("Employee Address :"+ empAddress);
		
		
	}
	public void employeeSalary(double empsalary) {
		System.out.println("Employee salary :" + empsalary);
	}
	public void employeeMobileNumber(long mobNum) {
		System.out.println("EmployeeMobileNumber :"+ mobNum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp=new EmployeeDetails();
		emp.employeeName("prakash"  , 12345);
		emp.employeeAdress("Ashok nagar" );
		emp.employeeSalary(15000);
		emp.employeeMobileNumber(6282363879l);

	}

}
