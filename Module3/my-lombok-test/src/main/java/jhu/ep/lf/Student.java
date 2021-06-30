package jhu.ep.lf; 
import java.time.LocalDate;
@lombok.Setter @lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Student {
  
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate lastUpdated;
    private boolean active;
    
}
