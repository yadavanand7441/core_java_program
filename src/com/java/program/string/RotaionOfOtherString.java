package com.java.program.string;

public class RotaionOfOtherString {
	public static void main(String[] args) {
		
		 String str1 = "abcde", str2 = "deabc";    
		 
//		 str1=str1+str2;
//		 System.out.println(str1);
		 
		 if(str1.length()!=str2.length())
		 {
			 System.out.println("Both string should be equal in length ");
		 }
		 else
		 {
			 str1=str1.concat(str2);
			 if(str1.indexOf(str2)!=-1)
			 {
				 System.out.println("second string is rotationm of first string");
			 }
			 else
			 {
				 System.out.println("second string is not rotationm of first string");
			 }
		 }
		 
		
	}

}
