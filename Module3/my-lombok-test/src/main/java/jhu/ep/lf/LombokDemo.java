package jhu.ep.lf; 
import java.time.LocalDate;
public class LombokDemo {
  
    public static void main(String[] args) {
      
        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Leonid");
        student.setLastName("Felikson");
        student.setActive(true);
        student.setLastUpdated(LocalDate.now());
       

        System.out.println("Id : "+student.getId());
        System.out.println("Fisr Name : "+student.getFirstName());
        System.out.println("Last Name : "+student.getLastName());
        System.out.println("is Student active? : "+student.isActive());
        System.out.println("last updated date : "+student.getLastUpdated());
        
    }
}
