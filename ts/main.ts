import { add } from "./overloading";
import { checkEvenOdd } from "./evenorodd";
import { areAnagrams } from "./anagrams";

// npx tsc main.ts --module commonjs --target es2020
// node main.js

function main(): void {

    console.log("===== Q1: Function Overloading =====");

    console.log(add(10, 20));
    console.log(add("Hello ", "World"));


    console.log("\n===== Q2: Even or Odd =====");

    console.log(checkEvenOdd(10));
    console.log(checkEvenOdd(7));


    console.log("\n===== Q3: Anagram =====");

    console.log(areAnagrams("listen", "silent"));
    console.log(areAnagrams("hello", "world"));
}


main();