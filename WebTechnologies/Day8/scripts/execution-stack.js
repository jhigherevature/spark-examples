/*
    The 'Execution Stack' is a record of functions that are invoked or flow control statements to keep track of which part of a program we are actively performing. When using Flow control statements, we are controling the flow of this execution stack momentarily.

    If a function or flow control statement has another nested function call or flow control statement, you must fully complete the 'inner' statements associated scope before you are able to complete the 'outer' statements.
*/
console.log("::: EXECUTION STACK - FUNCTIONS :::");
function first() {
    console.log("Inside first function");
    second();
    console.log("Exiting first function");
}

function second() {
    console.log("inside second function");
    // Other code...calculations or logic, etc...
    console.log("exiting second function");
}

console.log("::: Global Execution Context :::");
first();
console.log("::: Back inside Global Execution Context :::");


console.log("::: EXECUTION STACK - LOOPS :::");
function loopFunc() {
    console.log("Entering LoopFunc");
    var a = 0;
    while (a < 5) {
        console.log(a);
        innerFunc();
        a = Number(prompt("give me a number:"));
    }
    console.log("Leaving LoopFunc");
}
function innerFunc() {
    console.log("Entering innerFunc");
    alert("Hello There!");
    console.log("Leaving innerFunc");
}

console.log("::: Global Execution Context :::");
loopFunc();
console.log("::: Back inside Global Execution Context :::");