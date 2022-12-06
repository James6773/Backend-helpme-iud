package co.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import co.edu.iudigital.helpmeiud.dto.CaseDTO;
import co.edu.iudigital.helpmeiud.model.Case;

public interface ICaseService {
	
	public List<CaseDTO> findAll();
	
	public Case findById(Long id);
	
	public CaseDTO save(CaseDTO caseDTO);
	
	public CaseDTO update(Long id, CaseDTO caseDTO);
	
	public Case delete(Long id);
	
}
