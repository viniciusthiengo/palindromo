package br.com.thiengo.palindromo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import br.com.thiengo.palindromo.domain.Palindromo
import br.com.thiengo.palindromo.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*

fun String.ehPalindromo(): String{
    return if(this.toLowerCase() == this.toLowerCase().reversed())
            "${this.toLowerCase()} é um palíndromo"
        else
            "${this.toLowerCase()} NÃO é um palíndromo"
}

class MainActivityK :
        AppCompatActivity(),
        View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        /*//val palindromo = PalindromoK( et_palindromo.text.toString() );
        val palindromo = Palindromo( et_palindromo.text.toString() );

        tv_resposta.text = if( palindromo.ehPalindromo() )
                "${palindromo.conteudo} é um palíndromo"
            else
                "${palindromo.conteudo} NÃO é um palíndromo"*/
        tv_resposta.text = et_palindromo.text.toString().ehPalindromo()
    }
}