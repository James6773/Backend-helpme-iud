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

import co.edu.iudigital.helpmeiud.dto.CrimeDTO;
import co.edu.iudigital.helpmeiud.service.iface.ICrimeService;


@RestController
@RequestMapping("/crimes")
public class CrimeController {
	
	@Autowired
	private ICrimeService crimeService;
	
	@GetMapping(path = "/get")
	public ResponseEntity<List<CrimeDTO>> findAll() {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.findAll());
	}
	
	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<CrimeDTO> findById(Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.findById(id));
	}
	
	@PostMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CrimeDTO> save(@RequestBody CrimeDTO crimeDTO) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.save(crimeDTO));
	}
	
	@PutMapping(path = "/put/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CrimeDTO> update(@RequestBody CrimeDTO crimeDTO, Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.update(crimeDTO, id));
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<CrimeDTO> delete(Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.delete(id));
	}
}
