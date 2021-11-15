/*
    Functions are constructs that can be used to hold onto an isolated set of
    statements, which, when the function is invoked, can be executed in
    a batch

    Important terminology:
    Declaration : creation of a function using the keyword 'function'

    Invocation : Utilize the functionality/actions of a function by stating the function's
            name followed by a set of parentheses.

    Parameters : placeholders for data that we can provide a function at a later time.
            parameters are declared when a function is being declared

    Arguments : the actual information that we provide to a function when we invoke it!
 */

function myFuncOne() {
    console.log("This is my first Function!");
}

myFuncOne();
myFuncOne();
myFuncOne();

function myFuncTwo(input) {
    console.log("Your input was: " + input);
}
myFuncTwo("Revature");

/*
    Note that Javascript does not check the datatype for parameters and their arguments, and
    as such, it is up to you as a developer to structure your code in a way that logically
    makes sense based on the type of input your are expecting. (There are design patterns
    that can work around this, but we will not discuss those here)
*/
function myFuncThree(inputOne, inputTwo, inputThree) {
    console.log("Input One was: " + inputOne);
    console.log("Input Two was: " + inputTwo);
    console.log("Input Three was: " + inputThree);
}
myFuncThree("Hello", true, 10+15);
