package classes

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro) {
	carro.velocidade++
}

fun main(args: Array<String>) {
	var carro1 = Carro("Ford", "Fusion")
	
	var carro2 = carro1
	carro2.modelo = "Edge"
	println(carro1)
}