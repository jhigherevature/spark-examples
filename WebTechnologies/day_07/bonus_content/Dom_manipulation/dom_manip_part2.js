/*
    With DOM Manipulation, we can change properties of elements, but we can also create elements, add new attributes to elements, change values of existing attributes, or reference the value of attributes already on our HTML elements.
*/

let parent = document.getElementById("parent");

/*
    The createElement function allows us to create an element using the element's tag name. Here, 'p' will create a paragraph element. (we could use 'a' for anchors, 'div' for divs, etc...)
*/
let child = document.createElement("p");

child.innerHTML = "This is the new Child Element";

/* 
    the setAttribute function will change the value of an attribute on an element or, if the attribute does not already exist on the element, add the attribute to an element and set the value
*/
child.setAttribute("class", "child-element");

/*
    below, we are using the appendChild function. Note that if we used 'innerHtml', we would replace ALL of the content in the parent element with the child element.
    i.e. : parent.innerHTML = child;

    Instead, using appendChild will allow us to add a new child to our element
*/
parent.appendChild(child);

/*
    The following uses the Javascript Event System, which we have not yet discussed...We will dive a bit deeper into this topic soon!

    For now, just know that addEventListener allows us to invoke a function when something happens on our webpage...in this case, we will call one of the functions below, when we click on the button...

    The syntax for the addEventListener function is:
    <htmlElement>.addEventListener("Action-in-Quotes", functionNameWithoutQuotes);
*/
let button = document.getElementById("btn");

button.addEventListener("click", addChild);

// This is a very simply function that will display an alert textbox
function buttonAlert() {
    alert("The button was pressed!");
}

/*
    The following function is similar to the code we saw earlier, which was used to create a child element...This time, we are going to read text from the form of our webpage, and use this as the content within the child elements.
    
    To see this code in action you will need to modify the addEventListener code above to reference this function instead of buttonAlert
*/
function addChild() {
    // we used the "value" attribute in the shipping list assignment...
    let input = document.getElementById("input-area").value;

    // below, we took the code from above, and adapted it for this function...
    let child = document.createElement("p");

    child.innerHTML = input;
    child.setAttribute("class", "child-element");
    parent.appendChild(child);
}
