object Clases {
  def main(args: Array[String]): Unit = {
    // ------------------- UNIDAD 04 -------------------
    // ------------------- EJERCICIOS 2, 3, 4, 5, 6, 7 Y 8 -------------------
    println("------------------- UNIDAD 04 -------------------")
    println("------------------- EJERCICIOS 2, 3, 4, 5, 6, 7 Y 8 -------------------")

    class Clientes (var Nombre: String, var Dirección: String, var Teléfono: String, var Email:String){
    }
    val entelgy = new Clientes("Pedro", "Plaza Mayor, 2", "902254896", "ejemplo@correo.com")
    println(entelgy.toString)

    class Clientes2(Nombre:String, Dirección:String, Teléfono:String, Email:String, private var Cotización:Float = 10000, private var total_cotizaciones: Float = 0) extends Clientes(Nombre, Dirección, Teléfono, Email){
      def setCot(n:Float): Unit ={
        Cotización = n
        total_cotizaciones = total_cotizaciones + n
      }
    }

    val entelgy2 = new Clientes2("Pedro", "Plaza Mayor, 2", "902254896", "ejemplo@correo.com",100)


    entelgy2.setCot(2000)

    // ------------------- EJERCICIOS 9, 10 Y 11 -------------------
    println("------------------- EJERCICIOS 9, 10 Y 11 -------------------")

    val C1 = new Clientes2("N1","D1","TF1","E1",10)
    val C2 = new Clientes2("N2","D2","TF2","E2",20)
    val C3 = new Clientes2("N3","D3","TF3","E3",30)

    // ------------------- EJERCICIOS 12, 13, 14 Y 15 -------------------
    println("------------------- EJERCICIOS 12, 13, 14 Y 15 -------------------")

    class Personas(var Nombre:String,var Dirección:String){
    }
    val Paco = new Personas(Nombre = "Paco", Dirección = "Plaza Mayor 3")

    // ------------------- EJERCICIOS 16, 17, 18, 19, 20 Y 21 -------------------
    println("------------------- EJERCICIOS 16, 17, 18, 19, 20 Y 21 -------------------")

    class Empleado(Nombre:String= "Default", Dirección: String = "Default", Cargo: String = "Default", Sueldo: Float = 10000) extends Personas(Nombre, Dirección){
    }

    val ivan = new Empleado()

    class Jefe(Nombre:String= "Default", Dirección: String = "Default", Cargo: String = "Default",Departamento: String = "Default", Sueldo: Float = 10000) extends Empleado(Nombre, Dirección, Cargo, Sueldo){

    }

    // ------------------- EJERCICIOS 22, 23, 24, 25, 26, 27 Y 28 -------------------
    println("------------------- EJERCICIOS 22, 23, 24, 25, 26, 27 Y 28 -------------------")

    trait Ladrador{
      def ladrar: Unit ={
        println("Guau")
      }
    }

    trait Mordedor{
      def morder: Unit ={
        println("GRRRRR2")
      }
    }


    class Perro(ladrador: Ladrador, mordedor: Mordedor){
    }

    var drogo = new Perro()

    class Galgo(ladrador: Ladrador, mordedor: Mordedor) extends Perro(ladrador, mordedor)




  }
}

