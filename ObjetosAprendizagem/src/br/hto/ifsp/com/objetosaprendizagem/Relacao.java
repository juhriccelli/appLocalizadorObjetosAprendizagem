package br.hto.ifsp.com.objetosaprendizagem;

public class Relacao {
	public String nome, disciplina, nivel,idioma,instituicao, tipo, link;
	private int qtd_acesso;	
	
	public Relacao(){
		nome = "Teste";
		disciplina="Matematica";
		nivel="Ensino Superior";
		idioma="Portugues";
		instituicao="IFSP";
		tipo="MP3";
		qtd_acesso=0;
		link="hto.ifsp.gov.br";
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtd_acesso() {
		return qtd_acesso;
	}

	public void setQtd_acesso(int qtd_acesso) {
		this.qtd_acesso = qtd_acesso;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}



}
