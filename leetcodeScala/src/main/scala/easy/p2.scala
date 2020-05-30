package main.scala.easy

class p2 {
  // before calculating the next number check if its within the range
  def isValidNextNum(num: Int, step: Int): Boolean = {
    num <= (Int.MaxValue-step)/10
  }
  //recursive function to calculate the reverse of the number
  //the input is a positive number within the range of Int
  def recursiveReverse(inpt: Int, rev: Int): Int = {
    val r = inpt%10
    inpt match {
      case 0 => rev //end of number return rev
      // if next number is valid then recursively calculate next num
      // if next number if out of range then return 0
      case _ => if (isValidNextNum(rev, r)) recursiveReverse(inpt/10, rev*10 + r) else 0
    }
  }
  def reverse(x:Int): Int = {
    // calculate negative flag to convert number to positive
    val negativeFlag = if (x<0) -1 else 1
    // multiply by negative flag incase the input was negative
    negativeFlag*recursiveReverse(x*negativeFlag, 0)
  }
}
