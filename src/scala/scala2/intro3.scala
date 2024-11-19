package scala.intro3


class Animal(val name: String, val age: Int){
  def makeSound(): Unit = {
    println("generic sound")
  }
}

class Dog(name: String, age: Int, color: String) extends Animal(name, age){
  override def makeSound(): Unit = {
    println("Gav")
  }
}

class Cat(name: String, age: Int, color: String) extends Animal(name, age){
  override def makeSound(): Unit = {
    println("Mav")
  }
}


object intro3 extends App {
  val dog = new Dog("test", 1, "red")
  val cat = new Cat("test", 1, "red")

  val animals: List[Animal] = List(dog, cat)

  val animalsAnyType: List[Any] = List(dog, cat)

}
