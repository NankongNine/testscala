package org.nankong.scala.test

abstract class Animal {
  def eat={
    println("everyone needs eat!")
  }
  def run
  def sleep
}
class Cat extends Animal{
  override def eat={
    println("豆包 is eating！")
  }
  override def run: Unit = {
    println("20km/h")
  }

  override def sleep: Unit = {
    println("16 hours")
  }
}
class Dog extends Animal{
  override def eat={
    super.eat
    println("傻狗 is eating！")
  }
  override def run: Unit = {
    println("20km/h")
  }

  override def sleep: Unit = {
    println("16 hours")
  }
}
