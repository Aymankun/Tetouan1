package pack.pack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); //Supprimer la barre du titre
		setContentView(R.layout.activity_main);
		
         
		Button b1=(Button)this.findViewById(R.id.btn_rch);
		Button b2=(Button)this.findViewById(R.id.btn_tet);
		Button b3=(Button)this.findViewById(R.id.btn_meteo);
		Button b4=(Button)this.findViewById(R.id.btn_cnvr);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i1= new Intent(MainActivity.this,Recherche.class);
				startActivity(i1);
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i2= new Intent(MainActivity.this,Demarage.class);
				startActivity(i2);
			}
		});
		b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i3= new Intent(MainActivity.this,Demarage.class);
				startActivity(i3);
			}
		});
		b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.e("geud", "u r doin' great");
			}
		});
		
		
	}
	

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	
}
