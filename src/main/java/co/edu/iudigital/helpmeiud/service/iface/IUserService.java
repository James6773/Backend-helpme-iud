package co.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import co.edu.iudigital.helpmeiud.dto.UserDTO;
import co.edu.iudigital.helpmeiud.model.User;

public interface IUserService {
	
	public List<UserDTO> findAll();
	
	public User findById(Long id);
	
	public UserDTO save(UserDTO userDTO);
	
	public UserDTO update(Long id, UserDTO userDTO);
	
	public User delete(Long id);
}
