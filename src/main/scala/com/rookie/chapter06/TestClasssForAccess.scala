package com.rookie.chapter06

object TestClassForAccess {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
    println(person.age)
    println(person.age)
    person.printInfo()

    val worker:Worker = new Worker()
    worker.printInfo()
  }
}
// 定义一个子类
class Worker extends Person{
  override def printInfo(): Unit = {
    println("Worker: ")
    name = "bo"
    age = 25
    sex = "female"
    println(s"Worker: $name $sex $age")

  }
}
// 定义一个父类
class Person{
  private var idCard: String = "3689435"
  protected var name: String = "rookie"
  var sex: String = "female"
  private [chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person: $idCard $name $sex $age")
  }
}
