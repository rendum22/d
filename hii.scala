object EvenOddCheck {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val input = scala.io.StdIn.readInt()

    if (isEven(input))
      println(s"$input is Even.")
    else
      println(s"$input is Odd.")
  }

  // Function to check if a number is even
  def isEven(n: Int): Boolean = {
    n % 2 == 0
  }
}
