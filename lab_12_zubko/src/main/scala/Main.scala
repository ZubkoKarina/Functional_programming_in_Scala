object CustomListFunctions extends App {
//zubko
  def lengthList[A](list: List[A]): Int = list.length

  def nthList[A](n: Int, list: List[A]): Option[A] = list.lift(n)

  def removeNegative(list: List[Int]): List[Int] = list.filter(_ >= 0)

  def fromList[A](list: List[A]): List[A] = list

  def toList[A](list: List[A]): List[A] = list

  val sampleList = List(1, -2, 3, -4, 5)
  println(s"Length of the list: ${lengthList(sampleList)}")
  println(s"3rd element of the list: ${nthList(2, sampleList)}")
  println(s"List without negative elements: ${removeNegative(sampleList)}")
  println(s"From list: ${fromList(sampleList)}")
  println(s"To list: ${toList(sampleList)}")
}
