package com.rookie.chapter05

object TestRecursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))

    //递归实现阶乘
    def fact(n: Int): Int = {
      if (n == 0)
        return 1
      fact(n - 1) * n
    }

    // 尾递归实现,这个好，可以直接覆盖栈有点类似动态规划；
    def tailFact(n: Int): Int = {
      def loop(n: Int, res: Int): Int = {
        if (n == 0)
          return res
        loop(n - 1, res * n)
      }
      loop(n, res = 1)
    }
  }
}
