package co.edu.iudigital.helpmeiud.dto;

import co.edu.iudigital.helpmeiud.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter	
@Setter
@Builder
public class CrimeDTO {
	
	private Long id;
	private String name;
	private String description;	
	private User user;
}
