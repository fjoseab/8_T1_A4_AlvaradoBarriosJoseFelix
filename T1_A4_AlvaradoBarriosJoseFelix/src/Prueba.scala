import scala.io.StdIn._
import scala.math._ 
object Prueba {
  
  def main(args: Array[String]): Unit = {
     println("Ingrese numero de elementos")
     var num = readInt()  
     var datos = new Array[Double](num)
      for(x <- 0 to (num-1)){
        println("Ingrese dato "+(x+1))
        datos(x)=readDouble()
      }
     mosrarVector(datos)
     datoscalculados(media(datos), desviacion(media(datos), datos))
  }
  def media(d: Array[Double]) : Double ={
    var media: Double=0.0
     for(e <- d){
      media=media+e
    }
    media=media/d.length
    return media
  }
  
  def desviacion(m: Double,d: Array[Double]) : Double ={
    var sumatoria: Double=0.0
     for(e <- d){
      sumatoria=sumatoria+(pow((abs(m-e)), 2))
    }
    sumatoria=sumatoria/d.length
    sumatoria=sqrt(sumatoria)
    return sumatoria
  }
  
  def datoscalculados(m: Double, d:Double) : Unit ={
    println("Media: "+m)
    println("Desviacion: "+d)
  }
  
 def mosrarVector(v: Array[Double]) : Unit ={
   print("Datos: ")
    for(elemento <- v){
      print(elemento +" -> ")
    }
  }
  
  
}