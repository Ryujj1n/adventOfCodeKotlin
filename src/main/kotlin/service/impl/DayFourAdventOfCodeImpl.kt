package org.example.service.impl

import org.example.service.AdventOfCode
import kotlin.io.path.Path
import kotlin.io.path.readLines

class DayFourAdventOfCodeImpl : AdventOfCode {

    private companion object {
        val ALL_DIRECTIONS = listOf(
            -1 to -1, -1 to 0, -1 to 1,
            0 to -1,           0 to 1,
            1 to -1,  1 to 0,  1 to 1
        )
    }

    private fun List<String>.safeAt(x: Int, y: Int): Char =
        if (y in indices && x in this[y].indices) this[y][x] else ' '

    private tailrec fun searchForPattern(target: String, x: Int, y: Int, vector: Pair<Int, Int>, lines: List<String>): Boolean =
        when {
            target.isEmpty() -> true
            target.first() != lines.safeAt(x, y) -> false
            else -> searchForPattern(target.substring(1), x + vector.first, y + vector.second, vector, lines)
        }

    override fun partOne(): Any {
        val lines = Path("/Users/adrien/Desktop/aoc/day4.txt").readLines()
        return lines.flatMapIndexed { y, row ->
            row.mapIndexed { x, c ->
                if (c == 'X') {
                    ALL_DIRECTIONS.count { vector ->
                        searchForPattern("XMAS", x, y, vector, lines)
                    }
                } else 0
            }
        }.sum()
    }

    val CORNERS = listOf(-1 to -1, -1 to 1, 1 to 1, 1 to -1)


    override fun partTwo(): Any {
        val lines = Path("/Users/adrien/Desktop/aoc/day4.txt").readLines()
        return lines.flatMapIndexed { y, row ->
            row.mapIndexed { x, c ->
                if (c == 'A') {
                    CORNERS
                        .map { (dx, dy) -> lines.safeAt(x + dx, y + dy) }
                        .joinToString("") in setOf("MMSS", "MSSM", "SSMM", "SMMS")
                } else false
            }
        }.count { it }
    }
}
