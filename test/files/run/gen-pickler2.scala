import scala.pickling._
import json._

class Person(val name: String, val age: Int)
class Philipp(val nationality: String, val weird: Boolean, val mother: Person)

object Test extends App {
  val pickler = genPickler[Person]
  val pickle = pickler.pickle(new Person("Bob",83))
  println(pickle.value)
}