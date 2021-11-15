console.log("::: NOT OPERATION :::");
console.log(!true);                 // false
console.log(!false);                // true

console.log(":::: AND OPERATION ::::");
console.log(true && true);          // true
console.log(true && false);         // false
console.log(false && true);         // false
console.log(false && false);        // false

console.log(":::: OR OPERATION ::::");
console.log(true || true);          // true
console.log(true || false);         // true
console.log(false || true);         // true
console.log(false || false);        // false

console.log(":::: MORE COMPLEX BOOLEANS ::::");
console.log((true || false) && true);   // true
console.log((true && false) && true);   // false
console.log((true || false) && false);  // false
console.log((true && false) && false);  // false
console.log((true || false) || true);   // true
console.log((true && false) || true);   // true
console.log((true || false) || false);  // true
console.log((true && false) || false);  // false


/*
    If you do not wrap code in parenthesis () the && operator takes precedence:
*/ 
// console.log(":::: OPERATOR PRECEDENCE ::::");
console.log((true || false) && false);  // false with ()
console.log(true || false && false);    // true without ()

/*
For && Operations, the comparison is as follows:
    1 - Evaluate the operands from left to right
    2 - For each operand, check the truthy or falsy value.
    3 - Return the first falsy value if available. 
    4 - If no falsy values exist, return the last truthy value.
*/
// console.log(":::: TRUTHY/FALSY: && OPERATIONS ::::");
// console.log(5 && true);     // this will print true
// console.log(true && 5);     // this will print 5
// console.log(false && 5);    // this will print false
// console.log(5 && false);    // this will print false  
// console.log(0 && 5);        // this will print 0
// console.log(0 && false);    // this will print 0
// console.log(false && 0);    // this will print false

/*
For || Operations, the comparison is as follows:
    1 - Evalute the operands from left to right
    2 - For each operand, check the truthy or falsy value
    3 - Return the first truthy value if available. 
    4 - If no truthy values exist, return the last falsy value.
*/
// console.log(":::: TRUTHY/FALSY: || OPERATIONS ::::");
// console.log(5 || true);     // this will print 5
// console.log(true || 5);     // this will print true
// console.log(false || 5);    // this will print 5
// console.log(5 || false);    // this will print 5
// console.log(0 || 5);        // this will print 5
// console.log(0 || false);    // this will print false
// console.log(false || 0);    // this will print 0


// console.log(":::: BONUS: XNOR (exclusive Not Or) ::::");
// console.log(":::: BONUS: NOR (Not Or)::::");
// console.log(true ^ true);
// console.log(true ^ false);
// console.log(false ^ true);
// console.log(false ^ false);
// console.log(":::: BONUS: XNOR ::::");
// console.log(!(true ^ true));
// console.log(!(true ^ false));
// console.log(!(false ^ true));
// console.log(!(false ^ false));