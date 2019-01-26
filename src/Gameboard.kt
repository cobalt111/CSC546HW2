class Gameboard(private val startingHolePosition: Int) {

    private val board: MutableList<Boolean> = mutableListOf(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true)

    fun initializeBoard() {
        board[startingHolePosition] = false
    }

    fun orientBoardUpright() {
        when (startingHolePosition) {
            2 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[1] = false
            }
            5 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[3] = false
            }
            6 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[1] = false
            }
            7 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[4] = false
            }
            8 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[4] = false
            }
            9 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[1] = false
            }
            10 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[0] = false
            }
            11 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[1] = false
            }
            12 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[3] = false
            }
            13 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[1] = false
            }
            14 -> {
                print("Righting board...")
                board[startingHolePosition] = true
                board[0] = false
            }
            else -> {
                print("Board already upright.")
            }
        }
    }
}