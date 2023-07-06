class Squares(private val maxNatural: Int) {
    fun sumOfSquares(): Int {
        return (1..maxNatural).sumOf { n -> n * n }
    }

    fun squareOfSum(): Int {
        val s = sum()
        return s * s
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

    private fun sum(): Int {
        return (1..maxNatural).sum()
    }
}
