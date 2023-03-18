//Zubko 
object Main extends App {
  val evenNumbersDivisibleBy6 = (1 to 200).filter(n => n % 2 == 0 && n % 6 == 0)
  println(s"Even numbers between 1 and 200 that are divisible by 6: $evenNumbersDivisibleBy6")
}
