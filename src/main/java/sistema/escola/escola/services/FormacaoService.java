package sistema.escola.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sistema.escola.escola.dto.FormacaoDTO;
import sistema.escola.escola.dto.FormacaoMinDTO;
import sistema.escola.escola.entities.Formacao;
import sistema.escola.escola.repositories.FormacaoRepository;

@Service
public class FormacaoService {

	@Autowired
	private FormacaoRepository formacaoRepository;
	
	@Transactional(readOnly = true)
	public FormacaoDTO findById(Long id) {
		Formacao result = formacaoRepository.findById(id).get();
		FormacaoDTO dto = new FormacaoDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<FormacaoMinDTO> findAll(){
		List<Formacao> result = formacaoRepository.findAll();
		return result.stream().map(x -> new FormacaoMinDTO(x)).toList();
	}
}
