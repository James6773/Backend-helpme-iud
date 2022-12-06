package co.edu.iudigital.helpmeiud.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.iudigital.helpmeiud.dto.UserDTO;
import co.edu.iudigital.helpmeiud.model.User;
import co.edu.iudigital.helpmeiud.repository.IUserRepository;
import co.edu.iudigital.helpmeiud.service.iface.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	private final IUserRepository userRepository;

	@Autowired
	public UserServiceImpl(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<UserDTO> findAll() {
		
		List<User> users = userRepository.findAll();
		
		return users.stream().map(c -> 		
			UserDTO.builder()
				.id(c.getId())
				.username(c.getUsername())
				.name(c.getName())
				.lastName(c.getLastName())
				.password(c.getPassword())
				.birthDate(c.getBirthDate())
				.enabled(c.getEnabled())
				.socialNetwork(c.getSocialNetwork())
				.image(c.getImage())
				.roles(c.getRoles())
				.build()		
		).collect(Collectors.toList()); 
	}

	@Override
	public UserDTO findById(Long id) {
		
		return null;
	}

	@Override
	public UserDTO save(UserDTO userDTO) {
		
		User user = new User();
		
		user.setUsername(userDTO.getUsername());
		user.setName(userDTO.getName());
		user.setLastName(userDTO.getLastName());
		user.setPassword(userDTO.getPassword());
		user.setBirthDate(userDTO.getBirthDate());
		user.setEnabled(userDTO.getEnabled());
		user.setSocialNetwork(userDTO.getSocialNetwork());
		user.setImage(userDTO.getImage());
		user.setRoles(userDTO.getRoles());
		
		userRepository.save(user);
		
		return userDTO;
	}

	@Override
	public UserDTO update(UserDTO userDTO, Long id) {
		
		return null;
	}

	@Override
	public UserDTO delete(Long id) {
		
		return null;
	}
}
