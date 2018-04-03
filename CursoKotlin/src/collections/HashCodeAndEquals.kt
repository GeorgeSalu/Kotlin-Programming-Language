package collections

class Objeto(val nome: String, val descricao: String) {
	override fun hashCode(): Int {
		return nome.length
	}
	
	override fun equals(other: Any?): Boolean {
		if(other is Objeto) {
			return nome.equals(other.nome, ignoreCase = true)
		} else {
			return false
		}
	}
}

fun main(args: Array<String>) {
	val conjunto = hashSetOf(
			Objeto("cadeira", "...."),
			Objeto("mesa", "...."),
			Objeto("faca", "....")
	)
	
	conjunto.contains(Objeto("cadeira", "....")).print()
	
}