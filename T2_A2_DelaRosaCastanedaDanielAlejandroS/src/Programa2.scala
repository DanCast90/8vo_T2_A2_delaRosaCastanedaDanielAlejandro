import scala.math._  
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Programa2 {
  
  
    def main(args: Array[String]): Unit={
     
      var arr=new Array[Int](48)
     var promedios1=new ArrayBuffer[Int]()
      var cont=0
      
      for(x <-0 to arr.length-1){
        if(x%2==0){
          arr(x)=cont
          cont+=1
        }else{
         arr(x)=Random.nextInt(51) 
        }
      }  
     
        for(x <-0 to arr.length-1){
          println(arr(x))
          if(arr(x)==25){
            promedios1+=arr(x-1)
            promedios1+=arr(x)
          }
        }
      if(promedios1.size>0){
        println(promedios1.toString())
        var prom=0
        var cont=0
       for(x <- 0 to promedios1.length-1){
         if(x%2==0){
           prom=prom+promedios1(x)
           cont+=1
         }
       }
        prom=prom/cont
        
        println("El promedio de las horas cuya temperatura es igual a 25 es: "+prom)
        
      }
    }
}