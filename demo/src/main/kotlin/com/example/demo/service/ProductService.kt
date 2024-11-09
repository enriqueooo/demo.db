package demo.service

import demo.dto.ProductDTO
import demo.entity.Product
import demo.exception.ProductNotFoundException
import demo.mapper.ProductMapper
import demo.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) {

    fun getProductById(id: Long): ProductDTO {
        val product = productRepository.findById(id).orElseThrow { ProductNotFoundException("Product not found") }
        return productMapper.productToProductDTO(product)
    }

    fun createProduct(productDTO: ProductDTO): ProductDTO {
        val product = productMapper.productDTOToProduct(productDTO)
        val savedProduct = productRepository.save(product)
        return productMapper.productToProductDTO(savedProduct)
    }
}
