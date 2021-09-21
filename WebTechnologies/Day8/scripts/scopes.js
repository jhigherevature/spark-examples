/*
    Javascript is a pass-by-value language. This means that we do not manipulate variables used as arguments, instead we copy the value of the argument into a new variable.
*/
function modify(val) {
    val += 5;
    console.log("Val is: " +  val);
    return val;
}

// console.log(val); // error

var a = 10;
modify(a);
console.log(a); // a is still 10
// If you want to change a variable use the assignment operator:
// a = modify(a); // a has been reassigned to 15

/*
    Scopes are isolated sections of our code. As a general rule, any variables created within a particular scope are lost once we leave that scope*. In other words, variables cannot be accessed outside of the scope they are created.

    *'hoisting' can break this general rule...

    Hoisting [informal definition]: The declaration of variables declared with the keyword var AND functions are 'moved' to the top of your code. This way, your computer makes room in memory before running any code.

    Variables declared with var are hoisted in one of two places.
    1 - When outside of a function, they are hoisted to the top of your code file (technically this is to the top of the global context)
    2 - When inside of a function, they are hoisted to the beginning of that function
*/
let l = "Let variable";
var v = "Var variable";
const c = "Const variable";

/*
    Due to hoisting, you can use the declarative keyword, 'var', again in the same scope with no problems, but the same cannot be said for 'let' and 'const'
*/
// let l = "New Let Variable"; // error
// const c = "New Const variable"; // error
// var v = "New Var variable"; // This works. Note this does NOT create a second variable called 'v'

function myFunc() {
    let l = 11111;
    var v = 22222;
    const c = 33333;
    if (true) {
        let l = "Green Eggs";
        var v = "Ham";
        const c = "Cat in the Hat";
        console.log("if statement [let]: " + l);
        console.log("if statement [var]: " + v);
        console.log("if statement [const]: " + c);
    }
    console.log("function [let]: " + l);
    console.log("function [var]: " + v);
    console.log("function [const]: " + c);
}
myFunc();
console.log("outside [let]: " + l);
console.log("outside [var]: " + v);
console.log("outside [const]: " + c);

/*
    We cannot access variables that are declared inside of a "smaller" scope
*/ 
function secondFunc() {
    var funcVar = "Hello World";
    console.log(funcVar);
}

secondFunc();
// console.log(funcVar); // funcVar is NOT accessible


// let num1 = 15;
// let num2 = 25;
/*
    The parameters you establish for functions reside in a different scope than variables created outside of a function. In this case "num1" and "num2" are creating local variables that are used inside of the function below, but we also have separate variables created outside of the function.

    If you invoke this function, it NOT NOT IMPLICITLY USE THE VARIABLES DECLARED OUTSIDE OF THE FUNCTIOn (the values 15, and 25). We must pass information into this invoked function. 'num1' and 'num2' within the function are the local variable names used to reference the information passed to the function
*/
// function add(num1, num2) {
//     console.log(num1 + num2);
// }

// add(60, 100); // Here, '60' would be 'represented' by num1, and '100' would be represented by num2 within the context of the function.

// add(num1, num2); // Here, we are passing in the variables 'num1' and 'num2' we created above, so...15 and 25