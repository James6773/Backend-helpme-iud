package co.edu.iudigital.helpmeiud.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.iudigital.helpmeiud.dto.CrimeDTO;
import co.edu.iudigital.helpmeiud.model.Crime;
import co.edu.iudigital.helpmeiud.repository.ICrimeRepository;
import co.edu.iudigital.helpmeiud.service.iface.ICrimeService;

@Service
public class CrimeServiceImpl implements ICrimeService{
	
	private final ICrimeRepository crimeRepository;
	
	@Autowired
	public CrimeServiceImpl(ICrimeRepository crimeRepository) {
		this.crimeRepository = crimeRepository;
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<CrimeDTO> findAll() {
		
		List<Crime> crimes = crimeRepository.findAll();
		
		return crimes.stream().map(c -> 		
			CrimeDTO.builder()
				.id(c.getId())
				.name(c.getName())
				.description(c.getDescription())
				.user(c.getUser())
				.build()		
		).collect(Collectors.toList()); 
	}

	@Override
	public CrimeDTO findById(Long id) {
		return null;
	}

	@Override
	public CrimeDTO save(CrimeDTO crimeDTO) {
		
		Crime crime = new Crime();
		
		crime.setName(crimeDTO.getName());
		crime.setDescription(crimeDTO.getDescription());
		crime.setUser(crimeDTO.getUser());
		
		crimeRepository.save(crime);
		
		return crimeDTO;
	}
	
	@Override
	public CrimeDTO update(CrimeDTO crimeDTO, Long id) {
		return null;
	}

	@Override
	public CrimeDTO delete(Long id) {
		return null;
	}
	
}
