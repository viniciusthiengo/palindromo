package br.com.thiengo.palindromo


class PalindromoK(private val _conteudo : String) {

    val conteudo : String = _conteudo
        get(){
            return field.toLowerCase();
        }

    fun ehPalindromo() : Boolean {
        val invertido = conteudo.reversed();
        return invertido == conteudo;
    }
}