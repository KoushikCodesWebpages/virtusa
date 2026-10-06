const calculateAge = require("./age");
const checkNumber = require("./numbertype");
// const toggleTheme = require("./theme");

function main() {

    // Q1. Calculate age
    console.log("Q1. Age:");
    console.log(calculateAge("2002-05-15"));


    // Q2. Check integer or floating-point
    console.log("\nQ2. Number Type:");
    console.log(checkNumber(10));
    console.log(checkNumber(10.5));


    // // Q3. Dynamic Theme Switcher
    // console.log("\nQ3. Theme Switcher:");

    // const button = document.getElementById("themeButton");

    // if (button) {
    //     button.addEventListener("click", toggleTheme);
    // }
}

main();