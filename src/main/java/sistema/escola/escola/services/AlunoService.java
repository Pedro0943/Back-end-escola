package sistema.escola.escola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.escola.escola.DTO.AlunoMinDTO;
import sistema.escola.escola.entities.Aluno;
import sistema.escola.escola.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	public List<AlunoMinDTO> findAll(){
		List<Aluno> result = alunoRepository.findAll();
		return result.stream().map(x -> new AlunoMinDTO(x)).toList();
	}

}
