//Zubko
//task1
object Main extends App {
  def equation(x: Double): Double = {
    x match {
      case x if x <= -4 => 4 * x * x + 4
      case x if x > -4 && x < 4 => x * x * x - 1
      case x if x >= 4 => x * x + 1
    }
  }
  val xValue = 2.0 
  val yValue = equation(xValue)
  println(s"y = $yValue")
}
