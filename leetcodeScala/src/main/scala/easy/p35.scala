package main.scala.easy

class p35 {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    //assume array is sorted in ascending order
    val idx = nums.indexWhere(_>= target)
    //if element not found then it can be inserted in the end
    if (idx == -1) nums.length else idx
    //O(n) is the performance for indexWhere
  }

  def searchInsertBinarySearch(nums: Array[Int], target: Int): Int = {
    binarySearch(nums, 0, nums.length-1, target)
  }

  //binary search returns the element where its found else the start index
  //which is the element should be placed
  def binarySearch(nums: Array[Int], start: Int, end: Int, target: Int): Int = {
    val mid = (start+end)/2
    if (end < start) start 
    else if (nums(mid) == target) mid
    else if (nums(mid) > target) binarySearch(nums, start, mid -1, target)
    else binarySearch(nums, mid+1, end, target)
  }
}
