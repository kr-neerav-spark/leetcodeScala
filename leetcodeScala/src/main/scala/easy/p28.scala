package main.scala.easy

class p28 {
  def strStr(hayStack: String, needle: String): Int = {
    val needleL = needle.length

    def recursiveStrStr(hayStack: String, idx: Int): Int = {
      if (hayStack.length < needleL) -1
      else if (hayStack(0) == needle(0) && hayStack.slice(0, needleL) == needle) idx
      else recursiveStrStr(hayStack.tail, idx+1)
    }

    if (needleL == 0) -1 else recursiveStrStr(hayStack,0)
  }
}
