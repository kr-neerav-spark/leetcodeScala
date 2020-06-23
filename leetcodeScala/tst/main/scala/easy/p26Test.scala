package main.scala.easy

import org.scalatest._

class p26Test extends FlatSpec {
  val tstObj = new p26()

  " p26 " should " return 2 for input removeDuplicates(Array(1,1,2)) " in {
    assert(tstObj.removeDuplicates(Array(1,1,2)) === 2)
  }

  it should " return 5 for input removeDuplicates(Array(0,0,1,1,1,2,2,3,3,4)) " in {
    assert(tstObj.removeDuplicates(Array(0,0,1,1,1,2,2,3,3,4)) === 5)
  }

  it should " return 5 for input removeDuplicates(Array(0,1,2,3,4)) " in {
    assert(tstObj.removeDuplicates(Array(0,1,2,3,4)) === 5)
  }

  it should " return 1 for input removeDuplicates(Array(3,3,3,3,3,3,3,3)) " in {
    assert(tstObj.removeDuplicates(Array(3,3,3,3,3,3,3,3)) === 1)
  }

  it should " return 1 for input removeDuplicates(Array(5)) " in {
    assert(tstObj.removeDuplicates(Array(5)) === 1)
  }

  it should " return 0 for input removeDuplicates(Array()) " in {
    assert(tstObj.removeDuplicates(Array()) === 0)
  }
}
