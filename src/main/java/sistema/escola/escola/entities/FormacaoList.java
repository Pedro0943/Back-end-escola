package sistema.escola.escola.entities;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_formacao_list")
public class FormacaoList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public FormacaoList() {
		
	}

	public FormacaoList(Long id, String nome) {
		
		this.id = id;
		this.nome = nome;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormacaoList other = (FormacaoList) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
