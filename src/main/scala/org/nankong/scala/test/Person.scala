package org.nankong.scala.test

class Person {
  private var name=""
  var age=0

  def this(name:String){
    this
    this.name = name;
    println(name+" age is "+age)
  }
  def this(age:Int){
    this
  this.age = age
    println(name+" age is "+age)
}
  def myname_=(newName:String){
    this.name=newName;
  }
  def myname =this.name
  def getAge=age
}
