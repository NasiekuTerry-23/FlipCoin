private var coinFlips = 0
private var headsWins = 0
private var tailWins = 0

fun main(){

    print("Flip the Coin How many times? ")
    val numberOfTimes = readLine()!!.toInt()

    for (i in 0 until numberOfTimes){

        val random = (1..2).random()
        ++coinFlips

        if (random == 1){
            ++headsWins
        } else{
            ++tailWins
        }

        println("Coins Flipped: $coinFlips")
    }

    println("""
        Total flips = $coinFlips
        ---
        Heads won: $headsWins times
        Tails won: $tailWins times
        ---
    """.trimIndent())
}