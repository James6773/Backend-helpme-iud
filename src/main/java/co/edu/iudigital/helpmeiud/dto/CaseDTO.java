package co.edu.iudigital.helpmeiud.dto;

import java.time.LocalDateTime;

import co.edu.iudigital.helpmeiud.model.Crime;
import co.edu.iudigital.helpmeiud.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter	
@Setter
@Builder
public class CaseDTO {
	
	private Long id;
    
    private LocalDateTime dateTime;
    
    private Float latitude;
    
    private Float  longitude;
    
    private Float  altitude;
    
    private Boolean visible;
    
    private String description;
    
    private String mapUrl;
    
    private String rmiUrl;
    
    private Crime crime;
    
    private User user;
}
