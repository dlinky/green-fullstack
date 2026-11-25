const cards = document.querySelectorAll(".treasure-card");
const questionText = document.querySelector("#questionText");

const choicesArea = document.querySelector("#choices");
const feedback = document.querySelector("#feedback");

const scoreText = document.querySelector("#score");
const solvedText = document.querySelector("#solvedCount");

let score = 0;
let solvedCount = 0;

function showQuestion(card) {
    if ( card.dataset.solved === "true" ) return;

    const index = Number(card.dataset.index);
    const question = questionBank[index];
    questionText.textContent = question.question;
    choicesArea.innerHTML = "";
    feedback.textContent = "";

    question.choices.forEach(function(choice, choiceIdx) {
        const button = document.createElement("button");
        button.textContent = choice;
        button.className = "choice-button";

        button.addEventListener("click", function() {
            if (card.dataset.solved === "true") return;
            card.dataset.solved = "true";
            solvedCount++;

            if (choiceIdx === question.answer) {
                feedback.textContent = "🎉 정답이에요!";
                if (card.classList.contains("special")) score += 30;
                else score += 10;
            } else {
                feedback.textContent = "아쉬워요. 다음 보물상자에 도전해요.";
            }

            scoreText.textContent = score;
            solvedText.textContent = solvedCount;
            card.classList.add("solved");
            
            choicesArea.querySelectorAll("button").forEach(function(item) {
                item.disabled = true;
            });
        });
        choicesArea.appendChild(button);
    });
}



cards.forEach(function (card) {
    card.addEventListener("click", function() {
        showQuestion(card);
    });
});

const questionBank = [
    { question: "Flexbox를 켜는 코드는?", choices: ["display:flex", "display:grid", "flex:color"], answer: 0 },
    { question: "가로 가운데 정렬 속성은?", choices: ["align-items", "justify-content", "gap"], answer: 1 },
    { question: "기본 row에서 세로 정렬 속성은?", choices: ["align-items", "width", "border"], answer: 0 },
    { question: "아이템 사이 간격 속성은?", choices: ["font-size", "gap", "color"], answer: 1 },
    { question: "Grid를 켜는 코드는?", choices: ["display:grid", "display:flex", "grid:on"], answer: 0 },
    { question: "같은 너비 3열을 만드는 코드는?", choices: ["repeat(3, 1fr)", "repeat(1, 3px)", "3fr(1)"], answer: 0 },
    { question: "Grid 칸 사이 간격 속성은?", choices: ["gap", "border", "height"], answer: 0 },
    { question: "두 열을 차지하게 하는 코드는?", choices: ["grid-column: span 2", "grid-row: span 0", "column: large"], answer: 0 },
    { question: "버튼 클릭 동작을 연결하는 것은?", choices: ["addEventListener", "grid-template", "border-radius"], answer: 0 }
];
