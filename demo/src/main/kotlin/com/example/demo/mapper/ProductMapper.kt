package demo.mapper

import demo.dto.ProductDTO
import demo.entity.Product

@Mapper(componentModel = "spring")
interface ProductMapper {

    fun productToProductDTO(product: Product): ProductDTO

    fun productDTOToProduct(productDTO: ProductDTO): Product
}

annotation class Mapper(val componentModel: String)
