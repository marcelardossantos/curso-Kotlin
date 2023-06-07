package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    if (numero == 4) {
        return "Quatro"
    } else if (numero == 8) {
        return "Oito"
    } else {
        return "Número não mapeado"
    }
}

fun main() {
    println(retornaNumeroPorExtenso(4))
    println(retornaNumeroPorExtenso(8))
    println(retornaNumeroPorExtenso(9))
}