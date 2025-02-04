package sistema.escola.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistema.escola.escola.DTO.AlunoMinDTO;
import sistema.escola.escola.services.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@GetMapping
	public List<AlunoMinDTO> findAll(){
		
		List<AlunoMinDTO> result = alunoService.findAll();
		
		return result;
	}
}
