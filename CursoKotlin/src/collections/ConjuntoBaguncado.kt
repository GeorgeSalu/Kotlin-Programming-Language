package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
	val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)
	
	conjunto.add(3).print()
	conjunto.add(10).print()
	
	conjunto.size.print()
	
	conjunto.remove("a").print()
	conjunto.remove('a').print()
	
	val nums = setOf(1, 2, 3) //somente leitura
	
	(conjunto + nums).print()
	(conjunto - nums).print()
		
}