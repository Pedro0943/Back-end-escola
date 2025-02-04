package sistema.escola.escola.DTO;

import sistema.escola.escola.entities.Aluno;

public class AlunoMinDTO {
	
	private Long id;
	private String nome;
	private String dataNasc;
	private String imgUrl;
	private String cpf;
	
	public AlunoMinDTO() {
		
	}
	
	public AlunoMinDTO(Aluno entity) {
		
		id = entity.getId();
		nome = entity.getNome();
		dataNasc = entity.getDataNasc();
		imgUrl = entity.getImgUrl();
		cpf = entity.getCpf();
		
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getCpf() {
		return cpf;
	}
	
	
}
