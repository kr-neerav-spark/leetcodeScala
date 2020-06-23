package main.scala.easy

class p26 {
  def removeDuplicates(nums: Array[Int]): Int = {
    val numsL = nums.length
    def rearrangeElements(slowRunner: Int, fastRunner: Int): Int= {
      if (fastRunner >= numsL) slowRunner
      else if (nums(slowRunner) == nums(fastRunner)) rearrangeElements(slowRunner, fastRunner+1)
      else {nums(slowRunner+1)=nums(fastRunner)
        rearrangeElements(slowRunner+1, fastRunner+1)
      }
    }

    if (nums.isEmpty) 0 else rearrangeElements(0,1)+1
  }
}
