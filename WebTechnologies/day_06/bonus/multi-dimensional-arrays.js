/* 
    Arrays are objects, and yes, you can have an array of Objects. This means you can place Arrays within other Arrays.
    
    When placing arrays within other Arrays, this is known as a 'multi-dimensional' array.
*/

/*
For the Array below:

index:   0  1  2
        [11,12,13],         // array at index 0

index:   0  1  2  3  4    
        [21,22,23,24,25],   // array at index 1

index    0  1
        [31,32]             // array at index 2
*/
let twoDee = [ [11,12,13], [21,22,23,24,25], [31,32] ];
console.log(multi[0][2]);       // value is 13
console.log(multi[2][1]);       // value is 32
console.log(multi[1][2]);       // value is 23


/*
    Each time you nest an array, you add a "dimension". The following is a "3D" array. An array which contains multiple 2-D arrays
*/
let otherMulti = [
    [
        [1,2,3],[4,5,6],[7,8,9]
    ],
    [
        ["A","B","C"],["D","E","F"],["G","H","I"]
    ],
    [
        [true, false, false],[true, true, false],[true, true, true]
    ]
];