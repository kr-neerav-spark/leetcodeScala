package main.scala

class p14 {
  //use the function that finds longest common prefix to calculate the longest common
  //prefix among all string in the list
  //using reduceLeft runs this function one by one on all strings
  def longestCommonPrefix(strs: Array[String]): String = {
    strs.reduceLeft(commonPrefix(_,_))
  }

  //zip the string to find the index of the longest common prefix
  def commonPrefix(str1: String, str2: String): String = {
    val idx = indexOfCommonTuples(str1 zip str2, 0)
    str1.take(idx)
  }

  //when sequence of zipped characters is empty of the character value is difference
  //then that is the index of longest common prefix
  def indexOfCommonTuples(seq: IndexedSeq[(Char,Char)], idx: Int): Int = {
    if (seq.isEmpty || seq.head._1 != seq.head._2) idx
    else indexOfCommonTuples(seq.tail, idx+1)
  }
}
