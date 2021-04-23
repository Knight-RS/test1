package com.rookie.chapter05

object TestLazy {
  def main(args: Array[String]): Unit = {
    lazy val res: Int = sum(12, 44)

    println("1. 函数调用")
    println("2. res = " + res)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用")
    a + b
  }
}
