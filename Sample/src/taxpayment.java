import java.util.*;
public class taxpayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Emp id:");
		int empid=sc.nextInt();
		System.out.println("Enter base salary:");
		double base=sc.nextDouble();
		System.out.println("Enter special allowance:");
		double spclAllnce=sc.nextDouble();
		System.out.println("Enter bonus Perc:");
		double bonusPerc=sc.nextDouble();
		System.out.println("Enter Monthly tax saving:");
		double taxMonthly=sc.nextDouble();
		double Annual=(base+spclAllnce)*12;
		double Gross=Annual+(Annual*bonusPerc/100);
		double taxAnnual=taxMonthly*12;
		double netBeforeTax=0;
		if(taxAnnual<=150000) 
		{
		 netBeforeTax = Gross-taxAnnual;
		}
		else {
			netBeforeTax = Gross-150000;
			}
		System.out.println("Annual Gross Salary="+Gross);
		System.out.println("Tax Payble="+taxAnnual);
		if(netBeforeTax<=250000) {
			System.out.println("Net Salary="+netBeforeTax);
		}
		else if(netBeforeTax<=500000) {
			System.out.println("Net Salary="+netBeforeTax*0.05);
		}
		else if(netBeforeTax<=1000000) {
			System.out.println("Net Salary="+netBeforeTax*0.2);
		}
		else if(netBeforeTax>1000000) {
			System.out.println("Net Salary="+netBeforeTax*0.3);
		}
	}

}
