package main.scala.easy

import org.scalatest._

class p1Test extends FlatSpec {
  val tstObj = new p1()
  "p1 " should " return Array(3,4) for arguments twoSum(Array(1,2,3,5,8,9),13) " in {
    assert(tstObj.twoSum(Array(1,2,3,5,8,9),13) === Array(3,4))
  }

  it should " return Array(2,3) for arguments twoSum(Array(2,3,1,5,7), 6) " in {
    assert(tstObj.twoSum(Array(2,3,1,5,7),6) === Array(2,3))
  }
}
