class Squares(private val maxNatural: Int) {
    fun sumOfSquares() = (1..maxNatural).sumOf { n -> n * n }

    fun squareOfSum(): Int {
        val s = sum()
        return s * s
    }

    fun difference() = squareOfSum() - sumOfSquares()

    private fun sum() = (1..maxNatural).sum()
}
