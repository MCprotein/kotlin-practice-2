형태
```kotlin
class 클래스명 {
    // 프로퍼티와 메소드
}
```

생성자
```kotlin
fun main(args: Array<String>) {
    val item = Item("Book", 10_000)
    println("Item name is ${item.name}, price is ${item.price}")
}

class Item(
    val name: String,
    val price: Int
)
```

enum class
```kotlin
enum class Color {
    RED,
    GREEN,
    BLUE
}
```

interface
```kotlin
interface 인터페이스명 {
    fun 함수명()
}
```