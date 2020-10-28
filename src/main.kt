fun main() {

    var f1 = Fraction()
    f1.numerator = 7F
    f1.denominator = 9F

    val f2 = Fraction()
    f2.numerator = 5F
    f2.denominator = 6F

    println(f1)
    println(f2)
    println(f1 == f2)
}

    class Fraction {

        var numerator: Float = 0F
        var denominator: Float = 0F

        override fun equals(other: Any?): Boolean {
            if (other is Fraction) {
                if(numerator * other.denominator / denominator == other.numerator)
                    return true
            }
            return false
        }

        override fun toString(): String {
            return "$numerator/$denominator"
        }

    }