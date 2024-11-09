package demo.entity

import jakarta.persistence.*

@Entity
@Table(name = "product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val description: String,
    val price: Double,
    val quantity: Int
)
