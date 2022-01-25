package tcsfrescoplay.kotlinultimatesalto.course

/**
 * # Kotlin Generics
- Generics are the powerful features that allow to define classes, methods, and properties etc. which can be accessed using different types. The type differences of classes, methods, etc. are checked at compile-time.

- The generic type class or method is declared as parameterized type. A parameterized type is an instance of generic type with actual type arguments. The parameterized types are declared using angle brackets <> Generics are mostly used in collections.
 */

class Person<T>(var age: T) {
    init {
        this.age = age
        println(age)
    }
}

fun main(args: Array<String>) {
    var ageInt: Person<Int> = Person<Int>(30)
    var ageString: Person<String> = Person<String>("40")
}