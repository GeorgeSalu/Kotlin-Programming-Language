package collections

fun main(args: Array<String>) {
	val alunos = arrayListOf("amanda","andre","bernado","carlos")
	
	for(aluno in alunos) {
		println(aluno)
	}
	
	for((indice, aluno) in alunos.withIndex() ) {
		println("${indice + 1} - $aluno")
	}
	
}