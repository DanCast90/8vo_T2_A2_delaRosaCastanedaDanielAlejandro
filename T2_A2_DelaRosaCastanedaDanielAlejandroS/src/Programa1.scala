

object Programa1 {
  
   def califParciales(arr: Array[Int]): Int={
     var calif=0
     for(x <- 0 to 5){
       calif+=arr(x)
     }
     calif=calif/6
     calif
   }
   
   def califMateria(arr: Array[Int],arr2: Array[Int],arr3: Array[Int],arr4: Array[Int]):Unit={
     var prom=0
     for(x <- 0 to 5){
       prom=arr(x)+arr2(x)+arr3(x)+arr4(x)
       prom=prom/4
       println("El promedio de la materia "+ (x+1)+ " es: "+prom)
       prom=0
     }
   }
   
    def califGeneral(arr: Array[Int],arr2: Array[Int],arr3: Array[Int],arr4: Array[Int]):Unit={
     var prom=0
     var prom1=0
     for(x <- 0 to 5){
       prom=arr(x)+arr2(x)+arr3(x)+arr4(x)
       prom=prom/4
       prom1=prom1+prom
     }
     println("El promedio general es: "+(prom1/6))
   }
  
  
   def main(args: Array[String]): Unit={
     
     val calif1=Array(100,70,80,50,80,90)
     val calif2=Array(90,60,90,10,100,90)
     val calif3=Array(80,90,50,100,30,100)
     val calif4=Array(100,40,80,90,90,90)
     
     
     println("El promedio del parcial 1 es: "+califParciales(calif1))
     
     println("El promedio del parcial 2 es: "+califParciales(calif2))
     
     println("El promedio del parcial 3 es: "+califParciales(calif3))
     
     println("El promedio del parcial 4 es: "+califParciales(calif4))
     califMateria(calif1, calif2, calif3, calif4)
     califGeneral(calif1, calif2, calif3, calif4)
     
   }
  
}