package br.com.thiengo.palindromo.domain


class PalindromoK constructor( conteudo: String ) {
    val conteudo: String? = conteudo
        get(){
            /*
             * if() TAMBÉM PODE SER UMA EXPRESSÃO NO KOTLIN,
             * MAS NESTE CASO PRECISA SER SEGUIDO PELO else.
             * */
            field = if( field != null )
                field
            else
                "";

            return field.toLowerCase();
        }

    fun ehPalindromo() : Boolean {
        val status = if(conteudo != null)
                conteudo == conteudo.toString().reversed()
            else
                false;
        return status;
    }
}