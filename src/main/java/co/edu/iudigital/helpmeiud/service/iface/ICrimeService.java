package co.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import co.edu.iudigital.helpmeiud.dto.CrimeDTO;
import co.edu.iudigital.helpmeiud.model.Crime;

public interface ICrimeService {
	
	public List<CrimeDTO> findAll();
	
	public Crime findById(Long id);
	
	public CrimeDTO save(CrimeDTO crimeDTO);
	
	public CrimeDTO update(Long id, CrimeDTO crimeDTO);
	
	public Crime delete(Long id);

}
