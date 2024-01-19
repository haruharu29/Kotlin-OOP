//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val dog0:Animal = Dog("Hachiko")
    val cat0:Animal = Cat("Tom")
    val mouse0:Animal = Mouse("Jerry")
    moveAndMakeASound(dog0)
    moveAndMakeASound(cat0)
    mouse0.makeASound()
}

fun moveAndMakeASound(animal:Animal){
    animal.move("forward")
    animal.makeASound()
}