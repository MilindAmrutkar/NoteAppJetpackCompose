package com.backtocding.kotlin_learning

/**
Dependency - an object that another object requires to function
Car <- Engine
 */

class Engine() {
    fun start() {
        println("Petrol Engine started...")
    }
}

class DieselEngine() {
    fun start() {
        println("Diesel Engine Started...")
    }
}

class Car(val engine: Engine, val dieselEngine: DieselEngine) {
    // val engine = Engine() // not good
    fun startCar() {
        println("Starting car...")
    }
}

fun main() {
    val engine = Engine()

    /**
     * This is better, we are no longer violating our Single Responsibility Principle
     * bcoz the car is not attached to the Engine as we had before.
     * Everytime we create a car previously, we would have to also go ahead and create the engine,
     * which gets attached inside as a property, inside of Car class.
     * Now, that is no longer the case, bcoz now what happens is that we're passing the engine object,
     * engine type as a parameter in our constructor.
     * So for instance, let's say we want to create another kind of engine let's say
     * DieselEngine, we can easily have it.
     * So as you can see here, you can inject as many engines as we want
     * and we won't need to come and change anything inside of our class, the main class which is Car class.
     * Bcoz the way things were before, every time we would have to come inside of our car
     * and create another engine
     *
     */
    val dieselEngine = DieselEngine()
    val car = Car(engine, dieselEngine)
    car.startCar()
    car.engine.start()
    car.dieselEngine.start()
}