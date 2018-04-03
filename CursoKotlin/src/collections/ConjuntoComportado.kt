package collections

fun main(args: Array<String>) {
	val aprovados = hashSetOf("joao", "maria", "pedro", "ana", "joana")
	
	println("sem ordem ....")
	for(aprovado in aprovados) {
		aprovado.print()
	}
	
	val aprovadosNaOrdem1 = linkedSetOf("joao", "maria", "pedro", "ana", "joana")
	println("\n Linked")
	for(aprovado in aprovadosNaOrdem1) {
		aprovado.print()
	}
	
	val aprovadoNaOrdem2 = sortedSetOf("joao", "maria", "pedro", "ana", "joana")
	
	println("\n Sorted")
	for(aprovado in aprovadoNaOrdem2) {
		aprovado.print()
	}
	
}