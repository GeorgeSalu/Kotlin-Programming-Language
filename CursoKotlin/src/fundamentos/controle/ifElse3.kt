package fundamentos.controle

fun main(args: Array<String>) {
	
	val nota: Double = 9.3
	
	//usando operador range
	if(nota in 9..10) {
		println("Fantastico")
	} else if(nota in 7..8) {
		println("Parabens")
	} else if(nota in 4..6) {
		println("Tem com recuperar")
	} else if (nota in 0..3) {
		println("Te vejo no proximo sementre")
	} else {
		println("Nota invalida")
	}
	
}