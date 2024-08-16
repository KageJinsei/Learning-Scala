import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
import java.io.FileWriter
import java.io.PrintWriter
import java.io.File

class Person(val name: String, val age: Int, val gender: String, val occupation: String) {
  def info(): String =
    s"Informations:\n Name: $name\n Age: $age\n Gender: $gender\n Occupation: $occupation"
}

object Main {
  def main(args: Array[String]) = 

    print("\nName: ")
    val name: String = readLine()

    print("Age: ")
    val age: Int = readInt()

    print("Gender: ")
    val gender: String = readLine()

    print("Occupation: ")
    val occupation: String = readLine()

    val person1 = new Person(name, age, gender, occupation)
    val data = person1.info()
    val fileWriter = new FileWriter(new File("person.txt"))
    fileWriter.write(data + "\n")
    fileWriter.close

    println("\nArquivo salvo com sucesso!")
}

