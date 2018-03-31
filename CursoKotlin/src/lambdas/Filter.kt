package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
	val alunos = arrayListOf(
				Aluno("pedro", 7.4),
				Aluno("arthur", 8.0),
				Aluno("rafael", 9.4),
				Aluno("pedro", 5.7)
	)
	
	val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
	
	println(aprovados)
}