package fundamentos

class MinhaClasse (
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criarComValoresPadrão(): MinhaClasse {
            return MinhaClasse("Marcela",  "Rua dos Bobos", 39)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade) //Builder
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Marcela", "Rua dos Bobos", 39)

    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome", "endereco", 10).criaComValoresPadrao()

    var minhacLoader = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)

}