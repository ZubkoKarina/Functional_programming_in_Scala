//Zubko
object Main extends App {
  // Task 1
  val list1 = (1 to 5).map(_ + 1)
  println(s"Task 1: $list1")

  // Task 2
  val list2 = (1 to 10).map(_ * 2)
  println(s"Task 2: $list2")

  // Task 3
  val list3 = (1 to 30).filter(_ % 2 != 0)
  println(s"Task 3: $list3")

  // Task 4
  val list4 = (1 to 10).filter(_ < 4)
  println(s"Task 4: $list4")

  // Task 5
  val sum = (1 to 100).foldLeft(0)(_ + _)
  println(s"Task 5: $sum")

  // Task 6
  val factorial4 = (1 to 4).foldRight(1)(_ * _)
  println(s"Task 6: $factorial4")
}
