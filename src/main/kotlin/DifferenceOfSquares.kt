import kotlin.math.pow

class Squares(private val maxNatural: Int) {
    fun sumOfSquares(): Int {
        return sumOfNSquare(maxNatural)
    }

    fun squareOfSum(): Int {
        return square(sumOfN(maxNatural))
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }

    private fun sumOfN(n: Int): Int {
        if (n == 1) {
            return 1
        }
        return sumOfN(n - 1) + n
    }

    private fun square(n: Int): Int {
        return n.toDouble().pow(2.0).toInt()
    }

    private fun sumOfNSquare(n: Int): Int {
        if (n == 1) {
            return 1
        }
        return sumOfNSquare(n - 1) + square(n)
    }
}
