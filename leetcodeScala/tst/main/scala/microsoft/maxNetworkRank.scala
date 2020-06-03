package main.scala.microsoft

import org.scalatest._

class maxNetworkRankTest extends FlatSpec {
  val tstObj = new maxNetworkRank()
  
  "maxNetworkRank " should " return 4 for input maxNetworkRankCalc(Array(1,2,3,3), Array(2,3,1,4), 4) " in {
    assert(tstObj.maxNetworkRankCalc(Array(1,2,3,3), Array(2,3,1,4), 4) === 4)
  }

  it should " return 5 for input maxNetworkRankCalc(Array(1,2,3,3,4), Array(2,3,1,4,4), 4) " in {
    assert(tstObj.maxNetworkRankCalc(Array(1,2,3,3,4), Array(2,3,1,4,4), 4) === 5)
  }
}
