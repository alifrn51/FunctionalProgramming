package productCard

import extensions.filter
import extensions.transform
import org.example.productCard.ProductCategory
import org.example.productCard.ProductRepository

fun main() {
    val productsCard = ProductRepository.products
        .filter { it.category == ProductCategory.CLOTHING }
        .transform { it.copy(price = it.price * 2)  }
        .transform { "${it.id} - ${it.name} - ${it.price}" }

    for (productCard in productsCard) {
        println(productCard)
    }
    println("Size: ${productsCard.size}")
}
