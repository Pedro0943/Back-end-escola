package sistema.escola.escola.entities;

import java.util.Objects;

import jakarta.persistence.*;

@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "formacao_id")
	private Formacao formacao;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private FormacaoList list;
	
	public BelongingPK() {
		
	}

	public BelongingPK(Formacao formacao, FormacaoList list) {
		
		this.formacao = formacao;
		this.list = list;
	}

	public Formacao getFormacao() {
		return formacao;
	}

	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}

	public FormacaoList getList() {
		return list;
	}

	public void setList(FormacaoList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(formacao, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(formacao, other.formacao) && Objects.equals(list, other.list);
	}
	
	
	
	

}
