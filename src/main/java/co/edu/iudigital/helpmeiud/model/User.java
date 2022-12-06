package co.edu.iudigital.helpmeiud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity 
@Table(name = "users")
@Getter
@Setter
public class User implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name = "username", length = 120, unique = true, nullable = false)
    private String username;
    
    @Column(name = "name", length = 120, nullable = false)
    private String name;
    
    @Column(name = "last_name", length = 120, nullable = false)
    private String lastName;
    
    @Column(name = "password", length = 250)
    private String password;
    
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;
    
    @Column(name = "enabled", nullable = false)
    private Boolean enabled;
    
    @Column(name = "social_network", nullable = true)
    private Boolean socialNetwork;
    
    @Column(name = "image", nullable = true)
    private String image;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roles_users", 
    			joinColumns = {@JoinColumn(name = "user_id")}, 
    			inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private List<Role> roles;
}
