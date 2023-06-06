package fundamentos

fun main() {
    dizOi(retornaNome(), 39)
    dizOi(idade = 39, nome = "Marcela")
    dizOi("Yasmin")
}
fun retornaNome(): String {
    return "Marcela"
}

fun dizOi(nome: String, idade: Int = 16) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos.")
}