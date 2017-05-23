package com.example.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent in = new Intent(this, Main2Activity.class);
        Button butao = (Button) findViewById(R.id.birutao);
        butao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                TextView nota1 = (TextView) findViewById(R.id.n1);
                double nota_1= Float.parseFloat(nota1.getText().toString());
                TextView nota2 = (TextView) findViewById(R.id.n2);
                double nota_2= Float.parseFloat(nota2.getText().toString());
                TextView nota3 = (TextView) findViewById(R.id.n3);
                double nota_3= Float.parseFloat(nota3.getText().toString());

                TextView peso1 = (TextView) findViewById(R.id.p1);
                double peso_1= Float.parseFloat(peso1.getText().toString());
                TextView peso2 = (TextView) findViewById(R.id.p2);
                double peso_2= Float.parseFloat(peso2.getText().toString());
                TextView peso3 = (TextView) findViewById(R.id.p3);
                double peso_3= Float.parseFloat(peso3.getText().toString());
                in.putExtra("NOTA1",nota_1);
                in.putExtra("NOTA2",nota_2);
                in.putExtra("NOTA3",nota_3);
                in.putExtra("PESO1",peso_1);
                in.putExtra("PESO2",peso_2);
                in.putExtra("PESO3",peso_3);
                startActivity(in);
            }
        });
    }
}


