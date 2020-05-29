package main.scala

import org.scalatest._

class p13Test extends FlatSpec {
  val tstObj = new p13()
  "p13 " should " return 3 for input romanToInt('III') " in {
    assert(tstObj.romanToInt("III") === 3)
  }

  it should " return 59 for input romanToInt('LIX') " in {
    assert(tstObj.romanToInt("LIX") === 59)
  }

  it should " return 1994 for input parameters romanToInt('MCMXCIV') " in {
    assert(tstObj.romanToInt("MCMXCIV") === 1994)
  }

  it should " return 1300 for input parameters romanToInt('CMCD') " in {
    assert(tstObj.romanToInt("CMCD") === 1300)
  }

  it should " return 130 for input parameters romanToInt('XCXL') " in {
    assert(tstObj.romanToInt("XCXL") === 130)
  }

  it should " return 13 for input parameters romanToInt('IXIV') " in {
    assert(tstObj.romanToInt("IXIV") === 13)
  }
}
