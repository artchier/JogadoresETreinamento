package br.digital.com

class JogadorDeFutebol(val nome: String,
                       var energia: Int,
                       var alegria: Int,
                       var gols: Int,
                       var experiencia: Double
){
    init {
        println("Nome: $nome\tEnergia: $energia\nAlegria: $alegria\tGols: $gols\tExperiência: $experiencia")
    }

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols ++
        println("GOOOOOL!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }
}