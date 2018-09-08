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

// object methods.
"hello".size // no parentheses if no param supplied. Is still method, not prop?
-20.abs

1.to(10)
1 to 10  // infix syntax