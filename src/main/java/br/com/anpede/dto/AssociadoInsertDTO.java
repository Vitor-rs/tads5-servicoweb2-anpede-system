package br.com.anpede.dto;

public class AssociadoInsertDTO extends AssociadoDTO {
	private static final long serialVersionUID = 1L;
	
	private String senha;
	
	public AssociadoInsertDTO() {
		super();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}	
}
