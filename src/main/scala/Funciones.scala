object Funciones {
  def main(args: Array[String]): Unit = {
    // ------------------- UNIDAD 03 -------------------
    // ------------------- EJERCICIO 2 -------------------
    println("------------------- UNIDAD 03 -------------------")
    println("------------------- EJERCICIO 2 -------------------")

    def fun(x: String): Unit ={
      return println(x.length())
    }

    fun("Hola")

    // ------------------- EJERCICIO 4 -------------------
    println("------------------- EJERCICIO 4 -------------------")

    def div (a: Float,b: Float): Unit ={
      return println(s"La división de $a entre $b es ".format(a,b) + a/b)
    }

    div(5,3)


    // ------------------- EJERCICIO 4 -------------------
    println("------------------- EJERCICIO 4 -------------------")

    def div2 (a: Float = 10,b: Float = 2): Unit ={
      return println(s"La división de $a entre $b es ".format(a,b) + a/b)
    }

  div2()








  }
}
