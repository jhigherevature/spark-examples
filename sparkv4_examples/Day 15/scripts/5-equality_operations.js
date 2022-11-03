console.log(":::: EQUALITY OPERATORS ::::");
/*
    'Type Conversion/Coersion' attempts to change two expressions
    to the same datatype BEFORE checking if they have the same value or performing some operation on them.

    using == or arithmetic operations: numeric type coercion occurs
        - values will be converted into a number (or NaN)
*/

// Compare using ==
console.log("::: == OPERATION :::");
console.log(1 == "1");      // Results in the boolean value true. When we convert 1 to a string or '1' to a number, they are the same
console.log(1 == 1);        // true. These are the same value and type
console.log("ten" == 10);   // false. Type conversion only applies to the actual expression, not our "human understanding"

// Compare using ===
console.log("::: === OPERATION :::");
console.log(1 === "1");     // false. We do NOT convert 1 to a string or '1' to a number here
console.log(1 === 1);       // true. These are the same value and type