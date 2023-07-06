class Squares(private val maxNatural: Int) {
    fun sumOfSquares() = range().sumOf { n -> n * n }

    fun squareOfSum(): Int {
        val s = sum()
        return s * s
    }

    fun difference() = squareOfSum() - sumOfSquares()

    private fun sum() = range().sum()

    private fun range() = (1..maxNatural)
}
