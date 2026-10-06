function checkNumber(num) {
    if (Number.isInteger(num)) {
        return "Integer";
    }

    return "Floating-point";
}

module.exports = checkNumber;