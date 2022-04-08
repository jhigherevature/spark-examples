/* 
    Javascript provides some built-in functionality. Here we will examine
    3 built-in functions used to display messages to the user, debug and
    even a simple way to take in user input:
    -console.log
    -alert()
    -prompt()
*/

/* 
    We have already looked at console.log()... 
    This function allows us to print messages to the developer console.
*/
console.log("Log Function used to print message to the Dev Console.");

/* 
    The Alert() function displays the information passed 
    into the function in a dialog box that appears on the webpage
*/
// alert("This is the alert function Dialog Box");

/* 
    The prompt() function is similar to the alert function...
    it will display information in a dialog box; however, the 
    dialog box also provides a text input area and will return
    anything the user types as a String...
*/
// let input = prompt("This is the Prompt Function. Type a message:");
// console.log("The input from the prompt function was: " + input);

/* 
    Keep in mind that prompt returns input as a String... 
*/
let number = prompt("Give me a number:");

/* 
    When you use the '+' with a String, the values will be 
    concatenated (combined as a Single String), NOT added.
*/
console.log(number + 5);

/* 
    You can change a String into a number using the following syntax: 
*/
let fifteen = Number("15");
console.log(fifteen + 10);

/*
    With the prompt function... 
*/
let value = Number(prompt("Give me another number:"));
console.log(value + 10);

/*
    Unit Converter Example:
    We surround the prompt below with 'Number()' because the prompt
    function will return a String (word) as the datatype by default.
    In this way, we will force the String to become a numerical datatype
*/
// let temp = Number(prompt("give me degrees in fahrenheit"));
// let cel = temp - 32 * 9/5;
// alert ("F is: " + temp + ", C is: " + cel);