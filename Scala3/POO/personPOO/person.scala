class Person(val name: String, val age: Int, val gender: String, val occupation: String) {
  def info() =
    println(s"Informations:\n Name: $name\n Age: $age\n Gender: $gender\n Occupation: $occupation")
}

@main def Main() = 
  val person1 = Person("Kage", 20, "Male", "Student")
  person1.info()
