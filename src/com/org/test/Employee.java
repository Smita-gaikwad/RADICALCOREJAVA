/**
 * 
 */
package com.org.test;

import java.util.Scanner;

/**
 * 
 */
public class Employee {

	String empName;
	double empBasic;
	double empSplAlw;
	boolean status;

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empBasic=" + empBasic + ", empSplAlw=" + empSplAlw + ", status="
				+ status + "]";
	}

	public Employee(String empName, double empBasic, double empSplAlw, boolean status) {
		super();
		this.empName = empName;
		this.empBasic = empBasic;
		this.empSplAlw = empSplAlw;
		this.status = status;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpBasic() {
		return empBasic;
	}

	public void setEmpBasic(double empBasic) {
		this.empBasic = empBasic;
	}

	public double getEmpSplAlw() {
		return empSplAlw;
	}

	public void setEmpSplAlw(double empSplAlw) {
		this.empSplAlw = empSplAlw;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double HRACAl(double empBasicsal, String EmpNm) {

		double EmpHRA = ((empBasicsal * 12) / 100);
		System.out.println("HRA is " + EmpHRA);
		return EmpHRA;

	}

	public double GrossSAl(double EmpHRA, double Basic, double Splalow) {

		double EmpGrosssal = EmpHRA + Basic + Splalow;
		System.out.println("Gross salary is " + EmpGrosssal);
		return EmpGrosssal;

	}

	public double EmpDeductions(double empGrossSal)

	{
		double EmpIncomTax = ((empGrossSal * 12) / 100);
		double EmpPF = ((empGrossSal * 5) / 100);
		double EmpTaxETC = 1000;
		double EmpTotalDeduction = EmpIncomTax + EmpPF + EmpTaxETC;
		System.out.println("Total Deductios " + EmpTotalDeduction);

		return EmpTotalDeduction;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubsm

		Employee employee = new Employee();

		Scanner ScanEmp = new Scanner(System.in);
		String empName;
		double empBasic;
		double empSplAlw;
		System.out.println("Please Enter Employee Name");
		empName = ScanEmp.nextLine();
		System.out.println("Please Enter Employee Basic Salary");
		empBasic = ScanEmp.nextInt();
		System.out.println("Please Enter Employee Special Allowance");
		empSplAlw = ScanEmp.nextInt();

//		double emphra=EmpSal.HRACAl(empBasic,empName);
//		
//		double empGrossSal=EmpSal.GrossSAl(emphra,empBasic,empSplAlw);
//		
//		double empTotalDeduct=EmpSal.EmpDeductions(empGrossSal);
//		
//		double empNetSal=empGrossSal-empTotalDeduct;
//		
//		System.out.println("Employees Net salary = "+empNetSal);

		employee.setEmpName(empName);
		employee.setEmpBasic(empBasic);
		employee.setEmpSplAlw(empSplAlw);

		double emphra = employee.HRACAl(empBasic, empName);

		employee.setStatus(Messages.status);

		System.out.println(employee.getEmpName() + " salary " + employee.getEmpBasic());
		System.out.println(employee.toString());

	}

}
