package co.edu.iudigital.helpmeiud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.helpmeiud.dto.CaseDTO;
import co.edu.iudigital.helpmeiud.service.iface.ICaseService;


@RestController
@RequestMapping("/cases")
public class CaseController {
	
	@Autowired
	private ICaseService caseService;
	
	@GetMapping
	public ResponseEntity<List<CaseDTO>> index() {
		return ResponseEntity
				.ok()
				.body(caseService.findAll()); 
	}

}
