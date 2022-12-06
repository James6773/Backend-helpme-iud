package co.edu.iudigital.helpmeiud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.helpmeiud.dto.CrimeDTO;
import co.edu.iudigital.helpmeiud.model.Crime;
import co.edu.iudigital.helpmeiud.service.iface.ICrimeService;


@RestController
@CrossOrigin(origins = "*")
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
	public ResponseEntity<Crime> findById(@PathVariable Long id) {
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
	public ResponseEntity<CrimeDTO> update(@PathVariable Long id, @RequestBody CrimeDTO crimeDTO) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.update(id, crimeDTO));
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Crime> delete(@PathVariable Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(crimeService.delete(id));
	}
}
