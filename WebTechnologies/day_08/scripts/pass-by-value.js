/*
    Javascript is a pass-by-value language. This means that we do not manipulate variables used as arguments, instead we copy the value of the argument into a new variable.
*/
function modify(val) {
    val += 5;
    console.log("Val is: " +  val);
    return val;
}

// console.log(val); // error

var a = 10;
modify(a);
console.log(a); // a is still 10
// If you want to change a variable use the assignment operator:
// a = modify(a); // a has been reassigned to 15
