// dataDetails is a custom function [see below] that will print information about the data you give it. Including the typeof the data
function dataDetails(data) {
    console.log("Input Value is: " + data + " it is of type: " + 
    typeof(data));
}

console.log("::: BOOLEANS :::");
dataDetails(true);  // Boolean value True
dataDetails(false); // Boolean value false
dataDetails(1>100); // Boolean value: false
dataDetails(1<100); // Boolean value: true
dataDetails(100>100);   // 100 is not greater than itself
dataDetails(100<100);   // 100 is not less than itself either...
dataDetails(100<=100); // true
dataDetails(100>=100); // true

console.log("::: NUMBERS :::");
// dataDetails(100);
// dataDetails(1/0);   // Infinity
// dataDetails(-1/0);  // -Infinity
// dataDetails(0/0);   // NaN - 'Not a Number' >> This is due to type conversion...More on this later
// dataDetails(16*"apples"); // A mathematical operation on a number, and something that is NOT a number will result in NaN (Not a Number)

console.log("::: STRINGS :::");
// dataDetails("word");
// dataDetails(100 + "apples");
// dataDetails("Hello" + " World " + 25 + 15);   // Type conversion with concatenation. All numbers (and any data type for that matter) is treated as a string
// dataDetails("Coding" + " Adventures! " + (25 + 15)); // To prevent type conversion before the concatenation, we can place numbers in parenthesis
// dataDetails("");    // an empty string is still a string

/*
    Objects, like Arrays, are a special type of variable which allows us to hold onto multiple pieces of information in a single place. We will discuss this in more detail later...
*/
console.log("::: OBJECTS :::");
// dataDetails( [1,15,68] ); // This is an array
// dataDetails( [] );   // This is an empty array
// dataDetails( {name: "joseph", age: 30} ); // this will print as '[object Object]' because that is how Javascript tries to convert this to a String. More on objects later...

console.log("::: SPECIAL CASES :::");
// let nothing = null;
// dataDetails(nothing);
// let undef;
// dataDetails(undef);