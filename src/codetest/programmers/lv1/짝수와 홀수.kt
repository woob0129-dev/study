package codetest.programmers.lv1

import kotlin.math.abs

fun solution12937(num: Int): String =  if (abs(num) % 2 == 1) "Odd" else "Even"

// fun solution12937(num: Int): String =  if (num.and(1) % 2 == 1) "Odd" else "Even"