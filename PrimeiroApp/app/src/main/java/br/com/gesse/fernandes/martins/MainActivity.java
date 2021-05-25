package br.com.gesse.fernandes.martins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botao = (Button) findViewById(R.id.button);
        TextView texto = (TextView)findViewById(R.id.textView);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto.setText("você cicou no botao");
            }
        });
    }
}