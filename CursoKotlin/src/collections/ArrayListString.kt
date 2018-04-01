package collections

fun main(args: Array<String>) {
	val strings = arrayListOf("carro", "moto", "barco", "aviao")
	
	for(item in strings) {
		println(item.toUpperCase())
	}
	
}