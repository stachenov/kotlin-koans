package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return compareBy<MyDate> { it.year }
                .thenBy { it.month }
                .thenBy { it.dayOfMonth }
                .compare(this, other)
    }
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(date: MyDate): Boolean {
        return start <= date && date <= endInclusive
    }
}
