package co.edu.iudigital.helpmeiud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.helpmeiud.dto.CrimeDTO;
import co.edu.iudigital.helpmeiud.service.iface.ICrimeService;


@RestController
@RequestMapping("/crimes")
public class CrimeController {
	
	@Autowired
	private ICrimeService crimeService;
	
	@GetMapping
	public ResponseEntity<List<CrimeDTO>> index() {
		return ResponseEntity
				.ok()
				.body(crimeService.findAll());
	}
}
