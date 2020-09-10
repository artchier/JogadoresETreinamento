package br.digital.com

fun main(){
    val sessao = SessaoDeTreinamento(0.0)

    val jogador1 = JogadorDeFutebol("jogador1", 10, 10, 0, 0.0)
    sessao.treinarA(jogador1)
    println("Nome: ${jogador1.nome}\tEnergia: ${jogador1.energia}\nAlegria: ${jogador1.alegria}\t" +
            "Gols: ${jogador1.gols}\tExperiência: ${jogador1.experiencia}")

    print("///////////////////////////////////////////////\n")

    val jogador2 = JogadorDeFutebol("jogador2", 5, 5, 10, 20.0)
    sessao.treinarA(jogador2)
    println("Nome: ${jogador2.nome}\tEnergia: ${jogador2.energia}\nAlegria: ${jogador2.alegria}\t" +
            "Gols: ${jogador2.gols}\tExperiência: ${jogador2.experiencia}")
}