/**
 * 
 */
package com.us;

import java.util.Scanner;

/**
 * @author banna3
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complaint c=new Complaint();
		Person p=new Person();
		
		int a,b;
		System.out.println("hello!!!\nenter your choice");
		System.out.println("1.View All complaints\n2.Raise complaint\n3.View particular complaint");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		switch(a)
		{
		case 1:
			//System.out.println("enter customer id");
			//b=sc.nextInt();
			c.showAll();
			break;
			
		case 2:
			System.out.println("enter customer id");
			b=sc.nextInt();
			p.launchComplaint(b);
			System.out.println("The complaint has been launched successfully for id "+b);
			break;
		case 3: System.out.println("enter customer id ");
		    b=sc.nextInt();
		    c.show(b);
		case 4: break;
		default:break;
			
		}
		

	}

}
