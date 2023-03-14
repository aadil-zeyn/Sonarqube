package USTBatchNo3.SonarqubeTest;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=new EmployeeDetails("Aadil",25,3,50000);
		EmployeeDetails e2=new EmployeeDetails("Surya",27,5,150000);
		EmployeeDetails e3=new EmployeeDetails("Sasi",35,9,250000);
		EmployeeDetails e4=new EmployeeDetails("Jaba",45,13,500000);
		List<EmployeeDetails> beforeIncrement=Arrays.asList(e1,e2,e3,e4);
		for(EmployeeDetails e:beforeIncrement) {
        	System.out.println(e);
        }
		List<EmployeeDetails> afterIncrement=beforeIncrement.stream()
				.peek(t->{
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
				}})
				
				.toList();
		
        for(EmployeeDetails e:afterIncrement) {
        	System.out.println(e);
        }
		

	}

}
