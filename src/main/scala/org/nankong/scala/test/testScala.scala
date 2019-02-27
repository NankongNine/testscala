package org.nankong.scala.test

object testScala {
  def main(args:Array[String]): Unit ={
    val hiScala = new HiScala;
    hiScala.say();
    println("println "+hiScala.getName)
    println("----------------Person Class----------------")
    val person = new Person
    person.getAge
    println(person.myname)
    person.myname = "nankong"
    println(person.myname)

    val person1 = new Person(10)
    person1.getAge
    println("----------------Animal Class----------------")
    val cat = new Cat
    val dog = new Dog
    cat.eat
    cat.run
    cat.sleep
    dog.eat
    dog.run
    dog.sleep
    println("----------------apply and unapply----------------")
    println("apply method "+apply("nankong","lanling"))
    println("unapply method "+unapply("diwu@nan"))
    println("unapplay method "+unapply("weilielu"))
    println("----------------curring function----------------")
    val step1=funCurring(3)
    val step2=step1(3)
    val step3=step2(5)
    println(step3);
    println("----------------local functions----------------")
    val lf = new LocalFunction;
    lf.mul(3,6);
    println("----------------location mark----------------")
    val list = List(1,2,3,4,5)
    val list2 =list.filter(x=>x>3)
    list2.foreach(x=>println(x))

  }

  /**
    * apply函数
    * @param user
    * @param domain
    * @return
    */
  def apply(user:String,domain:String) ={
     user+"@"+domain
  }

  /**
    * unapply函数
    * @param str
    * @return
    */
  def unapply(str: String): Option[(String,String)] ={
    val parts = str.split("@")
    if(parts.length==2)
      Some(parts(0),parts(1))
    else
      None
  }

  /**
    * 函数curring
    * @param x
    * @return
    */
  def funCurring(x:Int)=(y:Int)=>(z:Int)=>x*y+z
  def merge(x:Int,y:Int,z:Int)=x+y+z

}
