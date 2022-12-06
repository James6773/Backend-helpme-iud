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

import co.edu.iudigital.helpmeiud.dto.CaseDTO;
import co.edu.iudigital.helpmeiud.service.iface.ICaseService;


@RestController
@RequestMapping("/cases")
public class CaseController {
	
	@Autowired
	private ICaseService caseService;
	
	@GetMapping(path = "/get")
	public ResponseEntity<List<CaseDTO>> findAll() {
		return ResponseEntity
				.ok()
				.body(caseService.findAll()); 
	}
	
	@GetMapping(path = "/getById/{id}")
	public ResponseEntity<CaseDTO> findById(Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(caseService.findById(id));
	}
	
	@PostMapping(path = "/post", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CaseDTO> save(@RequestBody CaseDTO caseDTO) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(caseService.save(caseDTO));
	}
	
	@PutMapping(path = "/put/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CaseDTO> update(@RequestBody CaseDTO caseDTO, Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(caseService.update(caseDTO, id));
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<CaseDTO> delete(Long id) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error: "+e);	
		}
		
		return ResponseEntity
				.ok()
				.body(caseService.delete(id));
	}
}


