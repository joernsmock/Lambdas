fun main(args: Array<String>) {
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    println("Pass 6,7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    // lambdas can be outside of the parentheses
    // and the dest is not really float or double, but it
    // looks like it CAN be, if needed
    convert(22.5) {c: Double -> c * 9/5 + 32}

    // lambda inside the parens, as declared below
    convert(72.5, {c: Double -> (c - 32) * 5/9})
}

fun convert(x: Double, converter: (Double)->Double): Double  {
    val result=converter(x)
    println("$x is converted to $result")
    return result
}
