package fundamentos

fun main() {

    var lista =  listOf(1, 2, 3, 2, 4, 6)  // Lista imutável (não é possível adicionar ou remover elementos, possível apenas filtrar)//
//    val pares = lista.filter { it % 2 == 0 }.first()

//    val pares = lista.last()

//    lista.forEach {
//        println(it)
//    }

//    for (numero in lista){
//        println(numero)
//    }

    println(lista[0])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    var listaMutavel = mutableListOf(1, 2, 3, 4, 6)

    println(listaMutavel)

    listaMutavel.add(8)

    listaMutavel.removeAt(0)
    listaMutavel.remove(3)

    listaMutavel[0] = 20

    println(listaMutavel)

    var ordenaLista = mutableListOf(1, 3, 5, 2, 9, 8, 20, 15)

    println(ordenaLista)

    ordenaLista.sort()

    println(ordenaLista)

    ordenaLista.shuffle()

    println(ordenaLista)

    var listaNomes = mutableListOf("Marcela", "Yasmin", "Nikita")
    println(listaNomes)

    listaNomes.sort()
    println(listaNomes)

    var setNumeros = setOf(1, 2, 3, 2) // set não recebe valores duplicados//
    println(setNumeros)
    println("Lista: $lista")

    println(setNumeros.contains(2))

    var mapNomeIdade = mapOf("Marcela" to 39, "Yasmin" to 20, "Nikita" to 5)
    println(mapNomeIdade)

    var mapMutNomeIdade = mutableMapOf("Marcela" to 39, "Yasmin" to 20, "Nikita" to 5) // Neste caso em vez de add usamos put//

//    mapMutNomeIdade.put("Gláuber", 35)
    mapMutNomeIdade["Gláuber"] = 35

    println(mapMutNomeIdade)

    mapMutNomeIdade.remove("Gláuber")
    println(mapMutNomeIdade)

    mapMutNomeIdade["Nikita"] = 4  //Sobreescreve o valor

    println(mapMutNomeIdade)

    mapMutNomeIdade.putIfAbsent("Marcela", 40) //Chave não repete

    mapMutNomeIdade.putIfAbsent("Gláuber", 39) //Valor repete

    println(mapMutNomeIdade)
}