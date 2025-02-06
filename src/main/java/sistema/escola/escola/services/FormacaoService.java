package sistema.escola.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.escola.escola.dto.FormacaoMinDTO;
import sistema.escola.escola.entities.Formacao;
import sistema.escola.escola.repositories.FormacaoRepository;

@Service
public class FormacaoService {

	@Autowired
	private FormacaoRepository formacaoRepository;
	
	public List<FormacaoMinDTO> findAll(){
		List<Formacao> result = formacaoRepository.findAll();
		return result.stream().map(x -> new FormacaoMinDTO(x)).toList();
	}
}
