package main.scala.microsoft

import org.scalatest._

class minMovesTest extends FlatSpec {
  val tstObj = new minMoves()
  
  "minMoves " should " return 1 for input minMoves3Letters('baaaaa')) " in {
    assert(tstObj.minMoves3Letters("baaaaa") === 1)
  }

  it should " return 2 for input minMoves3Letters('baaabbaabbba') " in {
    assert(tstObj.minMoves3Letters("baaabbaabbba") === 2)
  }

  it should " return 0 for input minMoves3Letters('baabab') " in {
    assert(tstObj.minMoves3Letters("baabab") === 0)
  }
}
