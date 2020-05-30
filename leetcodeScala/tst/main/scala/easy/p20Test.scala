package main.scala.easy

import org.scalatest._

class p20Test extends FlatSpec {
  val tstObj = new p20()

  "p20 " should " return true for input isValid('()') " in {
    assert(tstObj.isValid("()") === true)
  }

  it should " return true for input isValid('(){}[]') " in {
    assert(tstObj.isValid("(){}[]") === true)
  }

  it should " return false for input isValid('(]') " in {
    assert(tstObj.isValid("(]") === false)
  }

  it should " return false for input isValid('([)]') " in {
    assert(tstObj.isValid("([)]") === false)
  }

  it should " return true for input isValid('{[]}') " in {
    assert(tstObj.isValid("{[]}") === true)
  }

  it should " return true for input isValid('') " in {
    assert(tstObj.isValid("") === true)
  }

  it should " return false for input isValid('[{(') " in {
    assert(tstObj.isValid("[{(") === false)
  }

  it should " return false for input isValid('])}') " in {
    assert(tstObj.isValid("])}") === false)
  }
}
