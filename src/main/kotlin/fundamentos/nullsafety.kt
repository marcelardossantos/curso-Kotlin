package fundamentos

import java.lang.reflect.UndeclaredThrowableException

fun main(){

    var lista : List<Int?> = listOf(1, 2, null, 4)
    println(lista)

    var listNullable : List<Int?>? = null // Neste caso a lista pode ser nula e conter elementos nulos//
    println(listNullable)

//    var nome : String? = null
//
//    var tamanho = nome?.length ?: 0
//
//    println(tamanho)

//    var nome : String? = "Marcela"
//
//    if (nome != null) {
//        println(nome.length)
//    }
//
//    val toShort : Short = nome!!.length.toShort()
}