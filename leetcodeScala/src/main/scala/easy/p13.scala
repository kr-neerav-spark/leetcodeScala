package main.scala.easy

class p13 {
  //Map to lookup the value of the roman literal.
  //Contains the cases where subtraction is used
  val r2i = Map(  
                    "I" -> 1,
                    "V" -> 5,
                    "X" -> 10,
                    "L" -> 50,
                    "C" -> 100,
                    "D" -> 500,
                    "M" -> 1000,
                    "IV" -> 4,
                    "IX" -> 9,
                    "XL" -> 40,
                    "XC" -> 90,
                    "CD" -> 400,
                    "CM" -> 900
                    )
  def romanToInt(s: String): Int = {
    //convert the string to a list of strings (instead of list of characters)
    //we need list of string to we can use + (concatenation) operation on it
    romanToIntRecursive(s.toList.map(_.toString),0)
  }
  def romanToIntRecursive(sList: List[String], out: Int): Int = {
    // check if string has more than 2 characters as we can to lookup 2 chars together when possible
    sList match {
      case a::b::tail => {
        //check if both characters are present in r2i (the case of subtraction)
        if (r2i.contains(a+b)) romanToIntRecursive(tail, out+r2i(a+b))
        //if the concat of char not presnt in r2i then subtraciton case not valid 
        //safe to proceed with just 1 char and recursively call the function on rest of the string
        else romanToIntRecursive(b::tail, out+r2i(a))
      }
      //if only 1 character left in string then add and return final value
      case a::Nil => out+r2i(a)
      //if not character presnt then return the value
      case Nil => out
    }
  }
}
