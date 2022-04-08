/*
algorithm palindrome is​:
    input: string phrase​
    output: true/false result​

    initialize length to length of phrase​
    initialize c to zero​

    while c less than equal to length/2​
        if phrase[c] not equal phrase[length-1-c]​
            return false​
        increment c​
    return true​
*/

/*
    The algorithm is called "palindrome"
    The input is "phrase". We are expecting it to be a String
*/
function palindrome(phrase) {
    // initialize length to length of phrase
    let length = phrase.length;
    // initialize c to zero
    let c = 0;

    // while c less than equal to length/2
    while (c <= length/2) {
        // if phrase[c] not equal phrase
        if (phrase[c] != phrase[length-1-c]) {
            // return false
            return false;
        }
        // increment c
        c++;
    }
    
    // return true
    return true;
}