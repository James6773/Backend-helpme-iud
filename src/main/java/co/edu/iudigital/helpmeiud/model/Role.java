package co.edu.iudigital.helpmeiud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity 
@Table(name = "roles")
@Getter
@Setter
public class Role implements Serializable{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name = "name", length = 120, unique = true, nullable = false)
    private String name;
    
    @Column(name = "description", length = 250, nullable = true)
    private String description;
    
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}
