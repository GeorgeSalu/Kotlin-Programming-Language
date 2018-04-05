package oo.polimorfismo

class Feijao1(val peso: Double)
class Arroz1(val peso: Double)

class Pessoa1(var peso: Double) {
	fun comer(feijao: Feijao) {
		peso += feijao.peso
	}
	
	fun comer(arroz: Arroz) {
		peso += arroz.peso
	}
}

fun main(args: Array<String>) {
	val feijao = Feijao(0.3)
	val arroz = Arroz(0.2)
	
	val joao = Pessoa(0.1)
	joao.comer(feijao)
	joao.comer(arroz)
	
	println(joao.peso)
}
		