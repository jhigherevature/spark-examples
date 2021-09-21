// representation for player 1's word! -- What player 2 is trying to guess!
let word="TESTING";

/* 
    representation for which letters, player 2 has guessed correctly

    revealedLetters is an array, that will contain true and false values

    When a value is 'true' this means that the player (2) guessing that
    letter correctly.

    ex:

    word = "Javascript"

    [true, false, false, false, false, false, false, false, false, false]

    This translates to:
    "J - - - - - - - - -"

    on our webpage...
*/
let revealedLetters = new Array(word.length);

revealedLetters.fill(false);

const maxStrikes = 6; // the maximum number of allowed mistakes
let strikes = 0; // the number of incorrect guesses made so far

/*
    representation for all letters incorrectly guessed.

    word = "CAT"

    guess = "p".

    strikeLetters = ["p", , , , ]
*/
let strikeLetters = new Array(maxStrikes); // this will contain every letter that has been incorrectly guessed.

drawWordProgress(); // run this now, to draw the empty word at the start of the game.

// Manipulates the DOM to write all the strike letters to the appropriate section in hangman.html
function drawStrikeLetters() {

}

// Manipulates the DOM to write the successfully guessed letters of the word, replacing them with dashes if not yet guessed
function drawWordProgress() {
    let display = "";
    for (let i = 0; i < revealedLetters.length; i++) {
        if (revealedLetters[i] == true) {
            display = display + word[i];
        } else {
            display = display + " _ ";
        }
    }
    /*
        Loop through revealed letters...if an element is false, we want to record a '-'
        If the element is true we want to record the letter that exists in our word...
    */

    document.getElementById("letter-display").innerHTML = display;
}

// Manipulates the DOM to update the image of the gallows for the current game state.
function drawGallows() {

}


/*
    processGuess should run each time the player guesses a letter.

    The processGuess function should:
        Check if the guessed letter exists in our word.
            if so...
                update our revealedLetters array appropriately
                render correctly guessed letters to page...
            if not...
                add the guessed letter to strikeLetters
                render incorrect letters to page.
                record that player got a strike
        Please keep the flow of your program in mind!
*/
document.getElementById("submit-btn").addEventListener("click", processGuess);

function processGuess(eventData) {
    // this is required to prevent our form from submitting!
    eventData.preventDefault();
    let guess = document.getElementById("guessed-letter").value.toUpperCase();
    let letterExistInWord = false;

    for (let i = 0; i < word.length; i++) {
        // == and === comparisons
        if (guess == word[i]){
            revealedLetters[i] = true; // the corresponding letter was guessed correctly...
            letterExistInWord = true;
        }
    }

    if (letterExistInWord) {
        drawWordProgress();
    } else {
        strikeLetters[strikes] = guess;
        strikes++;
        drawStrikeLetters();
        drawGallows();
    }
}