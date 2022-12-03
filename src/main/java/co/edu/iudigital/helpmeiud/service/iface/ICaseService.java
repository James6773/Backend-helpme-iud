package co.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import co.edu.iudigital.helpmeiud.dto.CaseDTO;

public interface ICaseService {
	
	public List<CaseDTO> findAll();
	
	public CaseDTO findById(Long id);
	
	public CaseDTO save(CaseDTO caseDTO);
	
	public Boolean visible(Boolean visible, Long id);
	
	public void delete(Long id);
	
}
