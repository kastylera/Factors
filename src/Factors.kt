class Factors {

  fun factor(x: Int): Array<Int> {
    var processingValue = x
    var factors = emptyArray<Int>()
    var primeNumber = 2
    if (processingValue == 1) {return arrayOf(1)}
    if (processingValue == 0) {return arrayOf(0)}
    while (primeNumber * primeNumber < x) {
      if (processingValue % primeNumber == 0) {
        factors += primeNumber
        processingValue = processingValue / primeNumber - processingValue % primeNumber
      } else primeNumber += 1
    }
    if (processingValue > 1) {
      factors += processingValue
    }
    return factors
  }
}