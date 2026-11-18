// 1. 점수를 저장할 변수 score 선언
let score = 0;

const quizList = [
  {
    question: "HTML은 무엇을 할까요?",
    choices: ["웹 구조 만들기", "색상 꾸미기", "데이터 저장", "음악 재생"],
    answer: 0
  },
  {
    question: "글자 색을 바꾸는 CSS 속성은 무엇일까요?",
    choices: ["margin", "color", "display", "border"],
    answer: 1
  },
  {
    question: "나중에 값을 바꿀 수 있는 변수를 만드는 키워드는?",
    choices: ["const", "if", "for", "let"],
    answer: 3
  },
  {
    question: "버튼 클릭 같은 사건을 감지할 때 쓰는 메서드는?",
    choices: ["querySelector", "textContent", "addEventListener", "createElement"],
    answer: 2
  },
  {
    question: "요소의 안쪽 여백을 만드는 CSS 속성은?",
    choices: ["margin", "border", "display", "padding"],
    answer: 3
  }
];

const quizShuffled = quizList.sort(() => Math.random() - 0.5);

const question = document.querySelector(".question-box");
question.textContent = quizShuffled[0].question;

const selContainer = document.querySelector(".options");
for (let i=1; i<quizShuffled.length; i++) {
	const newDiv = document.createElement('div');
	newDiv.classList.add('choice-btn');
	newDiv.textContent = quizShuffled[0].choices[i-1];
	selContainer.appendChild(newDiv);
}
