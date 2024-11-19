package scala.intro4


class Person(val name: String, val age: Int){
  def greet(): String = s"hi, i am ${name} and i am $age years old"
}

object Person{
  def apply(name: String, age: Int): Person = new Person(name, age)
}

object Main extends App{
  val person = Person("Alice", 30)

  println(person.age)
  println(person.greet())
}



class MyClass(val name: String) {
  def apply(suffix: String): String = s"$name$suffix"
}

object MyClass {
  def apply(name: String): MyClass = new MyClass(name)
}


object Main1 extends App {
  val inst = MyClass("hello") // из обьекта компаньена
  println(inst("World")) // из экземпляра класса
}
