console.log(":::: COMPARISON OPERATORS ::::");
/*
    When we use the '==' we compare the value of two expressions and allow javascript
    to utilize 'type conversion' (also referred to as 'type coercion'). 
    
    'Type Conversion/Coersion' attempts to change two expressions
    to the same datatype BEFORE checking if they have the same value or performing some operation on them.
*/
console.log("::: == OPERATION :::");
console.log(1 == "1");      // Results in the boolean value True. When we convert 1 to a string or '1' to a number, they are the same
console.log(1 == 1);        // True. These are the same value and type
console.log("ten" == 10);   // False. Type conversion only applies to the actual expression, not our "human understanding"

/*
    When we use the '===' we will compare the value of two expressions but NOT allow
    javascript to utilize 'type conversion'. This way, when we compare two expressions
    they must have the same value AND must be the same Datatype

    Comparing with '===' is called a strict comparison
*/
console.log("::: === OPERATION :::");
console.log(1 === "1");     // False. We do NOT convert 1 to a string or '1' to a number here
console.log(1 === 1);       // True. These are the same value and type

/*
When using the '==' Comparison operation if type-conversion is attempted,
the boolean expression will be converted to a number NOT a string.
    -The boolean true will convert to a 1
    -The boolean false will convert to a 0
*/
// console.log(":::: COMPARISONS WITH TYPE CONVERSION (true) ::::");
// console.log(1 == "1");          // This will print true
// console.log(true == 1);         // This will print true
// console.log(true == "1");       // This will print true
// console.log(true == "true");    // This will print false
// console.log(true == true);      // This will print true
// console.log(true == 5);         // This will print false

// console.log(":::: COMPARISONS WITH TYPE CONVERSION (false) ::::");
// console.log(0 == "0");          // This will print true
// console.log(false == 0);        // This will print true
// console.log(false == "0");      // This will print true
// console.log(false == "false");  // This will print false
// console.log(false == false);    // This will print true
// console.log(false == 5);        // This will print false

/* 
    The strict comparison operator '===' prevents type conversion...
*/
// console.log(":::: BOOLEANS WITH STRICT COMPARISONS ::::");
// console.log(true === 1);        // No type conversion. This will print false
// console.log(true === true);     // No type conversion. This will print true
// console.log(false === 0);       // No type conversion. This will print false
// console.log(false === false);   // No type conversion. This will print true

// What will the following print?
// console.log("True and 10>5 is: " + ( true === (10>5) ) );

/*
    NaN is a special, and specific type of data. It is never equal to any other value, even another instance of NaN
*/
// console.log(NaN == NaN);

/*
    undefined and null; however, are always equivalent to other instances of undefined or null i.e. they share a memory address
*/
// console.log(undefined === undefined);
// console.log(null === null);