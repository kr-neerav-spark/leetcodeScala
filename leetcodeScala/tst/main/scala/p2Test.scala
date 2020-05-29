package main.scala

import org.scalatest._

class p2Test extends FlatSpec {
  val tstObj = new p2()
  "p2 " should " return -21 for arguments reverse(-120) " in {
    assert(tstObj.reverse(-120) === -21)
  }

  it should " return 25 for arguments reverse(520) " in {
    assert(tstObj.reverse(520) === 25)
  }

  it should " return 123 for arguments reverse(321) " in {
    assert(tstObj.reverse(321) === 123)
  }

  it should " return 0 for arguments reverse(2147483647) "  in {
    assert(tstObj.reverse(2147483647) === 0)
  }
}
