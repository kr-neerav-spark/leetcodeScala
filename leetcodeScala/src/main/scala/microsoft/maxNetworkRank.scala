package main.scala.microsoft

import scala.collection.mutable

class maxNetworkRank {
  var cityRank = mutable.Map[Int, Int]()
  def maxNetworkRankCalc(A: Array[Int], B: Array[Int], N: Int): Int = {
    cityRank=mutable.Map[Int,Int]()
    A.foreach(updateCityRank(_))
    B.foreach(updateCityRank(_))
    (A zip B).map(x => cityRank(x._1) + cityRank(x._2)).max -1
  }

  def updateCityRank(city: Int): Unit = {
    val rank = cityRank.getOrElse(city,0)
    cityRank.update(city, rank+1)
  }
}
