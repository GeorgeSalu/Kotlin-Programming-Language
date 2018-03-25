package classes

class Cliente2 {
	
	constructor(nome: String) {
		this.nome = nome
	}
	
	var nome: String
		get() = "Meu nome � ${field}"
		set(value) {
			field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"
		}
}

fun main(args: Array<String>) {
	val c1 = Cliente2("")
	println(c1.nome)
}