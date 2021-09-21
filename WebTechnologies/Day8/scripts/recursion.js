/*
    Recursion is a technique that can be used to repeat code. It acts as another way to create loops in a program. Using the flow control statements, while, do-while or for create what are known as 'iterative' loops.
    
    Recusion creates a 'recursive' loop. Recursion is achieved when a function calls itself, and makes a slight modification to the input of the function, then provides that modified input to the successive invocations. These small modifications should lead to what is known as a 'base case'.
*/
function recursive_v1(value) {
    if (value == 0)
        return;

    console.log(value);
    value = value - 1;// this can also be achieved using '--value'
    return recursive_v1(value); // when using recursion, you must return the 'self-invoked' function
}


/*
    A slightly more efficient version of the function above:
*/
function recursive_v2(value) {
    if (typeof value != "number")
        return; // if the value provided is not a number, Stop running
    if (value <= 0)
        return; // if the value is 0 or lower, stop running

    console.log(value);
    return recursive_v2(--value);
}



/*
    The following is an example of using recursion to add numbers together. This method is called 'peano' addition.
*/
function peanoAddition(x, y) {
    if (x === 0) {
        return y;
    } else if (y === 0) {
        return x;
    }

    if (x <= y && x > 0) {
        return peanoAddition(--x, ++y);
    } else if (x > y && y > 0) {
        return peanoAddition(++x, --y);
    }
}



/*
    A number is Prime when, the only numbers that can be used to create the number (through multiplication), is the number and 1.
*/
function isPrime (value, divisor) {
    if (value % divisor == 0)
        return false;

    if ((divisor * divisor) > value)
        return true;

    return isPrime(value, ++divisor);
}