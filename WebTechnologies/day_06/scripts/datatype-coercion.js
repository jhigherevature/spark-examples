/*
    Datatype Coercion in Javascript will allow certain operators to change the recognized datatype of a variable into that of another datatype. Note that some operations will NOT result in coercion.
*/
console.log(":::: NUMERIC TYPE COERCION ::::");
let numWord = "10";

/*
    Most mathematical operations will coerce values into numbers.
*/
let value = numWord * 5;
console.log ("'10' * 5");
console.log(value); // prints 50

value = numWord / 5;
console.log ("'10' / 5");
console.log(value); // prints 2

value = numWord - 5;
console.log ("'10' - 5");
console.log(value); // prints 5

/*
    Keep in mind that the '+' operator does NOT coerce to a number when a String value is present. If a String is present, other values will instead be coerced to a String.
*/
let sum = numWord + 5;
console.log ("'10' + 5");
console.log(sum); // prints "105". Since "10" is a String, it will concatenate (append) 5 to the end of the string, i.e. "10" followed by "5". "105".


/*
When using the '==' Comparison operation if type-coercion is attempted,
the boolean expression will be converted to a number NOT a string.
    -The boolean true will convert to a 1
    -The boolean false will convert to a 0
*/
// console.log(":::: BOOLEAN TYPE COERCION WITH COMPARISONS (true) ::::");
// console.log(1 == "1");          // This will print true
// console.log(true == 1);         // This will print true
// console.log(true == "1");       // This will print true
// console.log(true == "true");    // This will print false
// console.log(true == true);      // This will print true
// console.log(true == 5);         // This will print false

// console.log(":::: BOOLEAN TYPE COERCION WITH COMPARISONS (false) ::::");
// console.log(0 == "0");          // This will print true
// console.log(false == 0);        // This will print true
// console.log(false == "0");      // This will print true
// console.log(false == "false");  // This will print false
// console.log(false == false);    // This will print true
// console.log(false == 5);        // This will print false

/* 
    The strict comparison operator '===' prevents type coercion...
*/
// console.log(":::: BOOLEANS WITH STRICT COMPARISONS ::::");
// console.log(true === 1);        // No type coercion. This will print false
// console.log(true === true);     // No type coercion. This will print true
// console.log(false === 0);       // No type coercion. This will print false
// console.log(false === false);   // No type coercion. This will print true