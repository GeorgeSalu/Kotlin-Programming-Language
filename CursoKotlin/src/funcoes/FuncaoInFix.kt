package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.masCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
	val p1 = Produto("Ipad",2344.9)
	val p2 = Produto(preco=3.4,nome="Borracha")
	
	println(p1 masCaroQue p2)
	println(p1.masCaroQue(p2))
}