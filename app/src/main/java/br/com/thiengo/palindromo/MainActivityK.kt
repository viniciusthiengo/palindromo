package br.com.thiengo.palindromo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import br.com.thiengo.palindromo.domain.Palindromo
import br.com.thiengo.palindromo.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*


fun String.ehPalindromo(): String{
    return if(this.reversed() == this)
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

        bt_verificar.setOnClickListener( this )
    }

    override fun onClick(view: View?) {
        /*//val palindromo = PalindromoK( et_palindromo.text.toString() )
        val palindromo = Palindromo( et_palindromo.text.toString() )
        var resposta: String

        resposta = if( palindromo.ehPalindromo() )
                " é um palíndromo"
            else
                " NÃO é um palíndromo"

        resposta = palindromo.conteudo + resposta
        tv_resposta.text = resposta*/
        tv_resposta.text = et_palindromo.text.toString().ehPalindromo();
    }
}
