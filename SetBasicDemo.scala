var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"    //return a new Set because Set is immutable
println(jetSet.contains("Cessna"))
println(jetSet.getClass())

val jetSet2 = scala.collection.mutable.Set("Boeing", "Airbus")
jetSet2 += "Lear"  // add element to Set because Set is mutable
println(jetSet2.contains("Lear"))
println(jetSet2.getClass())

val treasureMap = scala.collection.mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))
println(treasureMap.getClass())

var treasureMap2 = Map[Int, String]()
treasureMap2 += (1 -> "Go to island.")
treasureMap2 += (2 -> "Find big X on ground.")
treasureMap2 += (3 -> "Dig.")
println(treasureMap2(2))
println(treasureMap2.getClass()) 

