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

    class Clientes2(Nombre:String, Dirección:String, Teléfono:String, Email:String, private var Cotización:Float = 10000, private var total_cotizaciones: Double = 0.0) extends Clientes(Nombre, Dirección, Teléfono, Email)

    val entelgy2 = new Clientes2("Pedro", "Plaza Mayor, 2", "902254896", "ejemplo@correo.com",100)

    //entelgy2.Cotización = "20000"

    // ------------------- EJERCICIOS 9 -------------------
    println("------------------- EJERCICIOS 9 -------------------")

    val C1 = new Clientes2("N1","D1","TF1","E1",10)
    val C2 = new Clientes2("N2","D2","TF2","E2",20)
    val C3 = new Clientes2("N3","D3","TF3","E3",30)


  }
}

