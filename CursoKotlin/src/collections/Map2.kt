package collections

fun main(args: Array<String>) {
	val map = hashMapOf(1 to "gui", 2 to "rebeca", 3 to "cibalena")
	
	for((id, nome) in map) {
		println("$id $nome")
	}
	
}