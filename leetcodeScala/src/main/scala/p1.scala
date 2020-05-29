package main.scala

class p1 {
  def twoSum(nums: Array[Int], target:Int): Array[Int] = {
    /*For the 2 sum problem the function uses nums(start) as the first element.
      It then searches for value x = target - nums(start) in the array starting from index start + 1.
      By starting from index start + 1 it ensures it does not use the same element twice.
      When not found it recursively searches the array by incrementing value of start
      When found the array returns both the index*/
    def twoSumRecursive(start: Int): Array[Int] = {
      val num = target - nums(start)
      val id = nums.indexWhere(_ == num, start+1)
      //if element not found then id is -1 so we need to call the function again starting next value
      //if the value is found then return the 2 index
      if (id == -1) twoSumRecursive(start+1) else Array(start, id)
    }

    twoSumRecursive(0)
  }
}
