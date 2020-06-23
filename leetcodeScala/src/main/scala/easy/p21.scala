package main.scala.easy

class p21 {
  class ListNode( var _x: Int =0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    val l3 = new ListNode()
    mergeTwoListsRecursive(l1,l2,l3)
    l3.next
  }

  def mergeTwoListsRecursive(l1: ListNode, l2: ListNode, l3: ListNode): Unit = {
    if (l1 == null) l3.next = l2
    else if (l2 == null) l3.next = l1
    else if (l1.x <= l2.x) {
      l3.next = l1
      mergeTwoListsRecursive(l1.next, l2, l3.next)
    }
    else {
      l3.next = l2
      mergeTwoListsRecursive(l1, l2.next, l3.next)
    }
  }
}
