package br.com.thiengo.palindromo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityK : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener( this )
    }

    override fun onClick(p0: View?) {
        val palindromo = PalindromoK( et_palindromo.text.toString() );
        var resposta: String;

        if( palindromo.ehPalindromo() ){
            resposta = " é um palíndromo"
        }
        else{
            resposta = " NÃO é um palíndromo"
        }

        resposta = palindromo.conteudo + resposta;
        tv_resposta.text = resposta;
    }
}
