fun main() {
    var sister=Human("Phionah",21,56)
       sister.eat(4)

       sister.weight
    sister.speak("Am ambitious")
      sister.birthday()

    var ayebaza=User("Esther","Matthan","estherayebaza@gmail.com","0776746882",
        "8ayebz3")
    println(ayebaza.lastName)
    println(ayebaza.password)
}
class Human(var name:String,var age:Int,var weight:Int,){
    fun eat(foodWeight:Int){
println(" I am eating $foodWeight kgs of food")
    weight+=foodWeight
    println(weight)
    }
        fun speak(speech:String){
        println("$speech")
        }
    fun birthday(){
        age+=1
        println(age)
    }

}

data class User(val firstName:String,val lastName:String,var email:String,var phoneNumber:String,
 var password:String)

