형태
```kotlin
if (조건식) {
    // 조건식이 true인 경우 실행
} else {
    // 조건식이 false인 경우 실행
}
```

대소비교
```kotlin
fun main(args: Array<String>) {
    val priceA: Int = 100
    val priceB: Int = 200
    
    if (priceA >= priceB) {
        println("priceA = $priceA")
    } else {
        println("priceB = $priceB")
    }
}
```

null 체크
```kotlin
fun main(args: Array<String>) {
    val price: Int? = null
    
    if (price == null) {
        println("null check true")
    } else {
        println("price = $price")
    }
}
```

in 체크 ~= js의 includes
```kotlin
fun main(args: Array<String>) {
    val price: Int = 100
    
    if (price in arrayOf(100, 200, 300)) {
        println("contain")
    } else {
        println("not contained")
    }
}
```

형태
```kotlin
when (변수) {
    조건1 -> 조건1 만족시 실행 후 when 밖으로 이동
    조건1 -> 조건1 만족시 실행 후 when 밖으로 이동
    조건1 -> 조건1 만족시 실행 후 when 밖으로 이동
    // ...
    else -> 아무것도 만족하지 않을때 실행
}
```

값 비교 ~= js의 switch case
```kotlin
fun main(args: Array<String>) {
    val price: Int = 100
    
    when(price) {
        100 -> println("1. price = $price")
        200 -> println("1. price = $price")
        300 -> println("1. price = $price")
        else -> println("4. Not")
    }
}
```

범위 비교
```kotlin
fun main(args: Array<String>) {
    val price: Int = 100

    when (price) {
        in 100..199 -> println("1. 100 ~ 199")
        in 200..299 -> println("2. 200 ~ 299")
        in 300..399 -> println("3. 300 ~ 399")
        else -> println("4. Not")
    }
}
```