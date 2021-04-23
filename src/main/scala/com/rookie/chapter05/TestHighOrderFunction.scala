package com.rookie.chapter05

object TestHighOrderFunction {
  def main(args: Array[String]): Unit = {
//    def f(n : Int): Int = {
//      println("f调用")
//      return n + 1
//    }
//
//    def fun(): Int = {
//      println("f调用")
//      return 1
//    }
//
//    val res: Int = f(123)
//    println(res)
//
//    fun()
//    val f3 = fun()
//    println(f3)
//    //1.函数作为值传递；
//    val f1: Int=>Int = f
//    val f2 = f _
//
//    println(f1)
//    println(f1(12))
//    println(f2)
//    println(f2(17))
//
//    //2.函数作为参数传递
//    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
//      op(a, b)
//    }
//
//    def add(a: Int, b: Int): Int = {
//      a + b
//    }
//
//    println(dualEval(add,12,35))
//    println(dualEval((a, b) => a + b, 12, 35))
//    println(dualEval(_ + _ ,12, 35))

    //3.函数作为函数返回值返回
    def f5(): Int=>Unit ={
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      return f6
    }
    println(f5()(25))
  }
}
