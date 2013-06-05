class Rational(n : Int, d : Int) {
	
	require(d != 0)
	//greatest common divisor
	private val g = gcd(n.abs, d.abs)
	val number: Int = n / g
	val denom:  Int = d / g
	
	def this(n: Int) = this(n, 1)
	
	override def toString = n + "/" + d
	
	private def gcd(a:Int, b:Int) : Int = if (b == 0) a else gcd(b, a % b)
	
	def + (that : Rational) : Rational = new Rational(
			number * that.denom + that.number * denom,
			denom * that.denom)
			
	def + (i : Int) : Rational = new Rational(i * denom + number, denom )

	def * (that: Rational) :Rational = new Rational(
			number * that.number , denom * that.denom) 
			
	def * (i : Int) : Rational = new Rational(number * i, denom)
}

implicit def intToRational (i : Int) : Rational = new Rational(i)
	
val r = new Rational(2, 3)
println(2 * r)
println(r * 2)