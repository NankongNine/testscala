package org.nankong.scala.test

object Function_Test {
  def func1(n:Int):Int={
    val myFunc = (i:Int,x:Int)=>i*x
    myFunc(n,2)
  }
  //将函数体作为参数，参数类型Int返回值是Int
  def func2(x:Int=>Int)=x
  //高阶函数
  def func3(f:(Int,Int)=>Int)=f
  //匿名函数应用
  def func4=(x:Int)=>x+1
  //匿名函数
  def func5(x:Int): Int={
    if(x<1)
      x
    else
      x*func5(x-1)
  }
  //函数字面量的多个占位符使用
  val func6 = (_:Int)+(_:Int)

  def func7(a:Int,b:Int,c:Int)=a+b+c

  val func8=func7 _

  //偏函数
  val func9 =func7(1,_:Int,3)
  //定义函数闭包
  def func10(x:Int)=(y:Int)=>x+y
  //定义重复参数函数
  def func11(args:Int *)={
    for(arg<-args)
      println(arg)
  }
  def hello1(m:Int)=m
  def hello2(m:Int,n:Int)=m*n
  def main(args:Array[String])={
    println("func1test:"+func1(78))
    println("func2test:"+func2(hello1)(2))
    println("func3test:"+func3(hello2)(2,3))
    println("func4test:"+func4(3))
    println("func5test:"+func5(5))
    println("func6test:"+func6(3,6))
    println("func8test:"+func8(3,6,9))
    println("func9test:"+func9(3))
    println("func10test:"+func10(3)(2))

  }

}
