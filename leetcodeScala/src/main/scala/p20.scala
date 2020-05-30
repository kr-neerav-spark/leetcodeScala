package main.scala

import scala.collection.mutable.Stack 

class p20 {
  //map to find the closing pair of a parenthesis
  val parenthesisPair = Map(
       '(' -> ')',
       '{' -> '}',
       '[' -> ']',
    )
  //map to identify if the given parenthesis will result in a push or pop operation on the stack
  val ops = Map(
      '(' -> true,
      '{' -> true,
      '[' -> true,
      ')' -> false,
      '}' -> false,
      ']' -> false
    )
  val stck= Stack[Char]()
  
  //check to see if the given parenthesis at the posisiton is valid or not
  def isValidAtPos(c: Char): Boolean = {
    if (ops(c)) 
    {
      //if its an opening parenthesis then push on the stack
      stck.push(parenthesisPair(c))
      true
    }
    //if it is a closing parenthesis and stack is empty then return false
    else if (stck.isEmpty) false
    //pop the latest closing parenthesis expected and compare with the given closing parenthesis
    else stck.pop() == c
  }

  //check to see if the parenthesis expression is valid or not
  def isValid(s: String): Boolean = {
    //empty string is an edge case and it should return true
    //the string is converted into a list of true/false telling whether the parenthesis
    //at the given position results in a valid expression or not
    //additional check that the stack is empty in the end as only then will the overall
    //expression be valid.
    if (s.isEmpty) true else s.toList.map(isValidAtPos).min && stck.isEmpty
  }
}
