package main.scala

class p9 {
  def isPalindrome(x: Int): Boolean = {
    if (x<0) false else x == recursiveParlindrome(x,0)
  }

  def recursiveParlindrome(inpt: Int, rev: Int): Int = {
    var r = inpt%10
    inpt match {
      case 0 => rev
      case _ => recursiveParlindrome(inpt/10, rev*10 + r)
    }
  }
}
