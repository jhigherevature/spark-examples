/*
    Objects are collections of information using key-value pairs. The information stored in objects are called "properties" (sometimes they are also referred to as a 'field'). Properties can either hold onto static information, similar to variables, Or it can hold onto functionality. Remember that Javascript functions are first-class functions!

    TL/DR: Objects are a collection of variables and functions
*/
let person = {
    firstName: "Joseph",
    lastName: "Highe",
    age: 30,
    greet: function () {
        console.log("Hello There!");
    }
}

let greet = function () { console.log("This Greet is not on the person"); }
greet(); // This Greet is not on the person
person.greet(); // hello There
console.log(person.firstName);
console.log(person);

/*
    When we want to access information on an object, we can either use square brackets [], or a dot .

    Using square brackets, we call the name of a property as a string:
    Syntax:
    objectName["objectProperty"];

    Using dot notation we just put a period after the object name and call the property:
    Syntax:
    objectName.objectProperty;
*/
console.log("The Objects name is: " + person["firstName"]);
console.log("The Objects name is: " + person.firstName);
person["greet"]();
person.greet();

person.talk = function () { alert("This is the new talk function"); }
/*
    In Javascript we can add properties "on-the-fly" (after the object has been created) by accessing a property that does not exist currently on my object. Note, this does not work in every programming language
*/
person.job = "Programmer";
console.log(person.job);

// You can change these values as well
person.job = "Clown";

// You can also invoke functions on an object
person.talk();

/* 
    Be wary when accessing an object's properties... Casing and spelling are both important!
*/
person.FirstName = "Scott";
console.log(person.firstName);    // This will return "Joseph"
console.log(person.FirstName);    // This will return "Scott"


/* 
    Constructors are special functions used to create object. When we create our own objects, we have the ability to create our own custom constructors. This way, everytime we create an object, it follow a specific blueprint

    There are two ways to create constructors. An Older way and a newer way (the newer way came as of 2015, along with the 'let' and 'const' keywords and some other nifty features)

    In both of the examples below, we use the 'this' keyword. The 'this' keyword in Javascript has different functionality based on where it is used. We are only going to focus on one version, since this is what is typically associated with the 'this' keyword in other programming languages... The 'this' keyword is a reference to an object, specifically, it tells an object to look at its own data. In this way, using the 'this' keyword with a constructor means that we are telling the object to create/manipulate its own variables.
*/

/*
    This is the OLD way of creating constructors:
*/
// function Dog(name, breed, age) {
//     this.name = name;
//     this.breed = breed;
//     this.age = age;
//     this.bark = function () { 
//         console.log("Bark Bark! my name is: " + this.name);
//     }
// }
// let brian = new Dog("Brian", "White Labrador", 5);
// console.log(brian);

/*
    This is the NEW way of creating constructors, and is the method you should employ:

    Note : Classes are templates used to create objects
*/
class Dog {
    constructor (name, breed, age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    bark () {
        console.log("Bark Bark! my name is: " + this.name);
    }
}

let Scooby = new Dog("Scooby Doo", "Great Dane", 7);
console.log(Scooby);
Scooby.bark();