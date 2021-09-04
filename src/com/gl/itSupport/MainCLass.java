package com.gl.itSupport;
import java.util.Scanner;
import com.gl.AdminDepartment.Admin;

public class MainCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Services sr=new Services();
		sr.GeneratePassword();
		sr.GenerateEmail("jyotiSharma");
//		email.emailGenerated("jyoti", "Sharma", "Tech");
		
		
		Admin Ad=new Admin("jyoti","Sharma");
		System.out.println("Please Enter the Department From the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		Scanner sc=new Scanner(System.in);
		int No=sc.nextInt();
		
		
		switch(No){
		case 1:
			
	   System.out.println("Dear "+Ad.getFirstName() +Ad.getLastName() +" Your Generated Credentional are as follow");
	   System.out.println("Email-->"+sr.GenerateEmail("jyotiSharma")+"@tech.abc");
	   System.out.println("Password-->"+sr.GeneratePassword());
		
		break;
		case 2:
			
	   System.out.println("Dear "+Ad.getFirstName() +Ad.getLastName() +" Your Generated Credentional are as follow");
	   System.out.println("Email-->"+sr.GenerateEmail("jyotiSharma")+"@admin.abc");
	   System.out.println("Password-->"+sr.GeneratePassword());
		break;
		case 3:		   
		
	    System.out.println("Dear "+Ad.getFirstName() +Ad.getLastName() +" Your Generated Credentional are as follow");
	    System.out.println("Email-->"+sr.GenerateEmail("jyotiSharma")+"@humanresources.abc");
    	System.out.println("Password-->"+sr.GeneratePassword());
	   break;
		case 4:
	    System.out.println("Dear "+Ad.getFirstName() +Ad.getLastName() +" Your Generated Credentional are as follow");
	    System.out.println("Email-->"+sr.GenerateEmail("jyotiSharma")+"@legal.abc");
		System.out.println("Password-->"+sr.GeneratePassword());

	}
	}
	



}
