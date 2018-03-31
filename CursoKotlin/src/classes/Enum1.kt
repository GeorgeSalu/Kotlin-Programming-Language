package classes

enum class DiaSemana {
	DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

fun main(args: Array<String>) {
	println("O melhor dia da semana é ${DiaSemana.SABADO}")
}