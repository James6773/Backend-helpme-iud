package co.edu.iudigital.helpmeiud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.helpmeiud.dto.UserDTO;
import co.edu.iudigital.helpmeiud.service.iface.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping(path = "/get")
	public ResponseEntity<List<UserDTO>> findAll() {
		return ResponseEntity
				.ok()
				.body(userService.findAll());
	}
	
	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<UserDTO> findById(Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(userService.findById(id));
	}
	
	@PostMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(userService.save(userDTO));
	}
	
	@PutMapping(path = "/put/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO, Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(userService.update(userDTO, id));
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<UserDTO> delete(Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(userService.delete(id));
	}
}


