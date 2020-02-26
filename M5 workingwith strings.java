//Derek Lenz
//M5 Lab Assignment: Working w/Strings
//This program demonstrates different uses of strings in java

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class strings {

	public static void main(String[] args) {

		String fName="" , lName ="" ,  UserFullName=" " , fullUpper ="" , fullLower=""   ;
	    String goodStudent="I am a very good student who works hard",wordFinder = "good"; // string constants
		int charCount =0, vowels =0 ,conCount=0 ;
		Scanner scS= new Scanner(System.in);
		System.out.println("Please Enter your first name "); //Prompts the user for their first name, stored in a fName variable
	    fName=scS.nextLine();
		System.out.println("Please Enter your last name ");//Prompts the user for their first name, stored in a fName variable
		lName=scS.nextLine();
		UserFullName= fName + " " + lName; //conactenating the inputs
		System.out.println("Your full name is : " + UserFullName);
		
		for(int i = 0; i < UserFullName.length(); i++) {    
            if(UserFullName.charAt(i) != ' ')    
                charCount++;    
        } 
		System.out.println("The total number of characters in name is : " + charCount); //total length of the their name
		fullUpper = UserFullName.toUpperCase();
		System.out.println("Your name in full caps is: "+fullUpper); //turn to upper and display
	    fullLower=UserFullName.toLowerCase();//turn string to all lower
	    System.out.println("Your full name in lower case is : " + fullLower);
	    
	    char[]nameCheck=UserFullName.toCharArray();
	    for(int v=0;v<UserFullName.length();v++) {//logic to check for a vowel
	    	if(nameCheck[v]=='a'||nameCheck[v]=='A'||nameCheck[v]=='e'||nameCheck[v]=='E'||nameCheck[v]=='i'||nameCheck[v]=='I'||nameCheck[v]=='o'||nameCheck[v]=='O'||nameCheck[v]=='u'||nameCheck[v]=='U'||nameCheck[v]=='y'||nameCheck[v]=='Y') {
	    		vowels++;
	    	}
	    	
	    }
		System.out.println("The number of Vowels in your name is  : " + vowels);
		conCount=charCount-vowels;
	    System.out.println("The number of non vowels is : " + conCount);
	    System.out.println(goodStudent);//total number
	    char ch =goodStudent.charAt(10);
	    System.out.println("The character is index 10 is : " +ch);
        Pattern found = Pattern.compile(wordFinder);
        Matcher words = found.matcher(goodStudent);
        while(words.find()) {//index of words being printed
        	System.out.println("Found good at index starting "+ words.start() +" and ends at index  "+ (words.end()-1));
      }
	 String ns="";
		 do {// for checking if input is excellent
			  System.out.println("Please enter the word excellent");
			  ns= scS.nextLine(); 
			  
		 }
		 while(!"excellent".equals(ns));
			   
	    	  System.out.println("Congrats you entered the correct word");  
		   
	   System.out.println("\nCurrent date and time : ");
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\n MM/dd/yyyy \n HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  // orinint out date to the screen
	   System.out.println(dtf.format(now)); 
	
	}
}


   