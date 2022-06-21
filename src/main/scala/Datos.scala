object Datos {
  def main(args: Array[String]): Unit = {
  // ------------------- UNIDAD 02 -------------------
    // ------------------- EJERCICIOS 3, 4, 5 Y 6 -------------------

    val tupla = (1, 2)
    tupla.productIterator.foreach{i => println("Valor = " + i)}

    var lista_50 = List.range(1, 51)
    for(x <- lista_50){
      print(" " + x)
    }


    lista_50 = lista_50 ::: List(51,52,53)
    for(x <- lista_50){
      print(" " + x)
    }



    var cliente1: List[String] = List("Cliente1", "Dirección1", "Teléfono1", "Email1","Facturación Total")
    var cliente2: List[String] = List("Cliente2", "Dirección2", "Teléfono2", "Email2", "Facturación Total")
    var mapa: Map[Int, List[String]] = Map()
    mapa += (1 -> cliente1)
    mapa += (2 -> cliente2)
    mapa.keys.foreach{
      i => println("Clave = "+ i)
        println("Valor = " + mapa(i))
    }


    // ------------------- EJERCICIOS 6, 7, 8 Y 9 -------------------


  var ipsum: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    var a = ipsum.count(_==' ')
    var b = ipsum.length
    var c = ipsum.contains("ipsum")
    println(a)
    println(c)


    // ------------------- EJERCICIO 10 -------------------


    var listado = List.range(1,10)
    var listmap = listado.map(a => a + 15)
    println(listmap)

    // ------------------- UNIDAD 03 -------------------
    // ------------------- EJERCICIOS 1 -------------------









  }
}
