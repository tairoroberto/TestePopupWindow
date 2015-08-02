package br.com.trmasolucoes.testepopupwindow;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import br.com.trmasolucoes.testepopupwindow.util.Popup;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	public void showPopupWindow(View view){
		if(view.getId() == R.id.ivInfoNickname){
			Popup.showPopupWindow(view, "Nickname", "Esse será o nome apresentado aos usuários de nossa rede.", "Ok");
		}
		else if(view.getId() == R.id.ivInfoEmail){
			Popup.showPopupWindow(view, "Email", "Esse será o seu login de acesso a rede e tb o endereço que receberá as mensagens", "Ok");
		}
		else if(view.getId() == R.id.ivInfoPassword){
			Popup.showPopupWindow(view, "Senha", "Sua senha deve estar entre 8 e 20 caracteres e deve conter letras e números", "Ok");
		}
	}
	
	
	
}
