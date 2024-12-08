package org.example.service.impl

import org.example.service.DayTwoAdventOfCode
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.math.abs

class DayTwoAdventOfCodeImpl : DayTwoAdventOfCode {
    override fun partOne(): Int {
        val lines = Path("/Users/adrien/Desktop/aoc/day2.txt").readLines()
        var counter = 0

        for (line in lines) {

            val numbers = line.split(" ")
            if (isLineSafe(numbers)) counter++

        }

        return counter
    }

    override fun partTwo(): Int {
        val lines = Path("/Users/adrien/Desktop/aoc/day2.txt").readLines()
        var counter = 0

        for (line in lines) {
            val numbers = line.split(" ")
            var safe = false

            for (i in 0..numbers.lastIndex) {
                safe = isLineSafe(numbers.toMutableList().apply { removeAt(i) })
                if (safe) break
            }

            if (safe) counter++
        }

        return counter
    }

    private fun isLineSafe(numbers: List<String>): Boolean {

        var isSafe = true
        var isIncreasing = true
        var isDecreasing = true

        for (i in 0..<numbers.lastIndex) {

            val firstNum = numbers[i].toInt()
            val secondNum = numbers[i + 1].toInt()
            isSafe = isSafe && abs(firstNum - secondNum) <= 3

            when {

                firstNum < secondNum -> isDecreasing = false
                firstNum > secondNum -> isIncreasing = false

                else -> {

                    isIncreasing = false
                    isDecreasing = false

                }
            }
        }

        return isSafe && (isIncreasing || isDecreasing)
    }
}