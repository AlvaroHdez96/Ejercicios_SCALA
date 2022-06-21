object Clases {
  def main(args: Array[String]): Unit = {
    // ------------------- UNIDAD 04 -------------------
    // ------------------- EJERCICIOS 2, 3, 4, 5, 6, 7 Y 8 -------------------
    println("------------------- UNIDAD 04 -------------------")
    println("------------------- EJERCICIOS 2, 3, 4, 5, 6, 7 Y 8 -------------------")

    class Clientes (Nombre: String, Dirección: String, Teléfono: String, Email:String){
    }
    val entelgy = new Clientes("Pedro", "Plaza Mayor, 2", "902254896", "ejemplo@correo.com")
    println(entelgy.toString)

    class Clientes2(Nombre:String, Dirección:String, Teléfono:String, Email:String, private var Cotización:String = "10000") extends Clientes(Nombre, Dirección, Teléfono, Email)

    val entelgy2 = new Clientes2("Pedro", "Plaza Mayor, 2", "902254896", "ejemplo@correo.com","")

    //entelgy2.Cotización = "20000"

    // ------------------- EJERCICIOS 9 -------------------
    println("------------------- EJERCICIOS 9 -------------------")



  }
}

