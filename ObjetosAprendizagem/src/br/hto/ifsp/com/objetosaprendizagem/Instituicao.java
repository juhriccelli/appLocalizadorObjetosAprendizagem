package br.hto.ifsp.com.objetosaprendizagem;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Instituicao extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instituicao);

		ActionBar ab = getActionBar();
		ab.setDisplayHomeAsUpEnabled(true);

	}
}
