fun main() {
val vehicle=Car("Toyota","LandCruiser","blue",14)
vehicle.carry(16)
    vehicle.Identity()
    vehicle.calculateParkingFees(4)


    val vehicle2=Bus("Isuzu","Legacy","white",40)
    println(vehicle2.maxTripFare(300.0))
    println(vehicle2.calculateParkingFees(5))


}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    //- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
    fun carry(people:Int){
       if (people<=capacity){
           println("Carrying $people passangers")
       }else {val x=people-capacity
           println("Overcapacity by $x people")}

       }
    //- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
fun Identity(){
println("I am a $color $make $model")
}
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
     open fun calculateParkingFees(hours:Int):Int{
        var parkingfees=hours*20
    return(parkingfees)
    }
    }
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)

class Bus( make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double{
        var maxAmount=fare*capacity
        return maxAmount

    }
    //The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
    override fun calculateParkingFees(hours: Int):Int {
//        super.calculateParkingFees(hours)
        var product=hours*capacity
        return product
    }
}

