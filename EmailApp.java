/*
 * This is the main class of the Email Application
 */

public class EmailApp{

   public static void main(String[] args) {
    Email em1 = new Email("John", "Smith");

    // testing set and get
    em1.setAltEmail("js@gmail.com");
    System.out.println(em1.getAlternateEmail());

   }



}