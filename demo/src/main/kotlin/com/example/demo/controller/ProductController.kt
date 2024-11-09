package demo.controller

import demo.dto.ProductDTO
import demo.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(private val productService: ProductService) {

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: Long): ResponseEntity<ProductDTO> {
        val product = productService.getProductById(id)
        return ResponseEntity.ok(product)
    }

    @PostMapping
    fun createProduct(@RequestBody productDTO: ProductDTO): ResponseEntity<ProductDTO> {
        val product = productService.createProduct(productDTO)
        return ResponseEntity.ok(product)
    }
}
