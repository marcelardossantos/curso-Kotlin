package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade${idade}"
    }
}

fun main() {
    var marcela = Pessoa ("Marcela", 39)
    println(marcela)
}