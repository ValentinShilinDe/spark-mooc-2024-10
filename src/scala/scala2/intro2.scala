package scala.intro2

abstract class Animal(val name: String) {
  def makeSound(): Unit
}


class Dog(name: String) extends  Animal(name){
  def makeSound(): Unit = {
    println("gav")
  }
}

object intro2 extends App{
  val dog = new Dog("test")
  dog.makeSound()

}
