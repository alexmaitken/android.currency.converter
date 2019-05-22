package android.currency.converter

import java.math.BigDecimal

data class Currency(val code: String, val name: String, val flag: String, val rate: BigDecimal);