package co.edu.iudigital.helpmeiud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.helpmeiud.model.Case;

@Repository
public interface ICaseRepository 
	extends JpaRepository<Case, Long> {
}


//@Query("UPDATE Case c SET c.visible=?1 value WHERE c.id=?2")
//public Boolean setVisible(Boolean visible, Long id);