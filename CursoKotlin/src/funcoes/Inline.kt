package funcoes

inline fun transacao(funcao: () -> Unit) {
	println("Abrindo transacao....")
	try{
		funcao()
	} finally {
		println("fechando a transacao")
	}
}

fun main(args: Array<String>) {
	transacao() {
		println("executanco sql 1....")
		println("executanco sql 2....")
		println("executanco sql 3....")
	}
}