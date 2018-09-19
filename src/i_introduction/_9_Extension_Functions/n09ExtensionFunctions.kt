package i_introduction._9_Extension_Functions

import util.TODO
import util.doc9

fun String.lastChar() = get(length - 1)

fun todoTask9(): Nothing = TODO(
    """
        Task 9.
        Implement the extension functions Int.r(), Pair<Int, Int>.r()
        to support the following manner of creating rational numbers:
        1.r(), Pair(1, 2).r()
    """,
    documentation = doc9(),
    references = { 1.r(); Pair(1, 2).r(); RationalNumber(1, 9) })

data class RationalNumber(val numerator: Int, val denominator: Int)

fun Int.r() = RationalNumber(this, 1)
fun Pair<Int, Int>.r() = RationalNumber(first, second)
