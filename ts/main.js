"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const overloading_1 = require("./overloading");
const evenorodd_1 = require("./evenorodd");
const anagrams_1 = require("./anagrams");
function main() {
    console.log("===== Q1: Function Overloading =====");
    console.log((0, overloading_1.add)(10, 20));
    console.log((0, overloading_1.add)("Hello ", "World"));
    console.log("\n===== Q2: Even or Odd =====");
    console.log((0, evenorodd_1.checkEvenOdd)(10));
    console.log((0, evenorodd_1.checkEvenOdd)(7));
    console.log("\n===== Q3: Anagram =====");
    console.log((0, anagrams_1.areAnagrams)("listen", "silent"));
    console.log((0, anagrams_1.areAnagrams)("hello", "world"));
}
main();
