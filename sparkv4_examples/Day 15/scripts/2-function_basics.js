
/* ------------------- Using Functions ---------------------------*/

// 1. calling a built-in function
console.log("hello world!");

// 2. declaring a function: syntax and hoisting (hoisting is optional)
myFunc();

function myFunc() {
    console.log("hello from my Func!");
}

myFunc();

// 3. creating a function that takes in input
function takeInput(input) {
    // console log a string with the input included
    console.log("My parameter's value " + input);
    // create a local variable
}

// call takeInput
takeInput("Bob");
takeInput(5);

// 4. create function that returns value
function returnTwenty() {
    return 20;
}

// create a variable and assign it was is returned from function call
let myValue = returnTwenty();
let myOtherValue = 50 - returnTwenty();
// use variable
console.log(myValue);
console.log(myOtherValue);


