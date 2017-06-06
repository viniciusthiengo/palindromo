package br.com.thiengo.palindromo.domain


class PalindromoK( var _conteudo: String ) {
    val conteudo: String = _conteudo
        get(){
            return field.toLowerCase()
        }

    fun ehPalindromo() : Boolean{
        return conteudo == conteudo.reversed()
    }
}