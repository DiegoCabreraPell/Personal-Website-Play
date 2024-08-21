document.getElementById("projects").classList.add("cur-page");

const cards = document.getElementsByClassName("card");

const cardColors = [
    "#101220",
    "#032206",
    "#351010",
    "#351010",
    "#351010",
    "#351010",
    "#351010",
    "#351010"
]

const numCards = 8;

function changeBackgroundColor(color) {
    document.getElementById("center-container").style.backgroundColor = color;
}

for (let cardIndex = 0; cardIndex < numCards; cardIndex++) {
    let card = cards.item(cardIndex);
    card.onmouseover = function() {changeBackgroundColor(cardColors[cardIndex])};
    card.onmouseout = function() {changeBackgroundColor("#101010")};
}

