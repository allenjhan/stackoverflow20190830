object CoinChange {
  def main(args: Array[String]): Unit = {
    println(countChange(25, List(5, 10, 25)))
  }

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0 || coins.isEmpty) 0
    else if (money == 0) 1
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }

}
