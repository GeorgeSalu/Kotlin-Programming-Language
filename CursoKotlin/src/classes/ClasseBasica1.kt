package classes

class Cliente {
	var nome: String = ""
}

fun main(args: Array<String>) {
	val cliente = Cliente()
	cliente.nome = "Joao"
	
	println("O cliente é ${cliente.nome}")
}