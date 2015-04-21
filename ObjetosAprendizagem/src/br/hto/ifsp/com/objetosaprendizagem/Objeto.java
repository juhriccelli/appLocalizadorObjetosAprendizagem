package br.hto.ifsp.com.objetosaprendizagem;

public class Objeto {
	private int id_oa, qtd_acesso;
	private String nome, disciplina, nivel, instituicao, idioma, tipo, link;
	
	public Objeto(){
		
	}

	public Objeto(int id_oa, int qtd_acesso, String nome, String disciplina,
			String nivel, String instituicao, String idioma, String tipo,
			String link) {
		this.id_oa = id_oa;
		this.qtd_acesso = qtd_acesso;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nivel = nivel;
		this.instituicao = instituicao;
		this.idioma = idioma;
		this.tipo = tipo;
		this.link = link;
	}

	public int getId_oa() {
		return id_oa;
	}

	public void setId_oa(int id_oa) {
		this.id_oa = id_oa;
	}

	public int getQtd_acesso() {
		return qtd_acesso;
	}

	public void setQtd_acesso(int qtd_acesso) {
		this.qtd_acesso = qtd_acesso;
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

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
