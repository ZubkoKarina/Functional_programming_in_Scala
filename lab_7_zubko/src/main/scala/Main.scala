//Zubko
object Main extends App {
  def naturalNumbers(n: Int): List[Int] = {
    def helper(i: Int): List[Int] = {
      if (i <= n) {
        i :: helper(i + 1)
      } else {
        Nil
      }
    }
    helper(1)
  }

  val n = 10
  println(s"Natural numbers from 1 to $n: ${naturalNumbers(n)}")
}
