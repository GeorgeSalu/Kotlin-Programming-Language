package collections

fun main(args: Array<String>) {
	var map = HashMap<Long, String>()
	
	map.put(11111, "joao")
	map.put(11231, "maria")
	map.put(133333, "pedro")
	map.put(112332, "pedro")
	
	for(par in map) {
		println(par)
	}
	
	for(nome in map.values) {
		println(nome)
	}
	
	for(cpf in map.keys) {
		println(cpf)
	}
	
	for((cpf, nome) in map) {
		println("$nome (CPF: $cpf)")
	}
	
}