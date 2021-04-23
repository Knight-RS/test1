package com.rookie.chapter05

object TestClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1.考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2.扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }
  }

  // 3.将固定加数作为另一个参数传入，但是是作为“第一层参数”
  def addByFour1(): Int=>Int = {
    val a = 4
    def addB(b: Int): Int = {
      a + b
    }
    addB
  }

  def addByA(a: Int): Int=>Int = {
    def addB(b: Int): Int = {
      a + b
    }
    addB
  }

  def addByA1(a: Int): Int=>Int = {
    (b: Int) => {
      a + b
    }
  }

  def addByA2(a: Int): Int=>Int = {
    b => a + b
  }

  def addByA3(a: Int): Int=>Int = {
    a + _
  }

  println(addByA(33)(21))
  println(addByA1(33)(21))
  println(addByA2(33)(21))
  println(addByA3(33)(21))

  // 5.柯里化
  def addCurrying(a: Int)(b: Int): Int = {
    a + b
  }
  println(addCurrying(33)(41))
}
