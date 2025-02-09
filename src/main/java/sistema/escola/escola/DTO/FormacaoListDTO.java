package sistema.escola.escola.dto;

import sistema.escola.escola.entities.FormacaoList;

public class FormacaoListDTO {
	
	private Long id;
	private String nome;
	
	public FormacaoListDTO() {
		
	}

	public FormacaoListDTO(FormacaoList entity) {
		
		id = entity.getId();
		nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	
}
