package org.example.service.impl


import org.example.service.DayOneAdventOfCode
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.math.abs

class DayOneAdventOfCodeImpl : DayOneAdventOfCode {
    override fun partOne(): Int {
        val lines = Path("/Users/adrien/Desktop/aoc/day1.txt").readLines()
        val (left, right) = getMapValues(lines)
        //unzip create a pair of lists, where first list is built from the first values of each pair from this array,
        // second list is built from the second values of each pair from this array

        // now i'm going to associate them based on exercice logic
        val sum = left.sorted().zip(right.sorted()).map { (first, second) ->
            //calculate distance between left and right
            abs(first - second)
        }.sum()
        return sum
    }

    override fun partTwo(): Int {
        val lines = Path("/Users/adrien/Desktop/aoc/day1.txt").readLines()
        val (left, right) = getMapValues(lines)
        val frequency: Map<Int, Int> = right.groupingBy { it }.eachCount()
        val fold: Int = left.fold(0) { acc, num ->
            acc + num * frequency.getOrDefault(num, 0)
        }
        return fold
    }

    private fun getMapValues(lines: List<String>) = lines.map { line ->
        // parse data file and map the values
        val first = line.substringBefore("   ").toInt()
        val second = line.substringAfterLast("   ").toInt()
        first to second
    }.unzip()
}