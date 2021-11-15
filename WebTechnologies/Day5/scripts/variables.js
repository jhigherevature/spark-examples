/*
    In any programming language, the only real reason to create a variable (or function)
    is when you want to reuse some actions or represent some type of information and referenece
    it later!
*/

/*
    Keywords in a programming language are words or symbols that hold some significant meaning
    to that programming language. Keywords are also known as reserved words, and cannot be used
    as the name of a variable or function.
    When creating variables in Javascript we can use one of three keywords:
        let - create variables that follow a logical programming order (from top to bottom)
            These variables are not hoisted* 
        const - create variables whose values can be set one time (initialize a variable), and
        we cannot change the value of this variable later! const is also not hoisted*
        var - the old standard used to create variables. It is still useful for a number of
        reasons, one in particular is that variables declared with var are hoisted*
        *We will talk about Hoisting in more detail later!
*/

/*
    Important Terminology:
    Declare : Creating a variable (using either 'let', 'const' or 'var' keywords) and stating
    the arbitrary name of the variable.
	
    Assign : Changing the value that is stored within a variable using the assignment operator
    a.k.a. equals sign ( = ). 
		ex: 
		let name = "Daniel";
		// ...
		name = "Joseph";
    
	Initialize : Technically initialization is the first time we assign a value to a variable
    however colloquially we use initialization to also reference creating and assigning a variable
    on the same line!
    ex:
    let name = "Daniel";
*/
let age = 30;
console.log(age);

age = 25;
console.log(age);

const neverchanging = 100;
console.log(neverchanging);
// neverchanging = 1; // gives error - cannot change the value of const!