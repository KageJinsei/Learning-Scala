class Book(val name: String, val author: String, val year: Int, val code: Int){
  def info() =
    println(s"Informations:\n Name: $name\n Author: $author\n Year: $year\n Code: $code\n")
}

@main def Main() =
    val book1 = new Book("Night Darkness", "Kage Jinsei", 2024, 00001012024)
    val book2 = new Book("Middle Ages", "Kage Jinsei", 2024, 0001022024)
    val book3 = new Book("Glacial Weather", "Kage Jinsei", 2024, 0001032024)
    book1.info()
    book2.info()
    book3.info()
