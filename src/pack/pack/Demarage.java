package pack.pack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Demarage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); //Supprimer la barre du titre
		setContentView(R.layout.demarage);
		
		Thread compteur = new Thread(){
			
			public void run (){
				
				try{
					sleep(5000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent i0 = new Intent("pack.pack.MAINACTIVITY");
					startActivity(i0);
				}
			}
		};
		
		compteur.start();
	}
	
	

}
