package com.rookie.chapter06

object TestAccess {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
    //    person.idCard    // error
    //    person.name    // error
    println(person.age)
    println(person.sex)

    person.printInfo()

    var worker: Worker = new Worker()
    //    worker = new Worker()
    //    worker.age = 23
    worker.printInfo()
  }
}
