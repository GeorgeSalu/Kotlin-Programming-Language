package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
	val inativo: Boolean get() = !ativo
	val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
	val p1 = Produto("Ipad", 22333.9, 0.20, ativo=true)
	println(p1.precoComDesconto)
	
	val p2 = Produto("Galaxy Note 7", 22333.9, 0.20, ativo=false)
	println("${p2.nome} De : ${p2.preco}  Por : R$ ${p2.precoComDesconto}")
	
	if(p2.inativo) {
		p2.preco = 0.0
		println("Depois de inativo : R$ ${p2.precoComDesconto}")
	}
	
}