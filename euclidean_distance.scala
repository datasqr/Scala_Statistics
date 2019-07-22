def distance(xs: List[Double], ys: List[Double]) = {
    val sumOfSquares = sqrt((xs zip ys).map { case (x,y) => pow(y - x, 2) }.sum)
    1/(1 + sumOfSquares)
}
