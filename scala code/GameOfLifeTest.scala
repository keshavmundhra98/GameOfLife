import org.scalatest.FunSuite

class GameOfLifeTest extends FunSuite {
  test("deathBecauseOfLonelinessTest") {
    var seedTest1 = new universe(List((0, 1), (0, 2)))
    var nextGenTest1 = new universe(List())
    seedTest1.initialize()
    nextGenTest1.initialize()
    assert(seedTest1.tickTransition() === nextGenTest1)
  }
  test("deathBecauseOfOvercrowdingTest") {
    var seedTest2 = new universe(List((0, 2), (0, 1), (0, 3), (1, 2), (1, 3)))
    var nextGenTest2 = new universe(List((0, 1), (0, 3), (1, 1), (1, 3)))
    seedTest2.initialize()
    nextGenTest2.initialize()
    assert(seedTest2.tickTransition() === nextGenTest2)
  }
  test("gettingLifeTest") {
    var seedTest3 = new universe(List((0, 1), (1, 0), (1, 1)))
    var nextGenTest3 = new universe(List((0, 0), (0, 1), (1, 0), (1, 1)))
    seedTest3.initialize()
    nextGenTest3.initialize()
    assert(seedTest3.tickTransition() === nextGenTest3)
  }
  test("remainsAliveTest") {
    var seedTest4 = new universe(List((0, 2), (1, 1), (1, 2), (1, 3)))
    var nextGenTest4 = new universe(List((0, 2), (0, 1), (0, 3), (1, 1), (1, 2), (1, 3), (2, 2)))
    seedTest4.initialize()
    nextGenTest4.initialize()
    assert(seedTest4.tickTransition() === nextGenTest4)
  }
}
