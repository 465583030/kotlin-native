inline fun foo2(i2: Int): Int {
    return i2 + 3
}

inline fun foo1(i1: Int): Int {
    return foo2(i1)
}

fun bar(): Int {
    return foo1(11)
}

fun main(args: Array<String>) {
    println(bar().toString())
}
