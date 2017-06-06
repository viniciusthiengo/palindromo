package br.com.thiengo.palindromo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.thiengo.palindromo.domain.Palindromo;
import br.com.thiengo.palindromo.domain.PalindromoK;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btVerificar = (Button) findViewById(R.id.bt_verificar);
        btVerificar.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        EditText etPalindromo = (EditText) findViewById(R.id.et_palindromo);
        TextView tvResposta = (TextView)  findViewById(R.id.tv_resposta);
        //Palindromo palindromo = new Palindromo( etPalindromo.getText().toString() );
        PalindromoK palindromo = new PalindromoK( etPalindromo.getText().toString() );
        String resposta;

        if( palindromo.ehPalindromo() ){
            resposta = " é um palíndromo";
        }
        else{
            resposta = " NÃO é um palíndromo";
        }
        resposta = palindromo.getConteudo() + resposta;

        tvResposta.setText( resposta );
    }
}


