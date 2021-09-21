console.log(":::: SWITCH STATEMENTS ::::");
/*
    switch statements are similar to if-else statements; however, they are better suited when you have a good idea of what input you are recieved, or want to check against certain, known values.

    The syntax for switch statements is:
    switch (variable-to-check) {
        case Value_1:
            // code to execute if variableToCheck === Value1
            break;
        case Value2:
            // code to execute if variableToCheck === Value2
            break;
        etc...
        
        default:
            // an option block to include which will execute if no other case is found to match
            // Note that default cases usually appear at the end, but you can technically put them anywhere
            break;
    }
*/
let letter = "F";
// the toUpperCase function just allows us to evaluate uppercase and lowercase letters the same
switch (letter.toUpperCase()) {
    case "A":
        console.log("A for Assembly!");
        break;
    case "B":
        console.log("B for Binary!");
        break;
    case "C":
        console.log("C for Compiled!");
        break;
    default:
        // default is similar to else statements...
        console.log("There are too many letters in the alphabet!");
        break;
}

/*
    The break keyword is used to stop the execution of code within the current switch statement, or loop. Otherwise, a switch statement performs what is known as "fall-through logic", in which the proceeding cases will execute when a match is found...
*/
console.log("WITHOUT THE BREAK KEYWORD");
switch (letter.toUpperCase()) {
    case "A":
        console.log("A for Assembly!");
    case "B":
        console.log("B for Binary!");
    case "C":
        console.log("C for Compiled!");
    default:
        // default is similar to else statements...
        console.log("There are too many letters in the alphabet!");
}