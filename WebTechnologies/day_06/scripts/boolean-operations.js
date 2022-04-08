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