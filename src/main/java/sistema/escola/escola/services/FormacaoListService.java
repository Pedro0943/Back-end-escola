package sistema.escola.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sistema.escola.escola.dto.FormacaoListDTO;
import sistema.escola.escola.entities.FormacaoList;
import sistema.escola.escola.repositories.FormacaoListRepository;

@Service
public class FormacaoListService {
	
	@Autowired
	private FormacaoListRepository formacaoListRepository;
	
	@Transactional(readOnly = true)
	public List<FormacaoListDTO> findAll(){
		 
		List<FormacaoList> result = formacaoListRepository.findAll();
		return result.stream().map(x -> new FormacaoListDTO(x)).toList();
	}
	
}
