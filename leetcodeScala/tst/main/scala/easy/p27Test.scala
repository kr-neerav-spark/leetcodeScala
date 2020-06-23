package main.scala.easy

import org.scalatest._

class p27Test extends FlatSpec {
  val tstObj = new p27()

  " p27 " should " return 2 for input removeElement(Array(3,2,2,3),3) " in {
    assert(tstObj.removeElement(Array(3,2,2,3),3) === 2)
  }

  it should " return 5 for input removeElement(Array(0,1,2,2,3,0,4,2), 2) " in {
    assert(tstObj.removeElement(Array(0,1,2,2,3,0,4,2),2) === 5)
  }

  it should " return 0 for input removeElement(Array(2,2,2,2,2,2), 2) " in {
    assert(tstObj.removeElement(Array(2,2,2,2,2,2),2) ===0)
  }

  it should " return 0 for input removeElement(Array(),0) " in {
    assert(tstObj.removeElement(Array(),0) === 0)
  }

  it should " return 5 for input removeElement(Array(1,2,3,4,5),6) " in {
    assert(tstObj.removeElement(Array(1,2,3,4,5),6) === 5)
  }
}
