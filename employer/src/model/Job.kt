package model

data class Job(
    val id: Int = 0,
    val area: String?,
    val company: String?,
    val email: String?,
    val payment: Double?,
    val journey: Int?
)