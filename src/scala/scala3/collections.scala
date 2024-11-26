package scala.scala3

import scala.collection.immutable

object collections {
  def main(args: Array[String]): Unit = {
    val democollection1 = "line 1" :: "line 2" :: "line 3" :: Nil
    val democollection2 = List("line 1", "line 2", "line 3")
    val demoSet = ("line 1" :: "line 2" :: "line 2" :: "line 3" :: Nil).toSet
    demoSet.foreach(x => println(x))

    ("line 1" :: "line 2" :: "line 2" :: "line 3" :: Nil).groupBy(x=>x).map(x=>x._1).foreach(x => println(x))

    case class testcaseclass(x: String, y: Int)
    val test1 = testcaseclass("1", 1)
    val test2 = testcaseclass("2", 2)
    val test3 = testcaseclass("3", 2)
    val test4 = testcaseclass("4", 2)
    println("---------------")
    (test1 :: test2 :: test3 :: test4 :: Nil).groupBy(x => x.y).map(x => x._2.head).foreach(u => println(u))
    println("---------------")

    val test = List(1,2,3,4,5) :: List(1,50,3) :: List(1,2) :: Nil
    test.filter(x=>x.sum > 10).foreach(x=>println(x.mkString(",")))





  }
}