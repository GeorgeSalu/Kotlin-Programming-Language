package classes

import kotlin.jvm.JvmStatic

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
	val local = "Fulano"
	println("$diretamenteNoArquivo $local")
}

class Coisa {
	var variavelDeInstancia: String = "Boa noite"
	
	companion object {
		@JvmStatic val contanteDeClasse = "Ciclano"
	}
	
	fun fazer() {
		val local: Int = 7
		
		if(local > 3) {
			val variavelDeBloco = "Beltrano"
			println("$variavelDeInstancia, $local, e $variavelDeBloco")
		}
	}
	
}

fun main(args: Array<String>) {
	topLevel()
	Coisa().fazer()
	println(Coisa.contanteDeClasse)
}


