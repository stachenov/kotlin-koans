package ii_collections

fun Customer.isFrom(city: City): Boolean {
    return this.city == city
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    return customers.all { it.isFrom(city) }
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    return customers.any { it.isFrom(city) }
}

fun Shop.countCustomersFrom(city: City): Int {
    return customers.count { it.isFrom(city) }
}

fun Shop.findFirstCustomerFrom(city: City): Customer? {
    return customers.firstOrNull { it.isFrom(city) }
}
