package main.scala.easy

import org.scalatest._

class p35Test extends FlatSpec {
  val tstObj = new p35()

  "p35 " should " return 2 for searchInsert(Array(1,3,5,6),5) " in {
    assert(tstObj.searchInsert(Array(1,3,5,6),5) === 2)
    assert(tstObj.searchInsertBinarySearch(Array(1,3,5,6),5) == 2)
  }


  it should " return 1 for searchInsert(Array(1,3,5,6),2) " in {
    assert(tstObj.searchInsert(Array(1,3,5,6),2) === 1)
    assert(tstObj.searchInsertBinarySearch(Array(1,3,5,6),2) === 1)
  }

  it should " return 4 for searchInsert(Array(1,3,5,6),7) " in {
    assert(tstObj.searchInsert(Array(1,3,5,6),7) === 4)
    assert(tstObj.searchInsertBinarySearch(Array(1,3,5,6),7) === 4)
  }

  it should " return 0 for searchInsert(Array(1,3,5,6), 0) " in {
    assert(tstObj.searchInsert(Array(1,3,5,6),0) === 0)
    assert(tstObj.searchInsertBinarySearch(Array(1,3,5,6), 0) ===0)
  }

  it should " return 0 for searchInsert(Array(5),4) " in {
    assert(tstObj.searchInsert(Array(5),4) === 0)
    assert(tstObj.searchInsertBinarySearch(Array(5),4) === 0)
  }

  it should " return 0 for searchInsert(Array(), 3) " in {
    assert(tstObj.searchInsert(Array(),3) === 0)
    assert(tstObj.searchInsertBinarySearch(Array(),3) ===0)
  }
}
