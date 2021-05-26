package br.com.gesse.fernandes.martins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public  void jogar(View view)
    {
        TextView escolhido = (TextView)findViewById(R.id.txtEscolhido);
        int numero= new Random().nextInt(11);

        escolhido.setText("O valor escolhido foi: "+numero);
    }


}