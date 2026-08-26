// aula 2
// exercícios slides

// ex1
def par(n: Int) =
  n % 2 == 0

par(10)

// ex2
def tres_iguais(x: AnyVal, y: AnyVal, z: AnyVal) =
  x == y && y == z

tres_iguais(1, 1, 1)
tres_iguais(1, 2, 3)

// exercícios lista 1

// ex1
def quatro_iguais(w: AnyVal, x: AnyVal, y: AnyVal, z: AnyVal) =
  w == x && x == y && y == z

quatro_iguais(1, 1, 1, 1)
quatro_iguais(1, 3, 5, 7)

// ex2
def quantos_iguais(x: AnyVal, y: AnyVal, z: AnyVal) =

  val v =
    if (tres_iguais(x, y, z))
      3
    else if (todos_diferentes(x, y, z))
      0
    else
      2
  v match {
    case 3 => 3
    case 0 => 0
    case 2 => 2
  }

quantos_iguais(1, 1, 1)
quantos_iguais(2, 2, 1)
quantos_iguais(0, 1, 2)

// ex3
def todos_diferentes(x: AnyVal, y: AnyVal, z: AnyVal) =
  x != y && y != z && x != z

todos_diferentes(1, 3, 5)
todos_diferentes(1, 1, 1)
todos_diferentes(1, 0, 1)

// ex4
def elevado_dois(n: Int) =
  n * n

elevado_dois(8)

// ex5
def elevado_quatro(n: Int) =
  elevado_dois(n) * elevado_dois(n)

elevado_quatro(10)
