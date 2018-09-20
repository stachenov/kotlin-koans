package ii_collections

fun Customer.getTotalOrderPrice(): Double {
    return orders.sumByDouble { order -> order.products.sumByDouble { product -> product.price } }
}
