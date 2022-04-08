/*
    Functions are constructs that can be used to hold onto an isolated set of statements, which, when the function is invoked, can be executed in a batch. Functions are particularly useful because you can declare parameters (placeholder values) for a function and substitute real values later.

    Important terminology:
    -Declaration : Creation of a function using the keyword 'function'
    -Invocation : Execution of the statements which comprise a function by stating the function's name followed by a set of parentheses.
    -Parameters : placeholders for data that we can provide a function at a later time. Parameters are declared when a function is being declared
    -Arguments : the actual information that we provide to a function when we invoke it!
 */

function myFuncOne() {
    console.log("This is my first Function!");
}
myFuncOne();

/*
    The parameter is 'input'
*/
function myFuncTwo(input) {
    console.log("Your input was: " + input);
}
/*
    The argument is "Revature"
*/
myFuncTwo("Revature");

/*
    As stated previously, the power of a function allows you to create a general template for what actions you want to perform, then substitute the actual values later. Here, we can add any two numbers together.
*/
function performAddition(a, b) {
    console.log(a + b);
}
performAddition(5, 20);
performAddition(100, 3.14);

/*
    Note that Javascript does not check the datatype for parameters and their arguments, and as such, it is up to you as a developer to structure your code in a way that logically makes sense based on the type of input your are expecting. (There are design patterns that can work around this, but we will not discuss those here)
*/
function myFuncThree(inputOne, inputTwo, inputThree) {
    console.log("Input One was: " + inputOne);
    console.log("Input Two was: " + inputTwo);
    console.log("Input Three was: " + inputThree);
}
myFuncThree("Hello", true, 10+15);

/*
    A final note about Functions for now...
    Functions may "return" data. The act of "returning" information in programming is very important to understand, and we will discuss this again when talking about Operators. "Returning" data simply means that, an expression is provided by some entity and can be used similar to a variable. This includes assigning the returned data to a variable, using the returned data as an argument of another function, or as part of an operation.

    In a function, the keyword 'return' is used to return data.
*/
function giveTwenty() {
    return 20;
}
let twenty = giveTwenty(); // assigns the value 20 to the variable 'twenty'
