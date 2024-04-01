import scala.io.StdIn.readLine

@main def helloUser() =
  print("Por favor, digite o seu nome: ")
  val name = readLine()

  println("Olá, " + name + "! Seja bem-vindo(a).")
