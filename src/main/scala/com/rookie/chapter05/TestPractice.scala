package com.rookie.chapter05

object TestPractice {
  def main(args: Array[String]): Unit = {
    //练习 1：定义一个匿名函数，并将它作为值赋给变量 fun 。函数有三个参，类型分别为Int，String，Char，返回值为Boolean。
    //要求调用函数fun(0,",'0)得到返回值为false，其他情况均返回true。

    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(fun(0,"",'0'))
    println(fun(1,"",'8'))
    println("====================================")
    //练习 2： 定义一个函数 func，它接收一个 Int类型的参数，返回一个函数（记作f1）。
    // 它返回的函数f1，接收一个String类型的参数，同样返回一个函数（记作 f2）。
    // 函数 f2接收一个Char类型的参数，返回一个Boolean的值。
    //要求调用函数func(0)("")('0')得到返回值为false ，其它情况均返回true 。
    def func(i: Int): String=>(Char=>Boolean) ={
      def f1(s: String): Char=>Boolean ={
        def f2(c: Char): Boolean ={
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))
    println(func(0)("")('2'))
    println("**************************************")

    //匿名函数改写
    def func1(i: Int): String=>(Char=>Boolean) ={
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    println(func1(0)("")('0'))
    println(func1(0)("")('2'))
    println("###################")
    //函数柯里化
    def func2(i: Int)(s: String)(c: Char) = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(0)("")('2'))
  }
}
