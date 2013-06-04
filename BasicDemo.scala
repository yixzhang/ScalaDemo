def upCase(s: String) : String = { if(s.length == 0) return s; else s.toUpperCase() }
println(upCase("It's an exmape"))

def joiner(strings : List[String], separator : String = " ") : String = strings.mkString(separator)
val sentances = joiner(List("it's", "an", "example"))
println(sentances)

def toCollection(string : String) : Seq[String] = string.split(' ')
toCollection(sentances).foreach{ x => println(x)}