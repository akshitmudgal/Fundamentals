package fundamentals;

import java.util.Scanner;

import java.lang.Math;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int basic = s.nextInt();
		
		String grade = s.next();
		char ch = grade.charAt(0);
		
		  //totalSalary = basic + hra + da + allow – pf
		
		double totalSalary, allow;
		
		double hra = (0.2 * basic);
		double da = (0.5 * basic);
		double pf = (0.11 * basic);
		
		if (ch== 'A') {
			allow = 1700; 	
		}else if(ch=='B') {
			allow = 1500;
		}else {
			allow = 1300;
		}
		
		totalSalary = (basic + hra + da + allow - pf);
				
		
		System.out.println(Math.round(totalSalary));
				

	}

}
