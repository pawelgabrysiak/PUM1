import java.time.LocalDate

data class Cost(
    val type: CostType,
    val data: LocalDate,
    val amount: Int

)
