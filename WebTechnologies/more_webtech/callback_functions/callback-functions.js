/* 
    This is the same dataDetails function we have used in the past... 
*/
function dataDetails(data) {
    console.log("Input Value is: " + data + " it is of type: " + typeof(data) + ". This has a truthy-falsy value of: " + (!!data));
}

// Here we create a function, called myFunc
function myFunc() {
    console.log("Hello World");
}

// What happens when we pass this function into our Data details function?
dataDetails(myFunc);

// remember that we invoke functions be calling the function name followed by parenthesis...
myFunc();

/*
    Since Javascript functions are considered 'first-class functions' We can assign a function as the 'value' stored within variables
*/
let funcVariable = function () {
    console.log("This is a variable, whose value is a function!");
}
dataDetails(funcVariable);
funcVariable();

/* 
    We invoke functions by placing parenthesis after the name of the function. We can also invoke a variable whose value is a function in the same way:

    variableName();
    if this variable has a value that is a function, this syntax would invoke the function this variable is "holding onto".

    When we pass a function as the argument of another function, that is called a 'callback' function.

    This concept can be confusing for new developers, but imagine the following scenario:

        function multiply (a, b) {
            return a * b;
        }

    Is is easy to understand that this function would take two numbers, and multiply their values together...This function assumes that the parameters 'a' and 'b' are both numbers. We apply this same principle when using callback functions. We assume that one of the variables given to the function is a function. The parenthesis are only given a valid context with callback functions when we know to expect a function.

*/
function add (a, b, callback) {
    let sum = a + b;
    callback(sum);
}

let print = function (input) {
    console.log(input);
}

let popup = function (input) {
    alert(input);
}

let a = 5;
let b = 4;

add(a,b,popup);