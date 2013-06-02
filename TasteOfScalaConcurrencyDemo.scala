import scala.actors._
import scala.actors.Actor._

abstract class Shape(){
	def draw():Unit
}

class Point(val x:Double, val y:Double){
	override def toString() = "Point(" + x + ", " + y + ")"
}

class Circle(val center: Point, val radius:Double) extends Shape{
	def draw() = println("Circle.draw: " + this)
	override def toString() = "Circle(" + center + ", " + radius + ")"
}

class Triangle(val point1:Point, val point2:Point, val point3:Point) extends Shape{
	def draw() = println("Triangle.draw: " + this)
	override def toString() = "Triangle(" + point1 + ", " + point2 + ", " + point3 + ")"
}

object ShapeDrawingActor extends Actor{
	def act(){
		loop{
			receive{
				case s:Shape => s.draw()
				case "exit" => println("exiting..."); exit
				case x:Any => println("Error: Unknown message! " + x)
			}
		}
	}
}

ShapeDrawingActor.start()

ShapeDrawingActor ! new Circle(new Point(0.0, 0.0), 1.0)
ShapeDrawingActor ! new Triangle(new Point(0.0, 0.0),
								 new Point(2.0, 0.0),
								 new Point(0.0, 1.0))
ShapeDrawingActor ! "error?"
ShapeDrawingActor ! "exit"