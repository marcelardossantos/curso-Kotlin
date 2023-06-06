package fundamentos

class Carro( var cor:String, val anoFabricacao: Int, var dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {

}
fun main() {
    var carro = Carro("Branco", 2023, Dono("Marcela", 39))

    println(carro.cor)
    carro.cor = "Preto"

    println(carro.cor)

    println(carro.dono.nome)
    carro.dono.nome = "Yasmin"

    println(carro.dono)
}