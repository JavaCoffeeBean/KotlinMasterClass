fun main() {
    val carBrands: Array<String> = arrayOf("Audi","BMW","Mazda","Toyota","Jeep","Honda","Volvo")
    carBrands[0] = "Ferrari"

    println(carBrands[0])

    favCar(carBrands[4])

    var middleBrand: Int = ((carBrands.size - 1) / 2).toInt()

    println("${carBrands[0]} is the first car brand")
    println("${carBrands[middleBrand]} is the middle brand")
    println("${carBrands[carBrands.size - 1]} is the last car brand")

}

fun favCar(brandName: String) {
    println("$brandName is my favorite car brand")
}