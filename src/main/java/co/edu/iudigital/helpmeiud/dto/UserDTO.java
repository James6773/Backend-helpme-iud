package co.edu.iudigital.helpmeiud.dto;

import java.time.LocalDate;
import java.util.List;

import co.edu.iudigital.helpmeiud.model.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter	
@Setter
@Builder
public class UserDTO {
	
	private Long id;
    
    private String username;
    
    private String name;
    
    private String lastName;
    
    private String password;
    
    private LocalDate birthDate;
    
    private Boolean enabled;
    
    private Boolean socialNetwork;
    
    private String image;
    
    private List<Role> roles;

}
