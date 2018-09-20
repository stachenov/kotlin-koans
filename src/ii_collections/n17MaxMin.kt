package ii_collections

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    return customers.maxBy { it.orders.size }
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    return orderedProducts.maxBy { it.price }
}
