package main.scala

import scala.collection.mutable.Stack 

class p20 {
  val parenthesisPair = Map(
       '(' -> ')',
       '{' -> '}',
       '[' -> ']',
       ')' -> '(',
       '}' -> '{',
       ']' -> '['
    )
  val ops = Map(
      '(' -> true,
      '{' -> true,
      '[' -> true,
      ')' -> false,
      '}' -> false,
      ']' -> false
    )
  val stck= Stack[Char]()
  def isValidAtPos(c: Char): Boolean = {
    if (ops(c)) 
    {
      stck.push(parenthesisPair(c))
      true
    }
    else if (stck.isEmpty) false
    else stck.pop() == c
  }
  def isValid(s: String): Boolean = {
    if (s.isEmpty) true else s.toList.map(isValidAtPos).min && stck.isEmpty
  }
}
