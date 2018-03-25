package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
	val filme = Filme2("Monstros sa", 2018, "Comedia")
	println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}