// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median when size=1" {
        median(listOf(10.0f)) shouldBe(10.0f plusOrMinus tolerance)
    }

    "Median when size=2" {
        median(listOf(6.0f, 10.0f)) shouldBe (8.0f plusOrMinus tolerance)
    }

    "Median when size=3" {
        median(listOf(6.0f, 4.0f, 8.0f)) shouldBe (6.0f plusOrMinus tolerance)
    }

    "Median when size=4" {
        median(listOf(4.0f, 6.0f, 8.0f, 10.0f)) shouldBe (7.0f plusOrMinus tolerance)
    }
})
