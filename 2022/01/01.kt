fun main() {
    fun part1(input: List<String>): Int {

        var max = 0;
        var temp = 0;
        for(i in 0..input.size-1){
            if(input[i].isEmpty()){
                if(temp > max){
                    max = temp;
                }
                temp = 0;
            }else{
                temp += input[i].toString().toInt()
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        var calList = mutableListOf<Int>();
        var temp = 0;

        for(i in 0..input.size-1){
            if(input[i].isEmpty()){
                calList.add(temp)
                temp = 0;
            }else{
                temp += input[i].toInt()
            }
        }
        calList.sort()
        var listSize = calList.size

        return calList[listSize-1]+calList[listSize-2]+calList[listSize-3]
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
