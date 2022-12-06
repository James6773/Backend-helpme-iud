package co.edu.iudigital.helpmeiud.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.iudigital.helpmeiud.dto.CaseDTO;
import co.edu.iudigital.helpmeiud.model.Case;
import co.edu.iudigital.helpmeiud.model.User;
import co.edu.iudigital.helpmeiud.repository.ICaseRepository;
import co.edu.iudigital.helpmeiud.service.iface.ICaseService;

@Service
public class CaseServiceImpl implements ICaseService {
	
	private final ICaseRepository caseRepository;
	
	@Autowired
	public CaseServiceImpl(ICaseRepository caseRepository) {
		this.caseRepository = caseRepository;
	}
	
	@Transactional(readOnly = true)
	@Override
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
	public CaseDTO findById(Long id) {
		
		return null;
	}

	@Override
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
	public CaseDTO update(CaseDTO caseDTO, Long id) {
		
		return null;
	}

	@Override
	public CaseDTO delete(Long id) {
		
		return null;
	}	
}
