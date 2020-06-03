package main.scala.microsoft

import scala.collection.mutable

class equalDigitSum() {
  val groups = mutable.Map[Int, List[Int]]()
  def solution(inpt: Array[Int]): Int = {
    //build the groups map
    inpt.foreach(x => addKeyVal(digitSum(x), x))
    //after creating the map convert it into immutable map
    val immutableGroups=groups.toMap
    val out = immutableGroups.values.filter(_.length>1).map(_.sorted.takeRight(2).sum).maxOption
    if (out == None) -1 else out.get
  }

  // find the sum of digits in the number
  def digitSum(elem: Int): Int = {
    var dsum=0
    var tmp=elem
    while (tmp>0) {
      dsum+=tmp%10
      tmp=tmp/10
    }
    dsum
  }

  // add key,value pair to the group
  // append to the list of values if already present
  def addKeyVal(k: Int, v: Int): Unit = {
    val x = groups.getOrElse(k, List())
    groups.update(k, x.appended(v))
  }
}
