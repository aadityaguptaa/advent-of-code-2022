


fun main() {
    fun part1(input: List<String>): Int {

        var score = 0;
        for(i in input.indices){
            var len = input[i].length/2
            var mp1 = mutableMapOf<Char, Int>()
            var mp2 = mutableMapOf<Char, Int>()

            for(j in 0 until len){
                mp1[input[i][j]] = 1
            }
            for(j in len until (input[i].length)){
                if(mp1[input[i][j]] == 1){
                    var c = input[i][j].lowercaseChar()
                    var x = c.code - 96

                    if(input[i][j].isUpperCase()){
                        x+=26
                    }
                    score += x
                    break
                }
            }
        }

        return score
    }

    fun part2(input: List<String>): Int {

        var score = 0;
        for(i in input.indices step 3){

            var mp1 = mutableMapOf<Char, Int>()
            var mp2 = mutableMapOf<Char, Int>()

            for(j in 0 until input[i].length){
                mp1[input[i][j]] = 1
            }
            for(j in 0 until input[i+1].length){
                mp2[input[i+1][j]] = 1
            }
            for(j in 0 until (input[i+2].length)){
                if(mp1[input[i+2][j]] == 1 && mp2[input[i+2][j]] == 1){
                    var c = input[i+2][j].lowercaseChar()
                    var x = c.code - 96

                    if(input[i+2][j].isUpperCase()){
                        x+=26
                    }
                    score += x
                    break
                }
            }

        }

        return score
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}
