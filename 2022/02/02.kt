


fun main() {
    fun part1(input: List<String>): Int {
        var points = mapOf('X' to 1, 'Y' to 2, 'Z' to 3)
        var draw =  mapOf('A' to 'X', 'B' to 'Y', 'C' to 'Z')
        var loss = mapOf('C' to 'Y', 'A' to 'Z', 'B' to 'X')

        var score = 0;
        for(element in input){
            var li = element.split("\\s".toRegex()).toTypedArray()
            if(li[1][0] == draw[li[0][0]]){
                score += 3
            }else if(li[1][0] != loss[li[0][0]]){
                score+=6
            }
            score+= points[li[1][0]]!!

        }

        return score
    }

    fun part2(input: List<String>): Int {

        var draw =  mapOf('A' to 1, 'B' to 2, 'C' to 3)
        var loss = mapOf('C' to 2, 'A' to 3, 'B' to 1)
        var win = mapOf('C' to 1, 'A' to 2, 'B' to 3)

        var score = 0;
        for(element in input){
            var li = element.split("\\s".toRegex()).toTypedArray()

            if(li[1][0] == 'X'){
                score+=0
                score+=loss[li[0][0]]!!
            }else if(li[1][0] == 'Y'){
                score+=3
                score+=draw[li[0][0]]!!
            }else{
                score+=6
                score+=win[li[0][0]]!!
            }


        }

        return score
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
