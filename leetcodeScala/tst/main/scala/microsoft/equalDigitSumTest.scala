package main.scala.microsoft

import org.scalatest._

class equalDigitSumTest extends FlatSpec {
  
  "equalDigitSum " should " return 93 for input solution(Array(51,71,17,42)) " in {
    val tstObj = new equalDigitSum()
    assert(tstObj.solution(Array(51,71,17,42)) === 93)
  }

  it should " return 121 for input solution(Array(34,43,56,65,23,32)) " in {
    val tstObj = new equalDigitSum()
    assert(tstObj.solution(Array(34,43,56,65,23,32)) === 121)
  }
  
  it should " return 102 for input solution(Array(42,33,60)) " in {
    val tstObj = new equalDigitSum()
    assert(tstObj.solution(Array(42,34,60,23,32)) === 102)
  }

  it should " return -1 for input solution(Array(32,45,56,78,89)) " in {
    val tstObj = new equalDigitSum()
    assert(tstObj.solution(Array(32,45,56,78,89)) === -1)
  }
}
