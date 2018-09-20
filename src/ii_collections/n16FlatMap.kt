package ii_collections

val Customer.orderedProducts: Set<Product> get() {
    return orders.asSequence().flatMap { it.products.asSequence() }.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    return customers.asSequence().flatMap { it.orderedProducts.asSequence() }.toSet()
}
