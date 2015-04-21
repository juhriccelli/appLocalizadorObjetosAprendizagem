package br.hto.ifsp.com.objetosaprendizagem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDCore extends SQLiteOpenHelper{
	private static final String NOME_BD="objetoAprendizagem";
	private static final int VERSAO_BD=1;
	
	public BDCore(Context ctx){
		super(ctx, NOME_BD, null, 1);
		
	}
	

	@Override
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL("create table objetos(_id integer primary key autoincrement, nome text not null, disciplina text not null, nivel text not null, idioma text not null, instituicao text, tipo text not null, qtd_acesso integer, link text not null)");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	

}
