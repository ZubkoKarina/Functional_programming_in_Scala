//Zubko
object Main extends App {
  def extractElements(list: List[Int], n: Int, m: Int): List[Int] = {
    list.slice(n - 1, m)
  }

  val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val n = 3
  val m = 6

  val extractedElements = extractElements(myList, n, m)
  println(s"Elements from position $n to $m: $extractedElements")
}
