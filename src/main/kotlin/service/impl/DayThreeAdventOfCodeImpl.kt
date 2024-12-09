package org.example.service.impl

import org.example.service.DayThreeAdventOfCode
import kotlin.io.path.Path
import kotlin.io.path.readLines

class DayThreeAdventOfCodeImpl : DayThreeAdventOfCode {

    private var regexMultiply = """mul\((\d{1,3}),(\d{1,3})\)"""
    private var regexDo = """do\(\)"""
    private var regexDont = """don't\(\)"""

    override fun partOne(): Long {
        val lines = Path("/Users/adrien/Desktop/aoc/day3.txt").readLines()
        var product = 0L
        val regex = """mul\((\d{1,3}),(\d{1,3})\)"""
        for (line in lines) {
            product += extractValueAndMultiply(regex, line)
        }
        return product;
    }

    private fun extractValueAndMultiply(regex: String, line: String) : Long{
        return regex.toRegex().findAll(line).sumOf {
            val (first, second) = it.destructured
            first.toLong() * second.toLong()
        }
    }

    override fun partTwo(): Long {
        val lines = Path("/Users/adrien/Desktop/aoc/day3.txt").readLines()
        var product = 0L
        var enabled = true

        for (line in lines) {
            """$regexMultiply|$regexDo|$regexDont""".toRegex().findAll(line).forEach { match ->
                when(match.value) {
                    "don't()" -> enabled = false
                    "do()" -> enabled = true
                    else -> if (enabled) product += match.multiplyNumbers()
                }
            }
        }
        return product
    }
}

private fun MatchResult.multiplyNumbers(): Long {
    val (first, second) = destructured
    return first.toLong() * second.toLong()

}

