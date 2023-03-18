import scala.annotation.tailrec
//Zubko
object TrafficLightSimulation extends App {
  object TrafficLightColor extends Enumeration {
    type TrafficLightColor = Value
    val Green, Yellow, Red = Value
  }
  import TrafficLightColor._
  def nextColor(color: TrafficLightColor, prev: TrafficLightColor): TrafficLightColor = color match {
    case Green => Yellow
    case Yellow => if (prev == Green) Red else Green
    case Red => Yellow
  }
  @tailrec
  def simulateTrafficLight(color: TrafficLightColor, prev: TrafficLightColor, steps: Int): Unit = {
    if (steps > 0) {
      println(color)
      val next = nextColor(color, prev)
      Thread.sleep(1000)
      simulateTrafficLight(next, color, steps - 1)
    }
  }
  simulateTrafficLight(Green, Yellow, 10)
}
