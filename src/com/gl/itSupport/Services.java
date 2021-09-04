package com.gl.itSupport;
import java.util.Random;
import java.util.Scanner;
import com.gl.AdminDepartment.Admin;

public class Services {

	
   private	String Email;
	public char[] GeneratePassword() {
		
		String CapitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetter="abcdefghijklmnopqrstuvwxyz";
		String Number="1234567890";
		String SpecialCharcter="!@#$%^&*?/}{<>";
		
		String value=CapitalLetter + SmallLetter + Number + SpecialCharcter;
		
		Random random=new Random();
		
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			
			password [i] =value.charAt(random.nextInt(value.length()));
		}
		
		return password;
		
	}
    public void Email() {
	
	 
     }
	public String GenerateEmail(String name) {
		return "JyotiSharma";
		
	}


    
	
	
	



}
