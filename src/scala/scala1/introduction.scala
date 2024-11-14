package scala1
import scala.annotation.tailrec


object scalaIntro1 extends App {
  //1 int
  val number: Int = 42
  //2 double
  val pi: Double = 3.14

  def printHello(): Unit = println("hello")

  // Any
  val maybeValue: Option[Int] = Some(42)
  val noValue: Option[Int] = None

  //operations
  val sum = 1 + 2

  // eqv
  val isEqual: Boolean = 1 == 1
  val isLessEqual = 2 <= 3

  // logical
  val andResult = true && false
  val orResult = true || false
  val notResult = !true

  var x = 10
  x += 5
  x -= 3

  // if else
  val a = 5
  val b = 10
  val max = if (a>b) a else b

  //cycles
  var j = 0
  do {
    print(3)
    j = j+1
  } while (j<5)


  for (i<- 1 to 5){
    println(i)
  }

  println("!!!!!!!!!")
  for (i<-1 to 10 if i% 2 == 0)
    println(i)
  println("!!!!!!!!!")

  val d = for (i<- 1 to 5) yield i*2
  println(d)


  // functions
  def add(a: Int, b:Int): Int = {
    a+b
  }

  val sum1 = add(3,5)
  println(sum1)

  def greet(): String = { "hello" }
  println(greet())
  println(greet)
}


object TailRec {
  def main(args: Array[String]): Unit = {
    val test = List("1", "2", "3")


    println(s"size is ${tailRec(test, 0)}")

  }
  @tailrec
  def tailRec(list: List[String], accum: Long): Long = list match {
    case Nil => accum
    case head :: tail => tailRec(tail, accum + 1)
  }


}
