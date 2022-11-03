/*
    Scopes are isolate sections of our code. As a general rule, any variables created within a particular scope are lost once we leave that scope*. In other words, variables cannot be accessed outside of the scope they are created.

    *'hoisting' can break this general rule...

    Hoisting [informal definition]: The declaration of variables (declared with var) AND function definitions are 'moved' to the top of your code. This way, your computer makes room in memory before running any code.

    Variables declared with var are hoisted in one of two places.
    1 - When outside of a function, they are hoisted to the top of your code file (technically this is to the top of the global context)
    2 - When inside of a function, they are hoisted to the beginning of that function
*/

console.log("::: SCOPES :::");

// 1. create variable(s) in global scope. explain where they are accessible
let l = "Let variable";
var v = "Var variable";
const c = "Const variable";

function myFunc() {
    // 2. create variable(s) in function scope. explain where they are accessible
    let l = 11111;
    var v = 22222;
    const c = 33333;

    if (true) {
        // 3. create variable(s) in block scope. explain where they are accessible
        let l = "Green Eggs";
        var v = "Ham"; 
        const c = "Cat in the Hat";
        console.log("if statement [let]: " + l);
        console.log("if statement [var]: " + v);
        console.log("if statement [const]: " + c);
    }

    // vars are hoisted to top of function or global scope
    console.log("function [let]: " + l);
    console.log("function [var]: " + v); 
    console.log("function [const]: " + c);
}

// myFunc();
console.log("outside [let]: " + l);
console.log("outside [var]: " + v);
console.log("outside [const]: " + c);

/*
    4. Due to hoisting, you can use the declarative keyword, var, again in the same scope with no problems, but the same cannot be said for 'let' and 'const'
*/

// let l = "New Let Variable"; // This doesnt work...
// const c = "New Const variable"; // Neither does this...
var v = "New Var variable"; // This seemingly does, but it actual replaces existing v

// console.log("outside [var]: " + v);