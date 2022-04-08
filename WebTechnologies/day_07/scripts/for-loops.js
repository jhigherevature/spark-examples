console.log("::: FOR LOOPS :::");
/*
    for loops will also loop code continuously; however, the syntax provides more control for exactly how many times our loop runs and when.

    Syntax:
    for (initialization; condition; modification) {
        // Code to execute
    }

        -initialization :   A statement used to establish a variable for use within the for-loop. 
                            The variable is used to  keep track of how many times our for-loop will 'iterate' (repeat)

        -condition :    An expression used to determine when our loop will execute. 
                        When the condition has a truthy value, our loop will run. As soon as it has a falsy value, our loop will cease.

        -modification : A statement which is executed at the end of each iteration of our for-loop. 
                        It is used to adjust the value of our initialized variable, so that our loop will eventually end.

    For loops are better when you know (or can easily find out) how many times you want to loop your code
*/

/*
    Explanation of the for-loop below:
    i is a variable we create for use in this for loop. Notice that we use the let keyword to create this variable for this loop. Arrays so commonly use a variable that starts at 0 and increases that it is commonly referred to as the 'incrementing variable'. This is why you typically see the letter 'i' used in arrays.

    The condition is: "so long as this variable is less than 5" our code will execute

    Finally, the modification increases i each time the loop runs
*/
for (let i = 0; i < 5; i++) {
    console.log("The variable i is: " + i);
}

/*
    Note, we can establish our for-loop, condition and modifications in many different ways:
*/
console.log("=== === ==="); // So that our console is a bit easier to read...
for (let x = 9; x >= -50; x= x - 10) {
    console.log("The variable x is: " + x);
}

console.log("=== === ===");
for (let y = 3; y == 3; y=0) {
    console.log("The variable y is: " + y);
}

/*  
    Note that all statements of a for-loop are technically optional. By default, the condition of a for-loop is given a boolean value of 'true'. This means that the following example would loop forever:
    let someVariable = 1;
    for ( ; ; ) {
        someVariable++;
        console.log(someVariable);
    }
*/


/*
    for-loops are most commonly used with Arrays, or some other collection of information
    
    Recall that we can interact with elements in an array using the element's index:
    letterArray[0]; // "A"
    letterArray[1]; // "B"
    letterArray[2]; // "C"
    ...

    This means we can use the incrementing variable of a for-loop to access the indexes of an array, one at a time
*/
console.log("::: LOOPS AND ARRAYS :::");
let letterArray = ["A","B","C","D","E","F","G"];
for (let index = 0; index < letterArray.length; index++) {
    console.log("Index is: " + index);
    console.log(letterArray[index]);
}

/*
    For loops are used so often with arrays, there is actually two short-hand versions for them...

    When using a for-of loop, you establish a variable that is used as a placeholder which adopts the value of each element of a collection.

    Another way to look at this, imagine creating a variable for each item in the letterArray then printing that variable to the console...this is what the variable 'letter' represents. i.e.:
        for (let i = 0; i < letterArray.length; i++) {
            let letter = letterArray[i];
            console.log(letter);
        }
*/
console.log("::: FOR-OF LOOPS :::");
for (let letter of letterArray) {
    console.log(letter);
}


/*
    A for-in loop is similar to a for-of loop, but instead the variable we create (letterPos) adopts the value of indexes within our array that have a value...This way, we can skip all of the spaces that do not have a value.

    Recall that we can increase the size of an array using [] to access an index that does not exist...
*/
console.log("::: FOR-IN LOOPS :::");
letterArray[25] = "Z";  // This adds the letter "Z" to the 25th index (26th item) in our array
console.log("'NORMAL' For-loop");
for (let index = 0; index < letterArray.length; index++) {
    console.log("Index is: " + index);
    console.log(letterArray[index]);
}

console.log("FOR-IN loop")
console.log(letterArray);
for (let letterPos in letterArray) {
    console.log("Index is: " + letterPos);
    console.log(letterArray[letterPos]);
}