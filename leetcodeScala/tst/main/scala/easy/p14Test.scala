package main.scala.easy

import org.scalatest._

class p14Test extends FlatSpec {
  val tstObj = new p14()

  "p14 " should " return 'flower' for input longestCommonPrefix(Array('flower','flower','flower')) " in {
    assert(tstObj.longestCommonPrefix(Array("flower","flower","flower")) === "flower")
  }

  it should " return '' for input longestCommonPrefix(Array('flower','Flower')) " in {
    assert(tstObj.longestCommonPrefix(Array("flower","Flower")) === "")
  }

  it should " return '' for input longestCommonPrefix(Array('dog','racecar','car')) " in {
    assert(tstObj.longestCommonPrefix(Array("dog","racecar","car")) === "")
  }

  it should " return '' for input longestCommonPrefix(Array('flower','flower','')) " in {
    assert(tstObj.longestCommonPrefix(Array("flower","flower","")) === "")
  }

  it should "return 'fl' for input longestCommonPrefix(Array('flower','flow','flight')) " in {
    assert(tstObj.longestCommonPrefix(Array("flower","flow","flight")) === "fl")
  }
}
