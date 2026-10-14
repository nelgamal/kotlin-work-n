// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({

    "Marks below 0 are invalid" {
        assertSoftly {
            withClue("Mark=-1") { grade(-1) shouldBe "?" }
            withClue("Mark=-5") { grade(-5) shouldBe "?" }
        }
    }

    "Marks between 0 and 39 give a Fail" {
        assertSoftly {
            withClue("Mark=0") { grade(0) shouldBe "Fail" }
            withClue("Mark=20") { grade(20) shouldBe "Fail" }
            withClue("Mark=39") { grade(39) shouldBe "Fail" }
        }
    }

    "Marks between 40 and 69 give a Pass" {
        assertSoftly {
            withClue("Mark=40") { grade(40) shouldBe "Pass" }
            withClue("Mark=55") { grade(55) shouldBe "Pass" }
            withClue("Mark=69") { grade(69) shouldBe "Pass" }
        }
    }

    "Marks between 70 and 100 give a Distinction" {
        assertSoftly {
            withClue("Mark=70") { grade(70) shouldBe "Distinction" }
            withClue("Mark=85") { grade(85) shouldBe "Distinction" }
            withClue("Mark=100") { grade(100) shouldBe "Distinction" }
        }
    }

    "Marks above 100 are invalid" {
        assertSoftly {
            withClue("Mark=101") { grade(101) shouldBe "?" }
            withClue("Mark=105") { grade(105) shouldBe "?" }
        }
    }

})