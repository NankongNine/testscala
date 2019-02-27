package org.nankong.scala.test

class LocalFunction {
  def mul(x:Int,y:Int): Unit ={
    println(111111)
    def realmul: Unit ={
      println(x,y)
    }
    realmul
  }
  def realmul: Unit ={
    println("我的本地函数")
  }
}
