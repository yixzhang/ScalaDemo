def print_info(message:String, results: Any*) = {
	println(message)
	results.foreach(s => println(s))
	println("")
}

val oneTwo = List(1, 2)
val threeFour = List(3, 4)

//Concatenation
val oneTwoThreeFour = oneTwo:::threeFour
print_info("Concatenation:", oneTwoThreeFour)

//Cons: prepends a new element to the beginning of a list
val twoThree = List(2, 3)
val oneTwoThree = 1::twoThree
print_info("Cons:", oneTwoThree)

//2 methods to create a new list
val list1 = List("Cool", "Tools", ":", "Scala")
val list2 = "Cool"::"Tools"::Nil

//get element
print_info("get Element:", list1(2))  //=> :

//exists
print_info("exists:", 
	       list1.exists(s => s == "Tools"),  //true
	       list1.exists(s => s == "^"))   //false

//filter
print_info("filter:", list1.filter(s => s.length == 4))

//for all
print_info("for all:", list1.forall(s => s.endsWith("a")))

//for each
print_info("for each:")
list1.foreach(s => println(s))

//init
print_info("Init:", list1.init)

//map
print_info("map:", list1.map(s => s + " Great"))

//mkString
print_info("mkString:", list1.mkString(" "))

//reverse
print_info("reverse", list1.reverse)

//sort
//print_info("sort:", list1.sort((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))




