class Robot(var x: Int, var y: Int, var movement: String) {
    fun turnRight() {
        this.movement = when (movement) {
            "NORTH" -> "EAST"
            "EAST" -> "SOUTH"
            "SOUTH" -> "WEAST"
            "WEAST" -> "NORTH"
            else -> "Invalid direction"
        }
    }

    fun turnLeft() {
        this.movement = when (movement) {
            "NORTH" -> "WEAST"
            "WEAST" -> "SOUTH"
            "SOUTH" -> "EAST"
            "EAST" -> "NORTH"
            else -> "Invalid direction"
        }
    }

    fun advance() {
        when (movement) {
            "NORTH" -> y++
            "EAST" -> x++
            "SOUTH" -> y--
            "WEAST" -> x--
        }
    }

    fun run(instructions: String) {
        for (instruction in instructions) {
            when (instruction) {
                'R' -> turnRight()
                'L' -> turnLeft()
                'A' -> advance()
            }
        }
    }

    override fun toString(): String {
        return "$x $y $movement"
    }
}

fun main() {
    val robot = Robot(7,3, "NORTH")
    robot.run("RAALAL")
    println(robot)
}