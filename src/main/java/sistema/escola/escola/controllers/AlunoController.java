package sistema.escola.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistema.escola.escola.dto.AlunoDTO;
import sistema.escola.escola.dto.AlunoMinDTO;
import sistema.escola.escola.services.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@GetMapping(value = "/{id}")
	public AlunoDTO findById(@PathVariable Long id) {
		AlunoDTO result = alunoService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<AlunoMinDTO> findAll(){
		
		List<AlunoMinDTO> result = alunoService.findAll();
		
		return result;
	}
}
