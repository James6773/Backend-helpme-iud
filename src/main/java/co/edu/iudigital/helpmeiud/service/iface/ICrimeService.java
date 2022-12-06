package co.edu.iudigital.helpmeiud.service.iface;

import java.util.List;

import co.edu.iudigital.helpmeiud.dto.CrimeDTO;

public interface ICrimeService {
	
	public List<CrimeDTO> findAll();
	
	public CrimeDTO findById(Long id);
	
	public CrimeDTO save(CrimeDTO crimeDTO);
	
	public CrimeDTO update(CrimeDTO crimeDTO, Long id);
	
	public CrimeDTO delete(Long id);

}
