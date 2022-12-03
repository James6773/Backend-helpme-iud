package co.edu.iudigital.helpmeiud.dto;

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
}
