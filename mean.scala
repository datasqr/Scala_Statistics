def mean[T](item: Traversable[T])(implicit n: Numeric[T]) = {
    n.toDouble(item.sum) / item.size.toDouble
}
