/*
    Loops are a tool used to run an associated block (or line) of code until a condition is no longer true/truthy...While and do-while loops are basic forms of loops

    While loop - Runs until the condition is false/falsy
    Syntax:
    while (condition) {
        // code to execute...
    }

    I *HIGHLY* recommend using curly braces and minding syntax with loops, since they are repeat forever if you are not careful...

    Notice that within both of the loops below, I made sure to use increment operators on the condition variable so that my loops can eventually end
*/
console.log(":::: WHILE LOOPS ::::");
let whileCon = 10;
while (whileCon < 5) {
    console.log("Start of While Loop");
    console.log(whileCon);
    whileCon++;
    console.log("End of While loop...whileCon is now: " + whileCon);
}
console.log("OUTSIDE OF WHILE LOOP");

/*
    do-while loops are similar to while loops; however, they will ALWAYS run the associated code at least once BEFORE checkin the condition. The syntax for do-while loops reflects this:

    Syntax:
    do {
        // code to execute
    } while (condition)
*/
console.log(":::: DO-WHILE LOOP ::::");
let doCon = 10;
do {
    console.log(doCon);
    doCon++;
} while (doCon < 5)

/*
    The combination of loops and conditional statement is an incredibly powerful tools that drives the creation of algorithms, and a means to solve very complex problems
*/
console.log(":::: LOOPS WITH CONDITIONAL STATEMENTS ::::");
let x = 0;

while (x < 10) {
    console.log(x);
    if (x == 5) {
        break; // recall that break statements can be used with switch statements AND loops
    }
    x++;
}