package org.example

import org.example.service.impl.DayFourAdventOfCodeImpl
import org.example.service.AdventOfCode
import org.example.service.impl.DayOneAdventOfCodeImpl
import org.example.service.impl.DayThreeAdventOfCodeImpl
import org.example.service.impl.DayTwoAdventOfCodeImpl


fun main() {

    val dayOneAdventOfCode : AdventOfCode = DayOneAdventOfCodeImpl()
    val dayTwoAdventOfCode : AdventOfCode = DayTwoAdventOfCodeImpl()
    val dayThreeAdventOfCode : AdventOfCode = DayThreeAdventOfCodeImpl()
    val dayFourAdventOfCode : AdventOfCode = DayFourAdventOfCodeImpl()

    println("--- Day One AdventOfCode ---")
    println("day one part one : "+dayOneAdventOfCode.partOne())
    println("day one part two : "+dayOneAdventOfCode.partTwo())
    println("")
    println("--- Day Two AdventOfCode ---")
    println("day two part one : "+dayTwoAdventOfCode.partOne())
    println("day two part two : "+dayTwoAdventOfCode.partTwo())
    println("")
    println("--- Day Three AdventOfCode ---")
    println("day three part one : "+dayThreeAdventOfCode.partOne())
    println("day three part two : "+dayThreeAdventOfCode.partTwo())
    println("")
    println("--- Day Four AdventOfCode ---")
    println("day four part one : "+dayFourAdventOfCode.partOne())
    println("day four part two : "+dayFourAdventOfCode.partTwo())
    println("")
    println("--- Day Five AdventOfCode ---")
    println("")
    println("--- Day Six AdventOfCode ---")
}


