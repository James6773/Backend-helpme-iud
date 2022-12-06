package co.edu.iudigital.helpmeiud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity 
@Table(name = "crimes")
@Getter
@Setter
public class Crime implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name = "name", length = 120, unique = true, nullable = false)
    private String name;
    
    @Column(name = "description", length = 250, nullable = true)
    private String description;
    
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id")
    private User user;
}
