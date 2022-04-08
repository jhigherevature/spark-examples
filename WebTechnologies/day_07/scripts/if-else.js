console.log(":::: IF STATEMENTS ::::");
/*
    Flow control statements are statements which begin with a particular reserved word, and allow you to dictate the execution of code in your program. Based on the type of flow-control statement used, you can skip over portions of your code, select a particular portion of your code to run, or even repeat a section of code multiple times.
*/

/*
    If/else statements are the most common and most basic flow-control statement. Using a boolean expression as a 'condition', you can perform one of two different actions.

    In javascript, if statements will check the truthy-falsy value of an expression, and will execute the immediately following line or block of code if the expression is truthy
*/

let x = 1000;
if (x < 10) {
    console.log("x is less than 10");
    x = "Apple";
}
console.log(x);

if ("revature")
    console.log("Remember that the truthy/falsy value of expressions are used in Javascript!");

/*
    Note that the removal of curly braces can have an impact on your code...the following code would NOT work the same as above:
    if (x < 10)
        console.log("x is greater than 10");
        x = "Apple";

    console.log(x);

    If you do NOT use curly braces, than the if-statement only applies to the immediate line of code. The line 'x = Apple' would ALWAYS execute, since the web browser would treat this code as follows:

    if (x < 10) {
        console.log("x is greater than 10");
    }

    x = "Apple";
    console.log(x);
*/

if (false); {
    console.log("Hi there!");
}
/* 
    Additionally, keep in mind the use of semi-colons...they are used to end a statement...
    The above code looks like it should NOT print the console.log statement; however, the semi-colon following the if-statement makes the code function like the following:

    if (false) {
        ;
    }

    {
        console.log("Hi There!");
    }
*/


/*
    else statements can be used with an if-statement to add more depth to our logic. The else block will occur when the condition for the if-statement has a falsy value
*/
console.log("::: ELSE STATEMENTS :::");
let ageInput;
// ask for input...
if (ageInput == null || ageInput == undefined) {
    alert("Please provide a value for your age");
} else {
    console.log("The expression was false!");
}

console.log("The if-else is done!");


/*
    We can add more complexity still by applying more if-statement after the first if...
    
    ** Note, this is commonly referred to as an 'else-if' statement, but in reality this is just a more advanced application of if-and else keywords. Javascript (and most all programming languages for that matter) only recognize the if keyword and else keyword...
*/
console.log("::: ELSE-IF STATEMENTS :::");
let y = 10;
if (y === 0) {
    console.log("Y is 0");
} else if (y >= 1 && y <= 5) {
    console.log("Y is between 1 and 5");
} else if (y === 2) {
    // This code can NEVER be reached...
    console.log("Y is 2");
} else if (y <= 10) {
    console.log("Y is still 10 or less");
} else {
    console.log("y is outside of my range");
}

/*
    if statement blocks are mutually exclusive. This means that only one will ever occur when we have multiple in the same if-block structure. If you have more general conditions, those should always come after the specific conditions...For the example above, the block...

    else if (y === 2) {
        console.log("Y is 2");
    }

    ...can never be reached. This is because the condition above executes when the value of y is between 1 and 5...well 2 is within that range, but it can only reach this check if the if-blocks above evaluate to false. y cannot simulataneously be outside of the range 1-5 AND by the number 2, and as such, this code is unreachable...
*/

/*
    You can also nest if-else statement blocks to get more complex code when needed:
*/
console.log("::: NESTED IF-STATEMENTS :::");
let age = 14;
let moveRating = "R";
let parentAccompany = false;
if (moveRating == "R") {
    if (age >= 18) {
        printMovieMessage(true, "R");
    } else if (age > 13 && parentAccompany) {
        printMovieMessage(true, "R");
    } else {
        printMovieMessage(false, "R");
    }
} else if(moveRating == "PG-13") {
    if (age > 13) {
        printMovieMessage(true, "PG-13");
    } else if (age > 10 && parentAccompany) {
        printMovieMessage(true, "PG-13");
    } else {
        printMovieMessage(false, "PG-13");
    }
} else {
    printMovieMessage(true, "PG");
}

function printMovieMessage(canWatch, rating) {
    if (canWatch) {
        // The return keyword will halt the execution of code in a function...as such, this does not require an else...
        return "You can watch this rated: " + rating + " movie!";
    }
    return "Sorry, you can't watch: " + rating + " movie";
}


/*
    Ternay Operators (?) act as a shorthand for if-else statements. Ternary operators will return a value based on the truthy-falsy value of the preceeding expression.

    The syntax for Ternary operators is as follows:
    <expression-to-evaluate> ? <expression-to-return-if-true> : <expression-to-return-if-false>
*/
console.log(":::: TERNARY OPERATOR ::::");

true ? console.log("Ternary was True!") : console.log("Ternary was False!");
false ? console.log("Ternary was True!") : console.log("Ternary was False!");

let ter = 0;
ter = true ? 15 : "other";
console.log(ter); // prints 15
ter = false ? 15 : "other";
console.log(ter); // prints 'other'

/*
    An equivalent if-else statement to the above would be as follows
*/
let equivalent = 0;

if (true) {
    equivalent = 15;
} else {
    equivalent = "other";
}
console.log(equivalent);

if (false) {
    equivalent = 15;
} else {
    equivalent = "other";
}
console.log(equivalent);


let word = "cats";
let decision = true;
if (word.length > 10) {
    word = decision ? "The decision was true" : "The decision was not true";
} else {
    word = decision ? "The word was small, but the decision was true" : "The word was small and the decision was not true";
}

let checker = (word == "programming") ? "yep" : "nope";