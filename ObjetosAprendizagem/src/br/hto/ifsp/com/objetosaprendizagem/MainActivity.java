package br.hto.ifsp.com.objetosaprendizagem;

import java.util.ArrayList;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	private ListView lista1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ActionBar ab = getActionBar();
		ab.setDisplayHomeAsUpEnabled(true);
		
		if(android.os.Build.VERSION.SDK_INT >9){
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
			
			
			Button btnDisciplina = (Button)findViewById(R.id.btnDisciplina);
			Button btnDestaque = (Button)findViewById(R.id.btnDestaque);
			Button btnNivel = (Button)findViewById(R.id.btnNivel);
			Button btnBuscar = (Button)findViewById(R.id.btnBuscar);
			EditText campoBusca = (EditText)findViewById(R.id.campoBusca);
			lista1 = (ListView)findViewById(R.id.listView);
			

			btnDisciplina.setOnClickListener(new OnClickListener() {
				
				
				
				@Override
				public void onClick(View v) {

					
				}
			});
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);

		MenuItem m1 = menu.add(0, 0, 0, "Home");
		m1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		MenuItem m2 = menu.add(0, 1, 1, "Nível de Ensino");
		m2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		MenuItem m3 = menu.add(0, 2, 2, "Disciplina");
		m3.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		MenuItem m4 = menu.add(0, 3, 3, "Instituição");
		m4.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

		return (true);
	}

	@Override
	public boolean onMenuItemSelected(int panel, MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			
			Intent intent = new Intent(this, MainActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			break;
		case 0:
			
			Intent intent0 = new Intent(this, MainActivity.class);
			intent0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent0);
			break;
		case 1:
			
			Intent intent1 = new Intent(this, Nivel_Ensino.class);
			intent1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent1);
			break;

		case 2:
			
			Intent intent2 = new Intent(this, Disciplina.class);
			intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent2);
			break;
		case 3:
			
			Intent intent3 = new Intent(this, Instituicao.class);
			intent3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent3);
			break;

		}

		return (true);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
	protected void onRestart(Bundle savedInstanceState) {
		ObjetoDAO dao= new ObjetoDAO();	
		ArrayList<Objeto> lista = dao.buscarObjetoDestaque();
		
		ArrayAdapter<Objeto> destaque = new ArrayAdapter<Objeto>(this, android.R.layout.simple_list_item_1, lista);
		lista1.setAdapter(destaque);
		

	
	}
	
}
