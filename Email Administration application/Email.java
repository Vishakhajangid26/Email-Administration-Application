package  emailapp;

import java.util.Scanner;
 
public class Email {
  private  String firstName;
  private  String lastName;
  private   String password;
  private  int defaultpasswordlength = 8;
   private String department;
  private String email;
   private String companysuffix ="company.com";

  private int mailboxCap = 60;
private String alternativeemail;

public Email (){
   
}


 
   // constructor to recieve first and last name
public  Email( String firstName , String lastName){
   this.firstName = firstName;
  this.lastName = lastName;
System.out.println( "email created:  " + this.firstName + "   "+ this.lastName);


   // call a method to ask for department 
   this.department= setDep();
   System.out.println( "department:" + this.department);

   //call method to ask for random password
   this.password = randomPassword(defaultpasswordlength);
   System.out.println("your password is :" + this.password );

   //elements to generate email
   email = firstName.toLowerCase() + lastName.toLowerCase() +"@" +department + "." + companysuffix;
System.out.println(" email is:" +email);



System.out.println(this.showinfo());
}

   

  

   private String setDep(){
    System.out.println("enter the department \nfor sales  \nfor development \nfor accounting \nfor none  \n enter depcode:");
   try (Scanner myobj = new Scanner(System.in)) {
    int depchoice   =  myobj.nextInt();
     if(depchoice == 1 ){return "sales";}
     else if(depchoice == 2){return "development";}
     else if(depchoice == 3){return "accounting";}
     else{return   "none";}
  }

   }

   //generate a random password
   private String randomPassword(int length){
    String passwordcode ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
    char[] password = new char[length];
    for( int i=0; i<length ;i++){
      int ran = (int)(Math.random()*passwordcode.length());
      password[i]=passwordcode.charAt(ran);
    }
return new String(password);
   }
   //set a emailbox capacity
public void setMailboxCapacity(int capacity){
   this.mailboxCap = capacity;
}

   //set a alternative email
   public void setalternativeemail(String altemail){
      this.alternativeemail = altemail;
   }
//change the password
public void changepassword(String password){
   this.password = password;
}

public int getMailboxCapacity(){
  
   return mailboxCap;
}

public String getalternativeemail(){
   return  alternativeemail;
}

public String getpassword(){
   return password;
}

public String showinfo(){
   return "DISPLAY NAME :" + firstName +"  " +lastName +"   "+"\n"+
   "COMPANY EMAIL :" + email +"   \n "+
   "MAILBOX CAPACITY :" + mailboxCap + "mb";
}
   
}
