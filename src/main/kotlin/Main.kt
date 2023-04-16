fun main(){
    var namesArray= arrayOf("Ann","Annah","Siny","Hannah")
    val name =namesArray.get(3)
    println(name)

    namesArray.set(2, "becky")
    print(namesArray.get(2))

    var index = namesArray.indexOf("becky")
    println(index)

    var numArray = arrayOf(23,7,0,19,67,29,64,3)
    var numElements = numArray.count()
    println(numElements)

    var minValue = numArray.minOrNull()
    println(minValue)

    
}