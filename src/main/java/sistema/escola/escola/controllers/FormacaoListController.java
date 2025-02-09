package sistema.escola.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistema.escola.escola.dto.FormacaoListDTO;
import sistema.escola.escola.services.FormacaoListService;

@RestController
@RequestMapping(value = "/list")
public class FormacaoListController {

	@Autowired
	private FormacaoListService formacaoListService;
	

	
	@GetMapping
	public List<FormacaoListDTO> findAll(){
		
		List<FormacaoListDTO> result = formacaoListService.findAll();
		return result;
	}
}
