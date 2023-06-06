package fundamentos

fun main() {
    var nome = "Marcela"
    val nomeVal = "Marcela"

    nome = "Yasmin"
//    nomeVal = "Yasmin" testando variavel imutavel

    val idade = 39
    println(idade)

    val teste: String
    teste = "Teste"
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}