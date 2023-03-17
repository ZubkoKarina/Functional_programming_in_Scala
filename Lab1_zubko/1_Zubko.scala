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
