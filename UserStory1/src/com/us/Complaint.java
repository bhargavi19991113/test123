/**
 * 
 */

/**
 * @author banna3
 *
 */
package com.us;

public class Complaint {

	public Complaint() {
		
	}
	
	int cid=0,cc=4;//clist[];
	String desc[]= {"bad quality","weight is too high","repairs","display issues"};
	int clist[] = {1,2,3,4};
	public void show(int id) {
		for(int i=0;i<4;i++) {
			if(id==i) {
				System.out.println("your id is "+i+" complaint raised is regarding "+desc[i]);
			}
		}
	}
	public void showAll() {
		for(int i=0;i<4;i++) {
			System.out.println("complaint id is "+i+ "complaint is regarding : "+desc[i]);
		}
	}
	
}
