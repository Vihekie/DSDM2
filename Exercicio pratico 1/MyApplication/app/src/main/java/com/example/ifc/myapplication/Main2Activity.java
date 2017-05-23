package com.example.ifc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in = getIntent();
        Bundle bd = in.getExtras();
        double nota1= bd.getDouble("NOTA1");
        double nota2 = bd.getDouble("NOTA2");
        double nota3 = bd.getDouble("NOTA3");
        double peso1 = bd.getDouble("PESO1");
        double peso2 = bd.getDouble("PESO2");
        double peso3= bd.getDouble("PESO3");
        double resultado = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
        TextView show =(TextView) findViewById(R.id.oi);
        show.setText(Double.toString(resultado));
    }
}
