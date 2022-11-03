function dataDetails(data) {
    console.log("The input is: " + data + 
    " is is of type: " + typeof data);
}
/*
    The dataDetails function will print information about the data
    you give it. It uses the javascript 'typeof' operator to print 
    the recognized type for a given piece of data

    1. Explain the different datatypes in JS
*/


dataDetails(true);          // boolean - true/false values
dataDetails(100);           // number - any negative or positive number
dataDetails("Revature");    // String - alpha-numeric characters within quotes
dataDetails([1,2,3,4]);     // object - constructs which hold alot of data in one place (used to represent real-world, tangible objects)
dataDetails(null);          // null - A datatype meaning "nothing"
dataDetails(undefined);     // undefined - A datatype reserved for variables that do not have an associated value
