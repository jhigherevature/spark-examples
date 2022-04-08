/*
    Event Propagation describes how to resolve the execution of multiple events which are triggered simultaneously.

    Event Propgation can occur in two ways:
    -Bubbling*
    -Capturing

    Bubbling: The innermost element will occur first, then propogate outwards
    Capturing: The outmost element will occur first and then propogate inwards

    *By default, events will follow the "bubbling" method of event propogation which has a boolean value of false

    Event Propogation Syntax:
    element.addEventListener("event-name", callback, Bubble/Capture as Boolean)
*/

// We will use these booleans to drive whether we want events to bubble/capture
let bubble = false;
let capture = true;

document.getElementById("outer").addEventListener("click", function() {
    console.log("OUTER - BUBBLE");
}, bubble);
document.getElementById("middle").addEventListener("click", function() {
    console.log("MIDDLE - BUBBLE");
}, bubble);
document.getElementById("inner").addEventListener("click", function() {
    console.log("INNER - BUBBLE");
}, bubble);

document.getElementById("outer").addEventListener("click", function() {
    console.log("OUTER - CAPTURE");
}, capture);
document.getElementById("middle").addEventListener("click", function() {
    console.log("MIDDLE - CAPTURE");
}, capture);
document.getElementById("inner").addEventListener("click", function() {
    console.log("INNER - CAPTURE");
}, capture);

