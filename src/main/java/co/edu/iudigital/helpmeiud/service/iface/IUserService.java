package co.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import co.edu.iudigital.helpmeiud.dto.UserDTO;

public interface IUserService {
	
	public List<UserDTO> findAll();
	
	public UserDTO findById(Long id);
	
	public UserDTO save(UserDTO userDTO);
	
	public UserDTO update(UserDTO userDTO, Long id);
	
	public UserDTO delete(Long id);
}
