package sistema.escola.escola.dto;

import sistema.escola.escola.entities.Formacao;

public class FormacaoMinDTO {
	
	private Long id;
	private String nome;
	private String imgUrl;
	private String shortDescription;
	
	public FormacaoMinDTO() {
		
	}

	public FormacaoMinDTO(Formacao entity) {
		
		id = entity.getId();
		nome = entity.getNome();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
