package scala.pickling.binary.vector.person

import org.scalatest.FunSuite
import scala.pickling._, scala.pickling.Defaults._, binary._
import static._

case class Person(name: String)

class VectorPersonBinaryTest extends FunSuite {
  test("main") {
    val pickle = Vector(Person("A"), Person("B"), Person("C")).pickle
    assert(pickle.unpickle[Vector[Person]] === Vector(Person("A"), Person("B"), Person("C")))
  }
}
