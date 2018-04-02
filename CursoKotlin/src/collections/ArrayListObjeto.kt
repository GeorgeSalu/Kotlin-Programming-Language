package collections

data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
	var frutas = arrayListOf(Fruta("banana", 1.50),Fruta("morango", 1.50))
	
	for(fruta in frutas) {
		println("${fruta.nome} - ${fruta.preco}")
	}
	
	println(frutas.contains(Fruta("banana", 1.50)))
	println(frutas.distinctBy { it.preco })
	frutas.add(Fruta("banana", 1.50))
	
}