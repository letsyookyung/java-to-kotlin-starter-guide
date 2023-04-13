package com.ivy.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

// 1.try catch
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 $str 은 숫자가 아닙니다")
    }
}

// tip try도 expression
fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 2.Checked Exception & Unchecked Exception -> kotlin은 굳이 구분하지 않음, 모두 unchecked exception으로 간주함
class FilePrinter() {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
}
// java에서의 IOException 체크 예외 에러 를 명시해줘야하는데, kotlin은 안해두됨


// 3. try with resources
fun readFileTryWithResources(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}