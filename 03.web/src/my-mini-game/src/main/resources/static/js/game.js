// 1. 점수를 저장할 변수 score 선언
let score = 0;

const scoreText = document.querySelector("#score");
const plusButton = document.querySelector("#plus-button");
const resetButton = document.querySelector("#reset-button");
const message = document.querySelector("#message");

// 2. 현재 점수에 1점을 올리는 addPoint()함수 정의
function addScore() {
	score = score + 1;
	scoreText.textContent = score;
	message.textContent = "좋아요! 점수가 올라갔어요.";
}

function resetScore() {
	score = 0;
	scoreText.textContent = score;
	message.textContent = "점수를 초기화합니다.";
}

// 3. 실제 addPoint() 함수 실행
plusButton.addEventListener("click", addScore);
resetButton.addEventListener("click", resetScore);