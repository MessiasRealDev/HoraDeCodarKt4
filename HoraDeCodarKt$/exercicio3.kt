fun main() {
    val frutas = mutableListOf("Uva", "Morango", "Melão", "Lichia", "Banana", "Maçã")

    while (frutas.isNotEmpty()) {
        println("Frutas na lista: ${frutas.joinToString(" - ")}")
        print("Qual fruta deseja remover? ")
        val removerFruta = readln().trim()

        if (removerFruta in frutas) {
            frutas.remove(removerFruta)
            println(">>> $removerFruta foi removida! <<<")
        } else {
            println("$removerFruta não está na lista. Tente outra. !!!")
        }
    }
    println("Todas as frutas foram removidas. Lista vazia! ")
}