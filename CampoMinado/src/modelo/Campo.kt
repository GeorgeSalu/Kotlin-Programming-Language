package modelo

enum class CampoEvento {ABERTO, MARCACAO, DESMARCADO, EXPLOSAO, REINICIALIZACAO}

data class Campo(val linha: Int, val coluna: Int) {
	private val vizinhos = ArrayList<Campo>()
	private val callback = ArrayList<(Campo, CampoEvento) -> Unit>()
	
	var marcado: Boolean = false
	var aberto: Boolean = false
	var minado: Boolean = false
	
	//somente leitura
	val desmarcado: Boolean get() = !marcado
	val fechado: Boolean get() = !aberto
	val seguro: Boolean get() = !minado
	val objetivoAlcancado: Boolean get() = seguro && aberto || minado && marcado
	val qtdeVizinhosMinados: Int get() = vizinhos.filter { it.minado }.size
}