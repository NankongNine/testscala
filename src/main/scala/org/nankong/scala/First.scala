package org.nankong.scala

object First {
  def main(args:Array[String]): Unit ={
    println("hello scala");
    for(i<-1 to 4;j<-1 to 4){
      println("i is "+i+" ,j is "+j+" and i*j is "+i*j)
    }
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1.get) // Some("value1")
    println(value2) // None
    println(muliplier(2));
  }
  var factor=3

  val muliplier =(i:Int) => i * factor

}
