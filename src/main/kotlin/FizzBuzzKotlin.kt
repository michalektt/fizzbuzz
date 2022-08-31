fun main() {
    fizzBuzz(185)
}

fun fizzBuzz(number: Int) {
    var stringBuilder: StringBuilder
    for(i in 0..number) {
        stringBuilder = StringBuilder()
            .append(i)
            .append(" ")
        when {
            (i%3 == 0) -> stringBuilder.append("fizz")
        }
        when {
            (i%5 == 0) -> stringBuilder.append("buzz")
        }
        println(stringBuilder)
    }
}