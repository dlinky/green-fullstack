// 1. 점수를 저장할 변수 score 선언
let answer = Math.floor(Math.random() * 30)+1;
let num = 0;

const scoreText = document.querySelector("#score");
const verifyButton = document.querySelector("#verify-button");
const resetButton = document.querySelector("#reset-button");
const message = document.querySelector("#message");
const inputNum = document.querySelector("#input-num");

// 2. 현재 점수에 1점을 올리는 addPoint()함수 정의
function verifyAnswer() {
	num = Number(inputNum.value);
	if (num == answer) {
		message.textContent = "정답입니다!";
	} else if (num > answer) {
		message.textContent = "정답보다 큽니다.";
	} else {
		message.textContent = "정답보다 작습니다.";
	}
}

function resetAnswer() {
	message.textContent = "점수를 초기화합니다.";
	answer = Math.floor(Math.random() * 30)+1;
}

// 3. 실제 addPoint() 함수 실행
verifyButton.addEventListener("click", verifyAnswer);
inputNum.addEventListener("keydown", function(event) {
	if (event.key === 'Enter') {
		event.preventDefault();
		verifyAnswer();
	}
})
resetButton.addEventListener("click", resetAnswer);