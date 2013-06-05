val filesHere = (new java.io.File(".")).listFiles
println("Files in Current Directory:")
for(file <- filesHere)
	println(file)

println("\nScala Files in Current Directory:")	
for(file <- filesHere if file.isFile if file.getName.endsWith(".scala"))
	println(file)
	
def fileLines(file: java.io.File) = 
	scala.io.Source.fromFile(file).getLines.toList

def grep(pattern: String) = 
	for(
		file <- (new java.io.File(".")).listFiles
		if file.getName.endsWith(".scala");
		line <- fileLines(file)
		if line.trim.matches(pattern)
	) println(file + ":" + line.trim)

println("\nGrep:")	
grep(".*gcd.*")

println("\nYield collections")
val scalaFiles = for(
	file <- (new java.io.File(".")).listFiles 
	if file.getName.endsWith(".scala")) yield file
println(scalaFiles.mkString("\n"))