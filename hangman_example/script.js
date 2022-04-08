/*
	TIPS: Remember to create HTML elements with unique ID values to easily find an element you want to manipulate.
	
	check your code often!!! get in the habit of testing your logic after writing only 2-5 lines of code. The more code
	you write before checking your work, the more potential places that might cause an error
	
	console.log is your best friend!
*/
// representation for player 1's word! -- What player 2 is trying to guess!
let word="TESTING";

/* 
    representation for which letters, player 2 has guessed correctly

    revealedLetters is an array, that will contain true and false values

    When a value is 'true' this means that the player (2) guessing that
    letter correctly.

    ex:

    word = "Javascript"

    [true, true, false, true, false, false, false, false, false, false]

    This translates to:
    "J a - a - - - - - -"
*/
let revealedLetters = new Array(word.length);

revealedLetters.fill(false);

const maxStrikes = 6; // the maximum number of allowed mistakes
let strikes = 0; // the number of incorrect guesses made so far

/*
    representation for all letters incorrectly guessed.

	if the word is:
    word = "CAT"

	and you guess:
    guess = "p".

	The strikeLetters array should look like this:
    strikeLetters = ["p", , , , ]
*/
let strikeLetters = new Array(maxStrikes); // this will contain every letter that has been incorrectly guessed.

drawWordProgress(); // run this now, to draw the empty word at the start of the game.

// Manipulates the DOM to write all the strike letters to the appropriate section in hangman.html
/*
	Note that the drawStrikeLetters function will perform actions somewhat similar to drawWordProgress...The difference
	is that drawStrikeLetters doesn't need to check true/false values of an array, since all of the letters added to the
	strikeLetters array should be displayed.
	
	As a hint, there is a simple solution here that uses a function on javascript arrays discussed in one of the previous labs
*/
function drawStrikeLetters() {

}

// Manipulates the DOM to write the successfully guessed letters of the word, replacing them with dashes if not yet guessed
function drawWordProgress() {
    /*
        Create a variable that will display content to the webpage

        Loop through revealed letters...
            IF revealedLetter index is true
                Concantenate the current index of word to display variable
            ELSE IF revealedLetter index is false 
                Concatenate a blank " - " to the display variable

        After Loop
        Display variable to webpage (using document.getElementById to find where to put the data)
    */
}

// Manipulates the DOM to update the image of the gallows for the current game state.
function drawGallows() {
    /*
        Recall that <img> elements display content based on the path set for the 'src' attribute
        
        If you want to change an image src, you can use DOM Manipulation to locate the element
        and change specific attribute values.
        
        For example, to change the value of an element's 'type' attribute:
            document.getElementById("example-id").type = "New Type Value";
            document.getElementById().setAttribute("src","value..");
    */
}


/*
    processGuess should run each time the player guesses a letter.

    The processGuess function should:

*/
document.getElementById("submit-btn").addEventListener("click", processGuess);

function processGuess(eventData) {
    // this is required to prevent our form from submitting!
    eventData.preventDefault();
    // value of an element on our webpage
    let guess = document.getElementById("guessed-letter").value.toUpperCase();
    
    /*
        Check if the guessed letter exists in our word.
        IF guess exists in our word
            update our revealedLetters array appropriately
            invoke drawWordProgress
        ELSE
            add the guess to strikeLetters
            record that player got a strike
            invoke drawStrikeLetters
            invoke drawGallows


    Please keep the flow of your program in mind!
    */
}
