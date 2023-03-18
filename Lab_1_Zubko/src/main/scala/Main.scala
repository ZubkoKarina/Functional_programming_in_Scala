//Zubko, number 4
//task 1
object Main {
  def main(args: Array[String]): Unit = {
    val a = true
    val b = false
    val c = true

    val result = a || !(b && c)
    println(s"A or not (B and C) = $result")
  }
}


//task 2
/*
object Main extends App {
  def calculate(x: Double): Double = {
    if (x <= -4) {
      4 * x * x + 4
    } else if (x > -4 && x < 4) {
      x * x * x - 1
    } else {
      x * x + 1
    }
  }

  val xValue = 5.0 
  val result = calculate(xValue)
  println(s"y = $result")
}
*/



//task 3
/*
object Main extends App {
  def swapDigits(number: Int): Int = {
    val digits = number.toString.toCharArray
    val temp = digits(1)
    digits(1) = digits(2)
    digits(2) = temp
    digits.mkString.toInt
  }

  val inputNumber = 1856
  val swappedNumber = swapDigits(inputNumber)
  println(swappedNumber)
}*/
