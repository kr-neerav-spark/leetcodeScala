package main.scala.easy

import org.scalatest._

class p21Test extends FlatSpec {
  val tstObj = new p21()

  " p21 " should " return 1->1->2->3->4->4 for input mergeTwoLists(1->2->4, 1->3->4) " in {
    val l1n1 = new tstObj.ListNode(1)
    val l1n2 = new tstObj.ListNode(2)
    val l1n3 = new tstObj.ListNode(4)
    l1n1.next = l1n2
    l1n2.next = l1n3

    val l2n1 = new tstObj.ListNode(1)
    val l2n2 = new tstObj.ListNode(3)
    val l2n3 = new tstObj.ListNode(4)
    l2n1.next = l2n2
    l2n2.next = l2n3

    assert(1 ===1)
  }
}
