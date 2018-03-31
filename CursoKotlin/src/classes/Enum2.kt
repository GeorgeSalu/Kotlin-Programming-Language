package classes

enum class DiaDaSemana2(val id: Int, val nome: String, val util: Boolean) {
	DOMINGO(1, "Domingo", false),
	SEGUNDA(2, "Segunda", true),
	TERCA(3, "Ter�a", true),
	QUARTA(4, "quarta", true),
	QUINTA(5, "Quinta", true),
	SEXTA(6, "Sexta", true),
	SABADO(7, "Sabado", false),
}

fun main(args: Array<String>) {
	for(dia in DiaDaSemana2.values()) {
		println("${dia.nome} � um dia ${if(dia.util) "util" else "do fim de semana"}")
	}
}