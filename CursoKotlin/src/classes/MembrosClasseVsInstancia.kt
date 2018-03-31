package classes

import kotlin.jvm.JvmStatic

class ItemDePedido(val nome: String, val preco: Double) {
	
	companion object {
		fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
		@JvmStatic
		var desconto: Double = 0.0
	}
	
	fun precoComDesconto(): Double {
		return preco - preco * desconto
	}
}

fun main(args: Array<String>) {
	val Item1 = ItemDePedido.create("Tv de 50 polegadas", 2289.9)
	val Item2 = ItemDePedido.create("Liquidificador", 200.0)
	
	println(Item1.precoComDesconto())
	println(Item2.precoComDesconto())
}