package fundamentos.operadores

fun obterResultado(nota: Double): String{
	return if(nota >= 7) "Passo" else "reprovou"
}

fun main(args: Array<String>) {
	println(obterResultado(8.2))
}