package model

data class Worker(
    val id: Int = 0,
    val area: String?,
    val email: String?,
    val name: String?,
    val payment: Double?,
    val journey: Int?
)