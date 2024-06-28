
const inputFields = document.querySelectorAll("input");

let isTyping = false;


function applyNeonBreathingEffect(input){
    input.classList.add("typing");
}

function removeNeonBreathingEffect(input){
    input.classList.remove("typing");
}


inputFields.forEach((input) => {
    
    input.addEventListener("focus", () => {
        if (!isTyping) {
            
            input.classList.add("focus");
        }
    });

    
    input.addEventListener("blur", () => {
    
        input.classList.remove("focus")
    });

    
    input.addEventListener("input", () => {
        if (!isTyping){
            isTyping = true;
            applyNeonBreathingEffect(input); 
        }
    });

  
    input.addEventListener("blur", () => {
        isTyping = false;
        removeNeonBreathingEffect(input); 
    });

});


function togglePassword(){
    const passwordField = document.getElementById("password");
    if (passwordField.type === "password"){
        passwordField.type = "text";
        document.querySelector(".show-password").textContent = "Hide";
    } else {
        passwordField.type = "password";
        document.querySelector(".show-password").textContent = "Show";
    }
}


const registerButton = document.getElementById("register-button");
const container = document.querySelector(".container");


function areFieldsFilled(){
    const username = document.getElementById("username").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    return username !== "" && email !== "" && password !=="";
}

function isValidEmail(email) {
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    return emailPattern.test(email);
}


registerButton.addEventListener("click", () => {
    if (areFieldsFilled()) {
        
        const username = document.getElementById("username").value;
        const email = document.getElementById("email").value;

        if (!isValidEmail(email)) {
            
            alert("Please enter a valid email address.")
            return; 
        }

        
        alert(`Registration successful!\n\nUsername: ${username}\nEmail: ${email}`);

        
        document.getElementById("username").value = "";
        document.getElementById("email").value = "";
        document.getElementById("password").value = "";
    } else {
        
        container.classList.add("shake");

        
        setTimeout(() => {
            container.classList.remove("shake");
        }, 500); 
    }
});