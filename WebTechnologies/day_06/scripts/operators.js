/* 
    Often you will see this syntax: "::: [TOPIC] :::" - This is simply to denote sections in the dev console when we are examining these files, to improve readability in the console.
*/

/*
    Operators are symbols or reserved words (keywords) in a language
    that are used to perform an action using one or more expressions. The expressions in which an operation are applied are known as the 'operands'.
    
    Operators will provide information back known as the 'result' of
    the operation. When an operator provides this information, this process is known as 'returning' data.

    For example: 
    1 + 2
    This is the 'addition' operation. It will sum the values of the two expressions, in this case 1 and 2 and return a resulting expression of 3.
    
    Operators are resolved based on precedence order. If multiple operators have the same precedence, they are resolved from left-to-right.
    
    There are three categories for operators, Unary, Binary and Ternary which are applied to one, two or three expressions respectively...
*/
console.log("::: UNARY Operators :::");
// Pre-Increment / Decrement Operators : Alter expression value, then return
let pre = 10;
console.log(pre);       // 10
console.log(++pre);     // 11

// Post-Increment / Decrement Operators : Return current expression value, then alter
let post = 10;
console.log(post);      // 10
console.log(post++);    // 10
console.log(post);      // 11

// Not Operator : Return the opposite boolean value for an expression
console.log(true);      // true
console.log(!true);     // false
console.log(false);     // false
console.log(!false);    // true

console.log("::: BINARY Operators [Arithmetic] :::");
console.log(3 + 4);     // 7
console.log("3" + 4);   // 34
console.log(3 - 4);     // -1
console.log(3 / 4);     // .75
console.log(3 * 4);     // 12
/*
    Any number modulus 2 will either give return 0 (even number) or 1 (odd number)
*/
console.log(3 % 2);     // 1
console.log(10 % 2);    // 0
console.log(35 % 3);    // 2 i.e: 3 goes into 35 eleven times evenly (33), and has a remainder of 2.
/*
    Note that When a String is present the '+' will 
    perform String concatenation
*/
console.log("Revature: " + 5 + 2); // Revature: 52. Resolved from left-to-right
console.log("Revature: " + (5 + 2)); // Revature: 7. Parentheses resolved first (higher precedence)
console.log(5 - 2); // 3
console.log(5 * 2); // 10
console.log(5 / 2); // 2.5

console.log("::: BINARY Operators [Comparison] :::");
console.log(1>100);     // false
console.log(1<100);     // true
console.log(100>100);   // false : 100 is not greater than itself
console.log(100<100);   // false : 100 is not less than itself either...
console.log(100>=100);  // true
console.log(100<=100);  // true

console.log(1 != 100);  // true : 1 and 100 are not equal
console.log(1 != 1);    // false : 1 is equal to itself
