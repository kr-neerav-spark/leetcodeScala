package main.scala.easy

import org.scalatest._

class p9Test extends FlatSpec {
  val tstObj = new p9()

  "p9 " should " return false for isPalindrome(-45) " in {
    assert(tstObj.isPalindrome(-45) === false)
  }

  it should " return true for isPalindrome(3443) " in {
    assert(tstObj.isPalindrome(3443) === true)
  }

  it should " return false for isPalindrome(100) " in {
    assert(tstObj.isPalindrome(100) === false)
  }
}
