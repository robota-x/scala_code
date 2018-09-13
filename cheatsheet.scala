// package cheatsheet  // package name. commented out as this is run as script
// comment

/*
    multiline comment
*/

// primitives
1
true
'f'
"hello!"
List(1,2,3)  // immutable, preferred over array
Array(1,2,3)

// concatenation
Array(1,2,3) ++ Array(1,2,3)
"hello" ++ " there"
"hello" + " there"  // string-specific

// vars and type annotation
val salute : String = "Hello Scala"
val inferredValue = 12  // camelcase

var variable : Int = 40
variable = 30  // type can't be changed

// print command
println(salute)

// operators
!true && false || true
if (true) 1 else 0

// object methods
"hello".size // no parentheses if no param supplied. Is still method, not prop?
-20.abs

1.to(10)
1 to 10  // infix syntax

// method definition
def triple(x: Double): Double = x * 3  // implicit return
val anonymousSquare = (x: Int) => x * x  // assigned to a val just to reference it

// recursion
def factorial(n: Int): Int = if(n==0) 1 else factorial(n-1) * n

factorial(17)  // unguarded overflow :(

// loops
val numberList = List(1,2,3,4,5)

for (number <- numberList if number % 2 == 0) {  // inline filter condition
    println(number)
}

for {  // inline nested looping
  numberA <- numberList
  numberB <- numberList
} println(numberA + " | " + numberB)

for (number <- numberList) yield { number * number } // functional for loop yielding a block

// closures and block expressions
def doubleAndOne(x: Int): Int = { 
    def innerDouble(y: Int): Int = y * 2  // scoped definition
    
    innerDouble(x) + 1
}

def doubleWithBlock(x: Int): Int = {
    val double = { x * x }  // all blocks are expressions
    double
}

// objects and imports
// import cheatsheet.Bar  // not sure if it works...

object myProgram {
    // Bar.sayHi

    def main(args: Array[String]) = println("main method")  // entry point for execution
}

// Higher order functions
val numberList = List.range(1, 11)

numberList.filter(number => number % 2 == 0)
numberList.filter(_ % 2 == 0)  // underscore parameter placeholder

// Function annotation
def square(x: Int): Int = x * x  // fully annotated
def square(x: Int) = x * x  // inferred return type

val anonymousSquare = (x: Int) => x * x: Int  // fully annotated
val anonymousSquare = (x: Int) => x * x  // inferred return type, most common?
val anonymousSquare: Int => Int = x => x * x  // another way to annotate?

List(1,2,3).map(x => x * x)  // inferred everything, only admitted in inline anonymous function
