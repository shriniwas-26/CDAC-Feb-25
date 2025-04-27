var textbold = document.getElementsByTagName("b");
function transform(){
    
    Array.from(textbold).forEach(element => {
        element.classList.add("setColor")
    });
}

function removestyle(){
    Array.from(textbold).forEach(element => {
        element.classList.remove("setColor")
    });
}