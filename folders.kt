// $ kotlinc folders.kt -include-runtime -d folders.jar
// $ java -jar folders.jar

// $ kotlinc folders2.kt -d folders2.jar
// $ kotlin -classpath folders2.jar Folders2Kt
import java.io.File

fun main(args: Array<String>) {
  val folders = File(args[0]).listFiles { file -> file.isDirectory() }
  folders?.forEach { folder -> println(folder) }
}
