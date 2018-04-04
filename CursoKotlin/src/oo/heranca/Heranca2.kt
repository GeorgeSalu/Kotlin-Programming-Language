package oo.heranca

open class Animal(val nome: String)

class Cachorro : Animal {
	private val altura: Double
	
	constructor(nome: String, altura: Double): super(nome) {
		this.altura = altura
	}
	
	constructor(nome: String): this(nome, 0.0)
	
	override fun toString(): String = "$nome tem $altura com de altura"
}

fun main(args: Array<String>) {
	val dogAlemao = Cachorro("skype", 82.3)
	val dog = Cachorro("skype")

	println(dogAlemao)
	println(dog)
}