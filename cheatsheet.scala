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
Array(1,2,3)

// concatenation
Array(1,2,3) ++ Array(1,2,3)
"hello" ++ " there"
"hello" + " there"  // string-specific

// vars and type annotation
val salute : String = "Hello Scala"
val inferredValue = 12

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

def sumOfTriples(x: Double, y: Double): Double = triple(x) + triple(y)

def inferredTriple(x: Int) = x * 3  // params are never inferred in defs

List(1,2,3).map(x => x*2)  // params can be inferred in inline anonymous functions

// recursion loop
def factorial(n: Int): Int = if(n==0) 1 else factorial(n-1) * n

factorial(17)  // unguarded overflow

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