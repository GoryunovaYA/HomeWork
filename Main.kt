fun main () {

//Эта программа считает объем параллелепипеда

    println("Высота")
    val side1 = readln().toInt()
    println("Ширина")
    val side2 = readln().toInt()
    println("Длина")
    val side3 = readln().toInt()

    val volume = side1*side2*side3

    print("Объем параллелепипеда: ")
     println(volume)
}
