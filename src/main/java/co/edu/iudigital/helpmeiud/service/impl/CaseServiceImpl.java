package co.edu.iudigital.helpmeiud.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.iudigital.helpmeiud.dto.CaseDTO;
import co.edu.iudigital.helpmeiud.model.Case;
import co.edu.iudigital.helpmeiud.repository.ICaseRepository;
import co.edu.iudigital.helpmeiud.service.iface.ICaseService;

@Service
public class CaseServiceImpl implements ICaseService {
	
	private final ICaseRepository caseRepository;
	
	@Autowired
	public CaseServiceImpl(ICaseRepository caseRepository) {
		this.caseRepository = caseRepository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<CaseDTO> findAll() {
		
		List<Case> cases = caseRepository.findAll();
		
		return cases.stream().map(c -> 		
			CaseDTO.builder()
				.id(c.getId())
				.dateTime(c.getDateTime())
				.latitude(c.getLatitude())
				.longitude(c.getLongitude())
				.altitude(c.getAltitude())
				.visible(c.getVisible())
				.description(c.getDescription())
				.mapUrl(c.getMapUrl())
				.rmiUrl(c.getRmiUrl())
				.crime(c.getCrime())
				.user(c.getUser())
				.build()		
		).collect(Collectors.toList());
	}

	@Override
	@Transactional
	public Case findById(Long id) {
		
		Optional<Case> cases = caseRepository.findById(id);
		
		return cases.get();
	}

	@Override
	@Transactional
	public CaseDTO save(CaseDTO caseDTO) {
		
		Case cases = new Case();
		
		cases.setDateTime(caseDTO.getDateTime());
		cases.setLatitude(caseDTO.getLatitude());
		cases.setLongitude(caseDTO.getLongitude());
		cases.setAltitude(caseDTO.getAltitude());
		cases.setVisible(caseDTO.getVisible());
		cases.setDescription(caseDTO.getDescription());
		cases.setMapUrl(caseDTO.getMapUrl());
		cases.setRmiUrl(caseDTO.getRmiUrl());
		cases.setCrime(caseDTO.getCrime());
		cases.setUser(caseDTO.getUser());
		
		caseRepository.save(cases);
		
		return caseDTO;
	}

	@Override
	@Transactional
	public CaseDTO update(Long id, CaseDTO caseDTO) {
		
		Optional<Case> caseOptional = caseRepository.findById(id);
		
		Case cases = caseOptional.get();
		
		cases.setVisible(caseDTO.getVisible());
		cases.setDescription(caseDTO.getDescription());
		
		caseRepository.save(cases);
		
		return caseDTO;
	}

	@Override
	@Transactional
	public Case delete(Long id) {
		
		Optional<Case> caseOptional = caseRepository.findById(id);
		
		Case cases = caseOptional.get();
		
		caseRepository.delete(cases); 
		
		return null;
	}	
}
