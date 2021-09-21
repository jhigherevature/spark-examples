/*
    THIS PAGE SHOWCASES EXAMPLES OF WHAT JSON LOOKS LIKE, NOT THEIR USE

    One note before continuing: Javascript supports the use of double quotes " and single quotes ' when creating and using strings 
    
    *javascript also uses a backtick ` but we will not explore those
*/
let word = "word";
let otherword = 'word';

/*
    JSON stands for Javascript Object Notation. It is a lightweight way to transmit data between different programming languages. 
    
        JSON is lightweight, because Strings do not take up too much space in memory, as compared to more complex objects. 
    
        JSON is language agnostic, because nearly every programming language has a method of writing and understanding String data.
*/
let JSONString = '{"name":"Joseph","age":30}';
let obj = {name: "Joseph",age: 30};

console.log(JSONString);
console.log(obj);

/*
    JSON.stringify() allows you to convert a Javascript object into a JSON string
    JSON.parse() allows you to convert a JSON string into a Javascript Object
*/
let stringfy = JSON.stringify(obj);
let parse = JSON.parse(JSONObj);

console.log(stringfy); // same as JSONObj
console.log(parse); // same as obj