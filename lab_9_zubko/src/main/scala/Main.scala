import scala.math.pow
//Zubko
object Main extends App {
  def seriesSum(x: Double, k: Int): Double = {
    def seriesTerm(i: Int): Double = pow(x, 2 * i - 1) / i

    (1 to k).map(seriesTerm).sum
  }

  val x = 2.0
  val k = 5

  val sum = seriesSum(x, k)
  println(s"Sum of the series with x = $x and k = $k terms: $sum")
}
