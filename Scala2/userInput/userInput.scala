import scala.io.StdIn.readLine

object userInput {

  def main(args: Array[String]) = {
    print("Por favor, digite o seu nome: ")
    val name = readLine()

    println("Olá, " + name + "! Seja bem-vindo(a).")
  } 
}
