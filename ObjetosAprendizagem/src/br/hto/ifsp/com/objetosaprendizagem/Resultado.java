package br.hto.ifsp.com.objetosaprendizagem;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Resultado {
	public class Nivel_Ensino extends FragmentActivity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.resultado);

			ActionBar ab = getActionBar();
			ab.setDisplayHomeAsUpEnabled(true);

		}

	}
}