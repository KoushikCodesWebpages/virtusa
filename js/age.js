function calculateAge(dob) {
    const birthDate = new Date(dob);
    // const birthdate = new Date(dob);
    const today = new Date();
    // const today = new Date();
    // today.getFullYear() - birthDate.getFullYear();
    // .getMonth()

    let age = today.getFullYear() - birthDate.getFullYear();

    const month = today.getMonth() - birthDate.getMonth();
    // month < 0 || month == 0 && today.getDate() < birthdata.getDate()
    if (month < 0 || (month === 0 && today.getDate() < birthDate.getDate())) 
    {
        age--;
    }

    return age;
}

module.exports = calculateAge;