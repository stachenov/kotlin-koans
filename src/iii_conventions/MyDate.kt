package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        return compareBy<MyDate> { it.year }
                .thenBy { it.month }
                .thenBy { it.dayOfMonth }
                .compare(this, other)
    }

    operator fun plus(interval: TimeInterval) = addTimeIntervals(interval, 1)

    operator fun plus(timeIntervalMultiple: TimeIntervalMultiple) =
            addTimeIntervals(timeIntervalMultiple.interval, timeIntervalMultiple.multiple)
}

operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR;

    operator fun times(n: Int): TimeIntervalMultiple {
        return TimeIntervalMultiple(this, n)
    }
}

data class TimeIntervalMultiple(val interval: TimeInterval, val multiple: Int)

class DateRange(val start: MyDate, val endInclusive: MyDate): Iterable<MyDate> {
    override fun iterator() = DateIterator()

    operator fun contains(date: MyDate) = start <= date && date <= endInclusive

    inner class DateIterator() : Iterator<MyDate> {
        var current = start

        override fun hasNext()= current <= endInclusive

        override fun next(): MyDate {
            val next = current
            current = current.nextDay()
            return next
        }
    }
}
