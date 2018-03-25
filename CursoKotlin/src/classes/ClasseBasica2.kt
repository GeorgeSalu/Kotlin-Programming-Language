package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(nomeInicial: String) {
	val nome: String = nomeInicial
}

fun main(args: Array<String>) {
	val p1 = Pessoa1(nome="joao")
	p1.nome = "guilherme"
	println("${p1.nome} sabe programar")
	
	val p2 = Pessoa2(nome="Maria")
	val p3 = Pessoa3(nomeInicial="Pedro")
	
	println("${p2.nome} e ${p3.nome} sao legais")
	
}