package org.example

import org.example.service.DayOneAdventOfCode
import org.example.service.DayThreeAdventOfCode
import org.example.service.DayTwoAdventOfCode

import org.example.service.impl.DayOneAdventOfCodeImpl
import org.example.service.impl.DayThreeAdventOfCodeImpl
import org.example.service.impl.DayTwoAdventOfCodeImpl


fun main() {

    val dayOneAdventOfCode : DayOneAdventOfCode = DayOneAdventOfCodeImpl()
    val dayTwoAdventOfCode : DayTwoAdventOfCode = DayTwoAdventOfCodeImpl()
    val dayThreeAdventOfCode : DayThreeAdventOfCode = DayThreeAdventOfCodeImpl()

//    println("--- Day One AdventOfCode ---")
//    println("day one part one : "+dayOneAdventOfCode.partOne())
//    println("day one part two : "+dayOneAdventOfCode.partTwo())
//    println("")
//    println("--- Day Two AdventOfCode ---")
//    println("day two part one : "+dayTwoAdventOfCode.partOne())
//    println("day two part two : "+dayTwoAdventOfCode.partTwo())
//    println("")
    println("--- Day Two AdventOfCode ---")
    println("day two part one : "+dayThreeAdventOfCode.partOne())
    println("day two part two : "+dayThreeAdventOfCode.partTwo())
}


