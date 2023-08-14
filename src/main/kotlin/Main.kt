fun main(args: Array<String>) {
    val price: Int = 100

    when(price) {
        100 -> println("1. price = $price")
        200 -> println("2. price = $price")
        300 -> {
            println("3. price = $price")
        }

        else -> println("4. Not")
    }
}