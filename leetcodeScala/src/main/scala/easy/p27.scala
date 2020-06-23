package main.scala.easy

class p27 {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    val numsL = nums.length
    def rearrangeElement(slowRunner: Int, fastRunner: Int): Int = {
      if (fastRunner >= slowRunner) slowRunner
      else if (nums(slowRunner) == `val`) rearrangeElement(slowRunner-1, fastRunner)
      else if (nums(fastRunner) == `val`) {
        nums(fastRunner) = nums(slowRunner)
        rearrangeElement(slowRunner-1, fastRunner+1)
      }
      else rearrangeElement(slowRunner, fastRunner+1)
    }

    if (nums.isEmpty) 0 else {
      val out = rearrangeElement(nums.length-1,0)
      if (out == 0) 0 else out +1
    }
  }
}
