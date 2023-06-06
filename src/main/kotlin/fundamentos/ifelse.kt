package fundamentos

fun main() {
//    parOuImpar(2 )
//    parOuImpar(3)

//    resultadoDaNota(3)
//    resultadoDaNota(5)
//    resultadoDaNota(8)

    println(parOuImpar(2))
    println(parOuImpar(9))
}
fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}

//Se a nota for >= 6 -> passou
//Se a nota for >= 4 -> recuperacao
//Se a nota for < 4 -> reprovou
fun resultadoDaNota(nota: Int) {
    if (nota >= 6) {
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }


}