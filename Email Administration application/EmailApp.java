package emailapp;

public class EmailApp {
    public static void main( String[] args){
       Email em1 = new Email("vishakha", "jangid");
       System.out.println("displaying information for em1 :");
       System.out.println(em1.showinfo());

       Email em2 = new Email();
       System.out.println("displaying information for em2 :");
     System.out.println(em2.getMailboxCapacity());
     System.out.println  (em2.getalternativeemail());
     System.out.println ( em2. getpassword());  
        
    }

    
}
