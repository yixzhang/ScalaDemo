def upper1(strings: String*): Seq[String] = strings.map((s:String) => s.toUpperCase())
def upper2(strings: String*): Seq[String] = strings.map(_.toUpperCase())

println(upper1("It", "is", "an", "example", "to", "let you", "have a taste of Scala"))
println(upper2("It", "is", "an", "example", "to", "let you", "have a taste of Scala"))

def upper3(strings :String*) = strings.map(_.toUpperCase()).foreach(printf("%s ", _))
upper3("It", "is", "an", "example", "to", "let you", "have a taste of Scala")


