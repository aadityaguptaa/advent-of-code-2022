


fun main() {
    fun part1(input: List<String>): Int {

        var count = 0;
        for (i in input) {
            var li = i.split(',').map { it.split('-').map { it.toInt() } }


            if (li[0][0] <= li[1][0] && li[0][1] >= li[1][1]) {
                count++
            } else if (li[0][0] >= li[1][0] && li[0][1] <= li[1][1]) {
                count++
            }
        }

        return count
    }

    fun part2(input: List<String>): Int {

        var count = 0;
        for (i in input) {
            var li = i.split(',').map { it.split('-').map { it.toInt() } }

            if (li[0][0] >= li[1][0] && li[0][0] <= li[1][1]) {
                count++
            } else if (li[0][1] >= li[1][0] && li[0][1] <= li[1][1]) {
                count++
            } else if (li[1][0] >= li[0][0] && li[1][0] <= li[0][1]) {
                count++
            } else if (li[1][1] >= li[0][0] && li[1][1] <= li[0][1]) {
                count++
            }
        }


        return count
    }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}
