function toggleTheme() {
    document.body.classList.toggle("dark");
}

const button = document.getElementById("themeButton");

button.addEventListener("click", toggleTheme);