package br.hto.ifsp.com.objetosaprendizagem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class BD {

	private SQLiteDatabase bd;
	
	public BD(Context context){
		BDCore auxBd = new BDCore(context);
		bd = auxBd.getWritableDatabase();
		
	}
	
	public void inserir(Relacao relacao){
		ContentValues valores = new ContentValues();
		valores.put("nome",relacao.getNome()); 
		valores.put("disciplina",relacao.getDisciplina());
		valores.put("nivel",relacao.getNivel());
		valores.put("idioma",relacao.getIdioma());
		valores.put("instituicao",relacao.getInstituicao());
		valores.put("tipo",relacao.getTipo());
		valores.put("qtd_acesso",relacao.getQtd_acesso());
		valores.put("link",relacao.getLink());
		
		bd.insert("objetosAprendizagem", null, valores);

	}
	
	public void buscar(){
		String[] colunas = new String[]{"nome, disciplina, nivel,idioma, tipo, link"};
		Cursor cursor =  bd.query("objetosAprendizagem", colunas, null, null, null, null, "disciplina ASC");
	}
	
}
