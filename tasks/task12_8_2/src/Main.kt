// Task 12.8.2: program to manipulate playing cards


fun main() {
    val deck = mutableListOf<Card>()

    for (suit in Card.Suit.entries) {
        for (rank in Card.Rank.entries) {
            deck.add(Card(rank, suit))
        }
    }

    deck.shuffle()

    for (card in deck) {
        println(card.fullName)
    }
}
