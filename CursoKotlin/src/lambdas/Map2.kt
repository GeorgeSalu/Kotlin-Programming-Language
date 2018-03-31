package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
		Produto("fichario escola", 21.90),
		Produto("Lapis de cor", 11.90),
		Produto("Borracha bicolor", 0.90),
		Produto("apontador com deposito", 1.90)
)

fun main(args: Array<String>) {
	val totalizar = {total: Double, atual: Double -> total + atual}
	val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)
	
	println("O preco medio é ${precoTotal / materialEscolar.size}")
}