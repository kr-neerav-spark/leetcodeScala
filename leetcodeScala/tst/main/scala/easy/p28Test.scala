package main.scala.easy

import org.scalatest._

class p28Test extends FlatSpec {
  val tstObj = new p28()

  " p28 " should " return 2 for input strStr('hello','ll') " in {
    assert(tstObj.strStr("hello","ll") === 2)
  }
  
  it should " return -1 for input strStr('aaaaa','bba') " in {
    assert(tstObj.strStr("aaaaa","bba") === -1)
  }

  it should " return -1 for input strStr('abc','') " in {
    assert(tstObj.strStr("abc","") === -1)
  }

  it should " return -1 for input strStr('','abc') " in {
    assert(tstObj.strStr("","abc") === -1)
  }
}
