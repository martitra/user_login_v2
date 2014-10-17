package com.example.user_login;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * TODO hacer vistas
 */

public class MainActivity extends ActionBarActivity {

	private static final String LOGTAG = "MainActivity";
	EditText editLogin;
	EditText editPassword;
	UserLogin userLogin;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editLogin = (EditText) findViewById(R.id.editTextLogin);
		editPassword = (EditText) findViewById(R.id.editTextPassword);
	}

	public void onClickButtonAcceder(View v) {
		try {
			String login = editLogin.getText().toString();
			String password = editPassword.getText().toString();
			userLogin = new UserLogin(login, password);
			Log.i(LOGTAG, userLogin.toString());
			this.lanzarAccesoOk();
		} catch (UserLoginSintaxException e) {// si haces error de sintaxis
			Log.e(LOGTAG, e.getMessage());
			this.mensajeOk("Datos incompletos", "Error Datos");
		} catch (UserLoginException e) {// si el usuario no existe
			Log.e(LOGTAG, e.getMessage());
		}
	}

	public void lanzarAccesoOk() {
		try {
			Intent i = new Intent(this, UserLoginAccesoOkActivity.class);
			i.putExtra("userLoginObj", userLogin);
			startActivity(i);

		} catch (Exception e) {
			Log.e(LOGTAG, e.getMessage());
		}
	}

	public void onClickButtonInicio(View v) {
		this.finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void mensajeOk(String texto, String titulo) {// abre una ventana con
															// el titulo:
															// mensaje
		AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
		dialogo.setTitle(titulo);
		dialogo.setMessage(texto);
		dialogo.setPositiveButton("Aceptar", null);
		dialogo.create();
		dialogo.show();

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
}
