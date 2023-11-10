/*
 * This is the object class of the EmailApplication
 */

import java.util.Scanner;

public class Email {

     // global variables
     private String first_name;
     private String last_name;
     private String department;
     private String password;
     private int mailboxCapacity;
     private String alternateEmail;
 
     // constructor - receive first and last name
     public Email(String fname, String lname){
         this.first_name = fname;
         this.last_name = lname;
         // Call a method that will ask user for the department
         this.department = setDept();

     }

     // Ask for the department

     private String setDept(){
        System.out.print("Please enter the department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            return "Sales";
        }
        else if(choice == 2){
            return "Development";
        }
        else if(choice == 3){
            return "Accounting";
        }
        else{
            return "";
        }
    }

     // Generate a random password

     // Set mailbox capacity

     // Change password
 
     // Setters
     public void setFirstName(String fname){
         first_name = fname;
     }
 
     public void setLastName(String lname){
         last_name = lname;
     }
 
     
 
     public void setPassword(String pwd){
         password = pwd;
     }
 
 
     // Getters
     public String getFirstName(){
         return first_name;
     }
 
     public String getLastName(){
         return last_name;
     }
 
     public String getDept(){
         return department;
     }
 
     public String getPassword(){
         return password;
     }
 
     public String getEmail(){
         return password;
     }
    
}
