package co.edu.iudigital.helpmeiud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.helpmeiud.model.User;

@Repository
public interface IUserRepository 
	extends JpaRepository<User, Long> {
}
