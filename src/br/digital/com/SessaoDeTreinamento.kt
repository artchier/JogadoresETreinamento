package br.digital.com

class SessaoDeTreinamento(var experiencia: Double) {

    fun treinarA(jogador: JogadorDeFutebol){
        println("Experiência antes do treinamento: ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 1
        println("Experiência depois do treinamento: ${jogador.experiencia}")
    }
}