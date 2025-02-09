package sistema.escola.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sistema.escola.escola.dto.AlunoDTO;
import sistema.escola.escola.dto.AlunoMinDTO;
import sistema.escola.escola.entities.Aluno;
import sistema.escola.escola.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Transactional(readOnly = true)
	public AlunoDTO findById(Long id) {
		Aluno result = alunoRepository.findById(id).get();
		AlunoDTO dto = new AlunoDTO(result);
		return dto;
	}
	
	
	@Transactional(readOnly = true)
	public List<AlunoMinDTO> findAll(){
		List<Aluno> result = alunoRepository.findAll();
		return result.stream().map(x -> new AlunoMinDTO(x)).toList();
	}

}
