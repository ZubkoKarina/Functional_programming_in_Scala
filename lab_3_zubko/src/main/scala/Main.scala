//Zubko 
object Main extends App {
  // Task 1
  val daysOfWeek = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
  val head = daysOfWeek.head
  val tail = daysOfWeek.tail
  val last = daysOfWeek.last
  val updatedDaysOfWeek = daysOfWeek :+ "HaskellDay"

  println(s"Days of the week: $daysOfWeek")
  println(s"Head: $head")
  println(s"Tail: $tail")
  println(s"Last: $last")
  println(s"Updated days of the week: $updatedDaysOfWeek")

  // Task 2
  val name = "YourName" 
  val firstName = name.head
  val lastName = name.last
  val nameLength = name.length
  val allExceptLast = name.init

  println(s"Name: $name")
  println(s"First letter: $firstName")
  println(s"Last letter: $lastName")
  println(s"Length: $nameLength")
  println(s"All symbols except the last one: $allExceptLast")
}
