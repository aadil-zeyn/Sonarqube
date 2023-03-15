package ust.sonar;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		EmployeeDetails e1=new EmployeeDetails("Aadil",25,3,50000);
		EmployeeDetails e2=new EmployeeDetails("Surya",27,5,150000);
		EmployeeDetails e3=new EmployeeDetails("Sasi",35,9,250000);
		EmployeeDetails e4=new EmployeeDetails("Jaba",45,13,500000);
		List<EmployeeDetails> beforeIncrement=Arrays.asList(e1,e2,e3,e4);
	for(EmployeeDetails e:beforeIncrement) {
			PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		     myout.print(e);
		     myout.close();
        }
		
		for(EmployeeDetails t:beforeIncrement) {
				if(t.getNoofyears()>=1&&t.getNoofyears()<=3) {
					t.setSalary(t.getSalary()+0.025*t.getSalary());
				}
				else if(t.getNoofyears()>3&&t.getNoofyears()<=6) {
					t.setSalary(t.getSalary()+0.05*t.getSalary());
				}
				else if(t.getNoofyears()>6&&t.getNoofyears()<=10) {
					t.setSalary(t.getSalary()+0.1*t.getSalary());
				}
				else if(t.getNoofyears()>=12) {
					t.setSalary(t.getSalary()+0.12*t.getSalary());
				}}
		
        for(EmployeeDetails e:beforeIncrement) {
        	PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		     myout.print(e);
		     myout.close();
        }
		

	}

}
