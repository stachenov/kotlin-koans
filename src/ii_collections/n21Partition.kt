package ii_collections

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    fun Customer.hasMoreUndeliveredThanDelivered(): Boolean {
        val (delivered, undelivered) = orders.partition { it.isDelivered }
        return undelivered.size > delivered.size
    }
    return customers.asSequence().filter { it.hasMoreUndeliveredThanDelivered() }.toSet()
}
