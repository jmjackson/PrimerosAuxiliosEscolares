package com.jhernandez.PrimerosAuxiliosEscolares;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pauxilios_activity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    public void OtherLayout(View view){
        Intent abrir=new Intent(this,general.class);
        startActivity(abrir);
    }
}
