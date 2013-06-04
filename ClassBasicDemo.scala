//scala version 2.10.1
import scala.collection.mutable.Map

class ClassBasicDemo(value : String){
	def f() { "the String is lost" }
	def g() = "the String is returned"
	def h() = { "the String is returned too" }
	
	def print_value() = println(value)
}

object ClassBasicDemo extends App{
	
	private val cache = Map[String, Demo]()
	
	def apply(value : String) : Demo = {
		if(cache.contains(value))
			cache(value)
		else{
			val demo = new Demo(value)
			cache += (value -> demo)
			demo
		}
	}
	
	val demo = ClassBasicDemo("Test")
	demo.print_value()
	
//	def main(args : Array[String]){
//		val demo = ClassBasicDemo("Test")
//		demo.print_value()
//	}
}
