package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    return customers.asSequence()
            .filter { it.orderedProducts.contains(product) }
            .toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.asSequence()
            .filter { order -> order.isDelivered }
            .flatMap { order -> order.products.asSequence() }
            .maxBy { product -> product.price }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.asSequence()
            .flatMap { customer -> customer.orders.asSequence() }
            .flatMap { order -> order.products.asSequence() }
            .filter { it == product }
            .count()
}
