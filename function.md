예시
```kotlin
fun main(args: Array<String>) {
    val price1: Int = 100
    val price2: Int = 200
    
    val price3: sumPrice(price1, price2)
    println("price3 = $price3")
}

fun sumPrice(price1: Int, price2: Int): Int = price1 + price2
```