package main.scala.easy

class p9 {
  def isPalindrome(x: Int): Boolean = {
    // if number is negative return false
    if (x<0) false else x == recursiveReverse(x,0)
  }
  // recursive function to find the reverse of the number
  def recursiveReverse(inpt: Int, rev: Int): Int = {
    var r = inpt%10
    inpt match {
      case 0 => rev // if inpt is 0 then return the reverse number
      case _ => recursiveReverse(inpt/10, rev*10 + r)
    }
  }
}
