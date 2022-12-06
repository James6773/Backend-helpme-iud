package co.edu.iudigital.helpmeiud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity 
@Table(name = "cases")
@Getter
@Setter
public class Case implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;
    
    @Column(name = "latitude", nullable = false)
    private Float latitude;
    
    @Column(name = "longitude", nullable = false)
    private Float  longitude;
    
    @Column(name = "altitude", nullable = false)
    private Float  altitude;
    
    @Column(name = "visible", nullable = false)
    private Boolean visible;
    
    @Column(name = "description", length = 250	, nullable = true)
    private String description;
    
    @Column(name = "map_url", nullable = false)
    private String mapUrl;
    
    @Column(name = "rmi_url", nullable = false)
    private String rmiUrl;
    
    @ManyToOne
    @JoinColumn(name = "crime_id")
    private Crime crime;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @PrePersist
    public void prePersist() {
    	if(Objects.isNull(dateTime)) {
    		dateTime = LocalDateTime.now();
    	}
    }  
}
