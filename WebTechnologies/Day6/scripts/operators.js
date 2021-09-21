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
*/
console.log("::: COMMON ARITHMETIC OPERATORS :::");
console.log(5 + 2); // 7
/*
    Note that When a String is present the '+' will 
    perform String concatenation
*/
console.log("Revature: " + 5 + 2); // Revature: 52
console.log("Revature: " + (5 + 2)); // Revature: 7
console.log(5 - 2); // 3
console.log(5 * 2); // 10
console.log(5 / 2); // 2.5

/*
    The modulus (%) operator, also known as the 'remainder' operator
    will perform a division operation and the return the remainder as a 
    whole number.

    This is a commonly used operator for finding odd or even numbers using 2.
*/
console.log(5 % 2); // 1

/*
    Operators generally fall into 3 categories. Unary operators, Binary operators and Ternary operators. Unary operators only apply to a single operand. Binary operators apply to two operands, and ternary apply to three operands.
*/
console.log("::: INCREMENT AND DECREMENT :::");
let pre = 10;
console.log(pre); // 10
console.log(++pre); // 11

let post = 10;
console.log(post); // 10
console.log(post++); // prints 10, then increases 'post' to 11 after.
console.log(post); // 11
