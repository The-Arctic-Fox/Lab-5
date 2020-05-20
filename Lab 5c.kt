fun main() {
    var cardPoints = 10_000
    var cardLevel = "";

    when (cardPoints) {
        in 0..999 -> cardLevel = "pearl"
        in 1000..4999 -> cardLevel = "silver"
        in 5000..9999 -> cardLevel = "gold"
        !in 0..99, !in 1000..4999, !in 5000..9999 -> cardLevel = "platimun"
    }

    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}