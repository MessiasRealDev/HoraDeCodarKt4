fun main(){

    val planetas = arrayOf("terra","marte", "venus", "jupiter", "saturno")
    println("Digite o nome de algum planeta")
    val nomePlaneta = readln()
    if (nomePlaneta in planetas){

        println("O planeta $nomePlaneta, já está na lista")
    }
    else{
        println("O planeta $nomePlaneta, não está na lista")
    }

}