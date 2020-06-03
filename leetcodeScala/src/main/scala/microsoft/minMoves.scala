package main.scala.microsoft

class minMoves {
  def minMoves3Letters(s: String): Int = {
    minMoves3LettersChar(s,'a') + minMoves3LettersChar(s,'b')
  }

  def minMoves3LettersChar(s: String, c:Char): Int = {
    s.split(c).map(_.length/3).sum
  }
}
