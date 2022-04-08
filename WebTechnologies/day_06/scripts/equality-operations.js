console.log(":::: COMPARISON OPERATORS ::::");
/*
    When we use the '==' we compare the value of two expressions and allow javascript
    to utilize 'type conversion' (also referred to as 'type coercion'). 
    
    'Type Conversion/Coercion' attempts to change two expressions
    to the same datatype BEFORE checking if they have the same value or performing some operation on them.
*/
console.log("::: == OPERATION :::");
console.log(1 == "1");      // Results in the boolean value True. When we convert 1 to a string or '1' to a number, they are the same
console.log(1 == 1);        // True. These are the same value and type
console.log("ten" == 10);   // False. Type conversion only applies to the actual expression, not our "human understanding"

/*
    When we use the '===' we will compare the value of two expressions but NOT allow
    javascript to utilize 'type coercion'. This way, when we compare two expressions
    they must have the same value AND must be the same Datatype

    Comparing with '===' is called a strict comparison
*/
console.log("::: === OPERATION :::");
console.log(1 === "1");     // False. We do NOT convert 1 to a string or '1' to a number here
console.log(1 === 1);       // True. These are the same value and type
console.log("one" === "1"); // False, datatype AND value must match

// What will the following print?
// console.log("True and 10>5 is: " + ( true === (10>5) ) );

// console.log("::: SPECIAL CASES :::");
/*
    NaN is a special, and specific type of data. It is NEVER equal to any other value, even another instance of NaN
*/
// console.log(NaN == NaN);

/*
    undefined and null; however, are always equivalent to other instances of undefined or null i.e. they share a memory address
*/
// let undef;
// console.log(undef === undefined);

// let nothing = null;
// console.log(nothing === null);