package com.jhernandez.PrimerosAuxiliosEscolares;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by JsPc on 12/02/2016.
 */
public class general extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general);
    }
    public void fin(View view){
        finish();
    }

}
