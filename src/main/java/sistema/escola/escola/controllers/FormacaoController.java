package sistema.escola.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistema.escola.escola.dto.FormacaoMinDTO;
import sistema.escola.escola.services.FormacaoService;

@RestController
@RequestMapping(value = "/formacao")
public class FormacaoController {

	@Autowired
	private FormacaoService formacaoService;
	
	@GetMapping
	public List<FormacaoMinDTO> findAll(){
		List<FormacaoMinDTO> result = formacaoService.findAll();
		
		return result;
	}
}
