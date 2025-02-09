package sistema.escola.escola.dto;

import org.springframework.beans.BeanUtils;

import sistema.escola.escola.entities.Formacao;

public class FormacaoDTO {
	
	private Long id;
	private String nome;
	private Double score;
	private String imgUrl;
	private String nivel;
	private String shortDescription;
	private String longDescription;

	public FormacaoDTO() {
		
	}

	public FormacaoDTO(Formacao entity) {
		
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
}
