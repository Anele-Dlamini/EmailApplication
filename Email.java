/*
 * This is the object class of the EmailApplication
 */

import java.util.Scanner;

public class Email {

     // global variables
     private String first_name;
     private String last_name;
     private String department;
     private String email;
     private String password;
     private int mailboxCapacity = 500;
     private String alternateEmail;
     private String companySuffix = "company.com";
 
     // constructor - receive first and last name
     public Email(String fname, String lname){
        this.first_name = fname;
        this.last_name = lname;
       // System.out.println("Email for " + this.first_name + " " + this.last_name + " successfully created!");

        // Call a method that will ask user for the department - returns department
        this.department = setDept();
        // System.out.println("The department " + this.department + " was succesfully selected.");

        // Call a method that returns as random password
        this.password = generatePassword(10);
        System.out.println("The password is: " + this.password);

        // Generate email with format firstname.lastname@department.company.com
        this.email = this.first_name.toLowerCase() + "." + this.last_name.toLowerCase() + "@" + this.department.toLowerCase() + "." + companySuffix;
       // System.out.println("Your email address is: " + this.email);
     }

     // Ask for the department
     private String setDept(){
        System.out.print("New employee: "+ first_name + "\nDepartment codes: \n1 - Sales\n2 - Development\n3 - Accounting\n0 - None.\nEnter a code: ");
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
     private String generatePassword(int length){
        String pwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] pwd = new char[length]; // using a char array 
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * pwdSet.length()); // generate random number between (0 and 1 - Math.random) and length of pwdSet
            pwd[i] = pwdSet.charAt(rand); // get random char from set and populate char array
        }
        return new String(pwd);

     }

     // Set mailbox capacity
     public void setMailboxCapacity(int cap){
        this.mailboxCapacity = cap;
     }

     /*
      * Setters - they help us with encapsulation, hiding the actual properties of the variables
      */

     // Set alternate email
     public void setAltEmail(String altEmail){
        this.alternateEmail = altEmail;
     }

     // Change password
     public void changePassword(String password){
        this.password = password;
     }

     /*
      * Getters
      */
      // Get mailbox capacity
     public int getMailboxCapacity(){
        return mailboxCapacity;
     }

     // Get alternate email
     public String getAlternateEmail(){
        return alternateEmail;
     }

     // Get password
     public String getPassword(){
        return password;
     }

     /*
      * Name, email, mailbox capacity
      */
     public String showInfo(){
        return "Display name: " + first_name + " " + last_name + "\nCompany Email: " + email + "\nMailbox capacity: " + mailboxCapacity + " mb";
     }
}
