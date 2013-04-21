package pack.pack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListView;

public class Recherche extends Activity{
	
	ExpandableListView exp;
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); //Supprimer la barre du titre
		setContentView(R.layout.recherche);
		
		exp=(ExpandableListView)findViewById(R.id.expandableListView1); 
		exp.setAdapter(new MyAdapter(this));
		
		Button loupe=(Button)this.findViewById(R.id.btn_rch);
		loupe.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i2= new Intent(Recherche.this,RecherchePerso.class);
				startActivity(i2);
			}
		});
		
	}






}
