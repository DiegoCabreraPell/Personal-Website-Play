document.getElementById("projects").classList.add("cur-page");

const cards = document.getElementsByClassName("card");

const cardColors = [
    "#101220",
    "#203020",
    "#202520",
    "#404040",
    "#251010",
    "#250025",
    "#101030",
    "#351010"
];

const defaultColor = "#101010"

const numCards = 8;

function changeBackgroundColor(color) {
    document.getElementById("center-container").style.backgroundColor = color;
    
    const bf = document.getElementsByClassName("backfill");

    bf.item(0).style.fill = color;
    bf.item(1).style.fill = color;
}

for (let cardIndex = 0; cardIndex < numCards; cardIndex++) {
    let card = cards.item(cardIndex);
    card.onmouseover = function() {changeBackgroundColor(cardColors[cardIndex])};
    card.onmouseout = function() {changeBackgroundColor(defaultColor)};
}

