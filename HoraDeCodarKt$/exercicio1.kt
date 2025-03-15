fun main() {

    val alunos = mutableListOf<String>()
    var cadastro: String

    while(true) {

        println("Informe o nome do aluno")
        cadastro = readln()

        if(cadastro == "PARE" || cadastro == "pare"){
            break
        }else{
            alunos.add(cadastro)
        }
    }
    println("A quantidade de alunos é: ${alunos.size}")
    println("Os alunos são: $alunos")
}