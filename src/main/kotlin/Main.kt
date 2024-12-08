package org.example

import org.example.service.DayOneAdventOfCode
import org.example.service.DayTwoAdventOfCode
import org.example.service.impl.DayOneAdventOfCodeImpl
import org.example.service.impl.DayTwoAdventOfCodeImpl


fun main() {

    val dayOneAdventOfCode : DayOneAdventOfCode = DayOneAdventOfCodeImpl()
    val dayTwoAdventOfCode : DayTwoAdventOfCode = DayTwoAdventOfCodeImpl()

    println("--- Day One AdventOfCode ---")
    println("day one part one : "+dayOneAdventOfCode.partOne())
    println("day one part two : "+dayOneAdventOfCode.partTwo())
    println("")
    println("--- Day Two AdventOfCode ---")
    println("day two part one : "+dayTwoAdventOfCode.partOne())
    println("day two part two : "+dayTwoAdventOfCode.partTwo())
}


