//1. DOM 요소 선택

const dateText = document.querySelector(".date");

const todoList = document.querySelector(".todo-list");
const addTaskBtn = document.querySelector(".add-btn");
const addConfirmBtn = document.querySelector(".confirm-btn");
const addCancelBtn = document.querySelector(".cancel-btn");
const addTaskName = document.querySelector(".task-name");
const progressBar = document.querySelector(".progress-bar");
const progressRate = document.querySelector(".progress-rate");

const memo = document.querySelector(".memo");
const saveBtn = document.querySelector("#save-memo");
const eraseBtn = document.querySelector("#clear-memo");

// 2. 상태변수

let done_count = 0;
let total_count = 0;
let progress_rate = Math.round(done_count / total_count * 100);
let savedTasks = JSON.parse(localStorage.getItem("tasks")) || [];
let savedMemo = localStorage.getItem("memo") || "";

// 3. 함수

function displayToday() {
	const today = new Date().toLocaleDateString('ko-KR', {
		year: 'numeric',
		month: 'short',
		day: 'numeric',
		weekday: 'long'
	});
	dateText.textContent = today;
}

function updateProgress(operator) {
	switch (operator) {
		case "add":
			total_count = total_count + 1;
			break;
		case "done":
			done_count = done_count + 1;
			break;
		case "remove":
			total_count = total_count - 1;
			break;
		default:
			return;
	}
	progress_rate = Math.round(done_count / total_count * 100);
	progressBar.setAttribute("style", "width: "+progress_rate+"%;");
	progressRate.textContent = " "+progress_rate;
}

// 페이지 로드 시 할일 목록 띄우기
function initTasks() {
	if ( savedTasks.length == 0 ) return;
	
	const today = new Date();
	today.setHours(0,0,0,0);
	savedTasks = savedTasks.filter((task) => task["reg_dt"] >= today);
	savedTasks.forEach((task) => {renderTask(task["name"]);});
	localStorage.setItem("tasks",JSON.stringify(savedTasks));
}

// 할 일 추가
function createNewTask () {
	const newTaskItem = {name: addTaskName.value, reg_dt: Date.now()};
	savedTasks.push(newTaskItem);
	localStorage.setItem('tasks', JSON.stringify(savedTasks));
	
	renderTask(addTaskName.value);
	updateProgress("add");
	
	addTaskName.value = "";
}

// 할일 렌더
function renderTask(taskName) {
	const newTaskName = document.createElement('p');
	newTaskName.classList.add('todo-name');
	newTaskName.textContent = taskName;
	
	const newDoneBtn = document.createElement('button');
	newDoneBtn.classList.add('todo-btn');
	newDoneBtn.classList.add('done-btn');
	newDoneBtn.textContent = "✅";
	newDoneBtn.addEventListener("click", doneTask);
	
	const newDeleteBtn = document.createElement('button');
	newDeleteBtn.classList.add('todo-btn');
	newDeleteBtn.classList.add('del-btn');
	newDeleteBtn.textContent = "❌";
	newDeleteBtn.addEventListener("click", removeTask);
	
	const newTask = document.createElement('div');
	newTask.classList.add('todo');
	newTask.append(newTaskName);
	newTask.append(newDoneBtn);
	newTask.append(newDeleteBtn);

	todoList.append(newTask);
}
function toggleAddTask() {
	addTaskBtn.hidden = !addTaskBtn.hidden;
	addTaskName.hidden = !addTaskName.hidden; 
	addConfirmBtn.hidden = !addConfirmBtn.hidden;
	addCancelBtn.hidden = !addCancelBtn.hidden;
}
function addTaskConfirm() {
	createNewTask();
	toggleAddTask();
}
function addTaskCancel() {
	addTaskName.value = "";
	toggleAddTask();
}

//할일 완료처리
function doneTask(event) {
	updateProgress("done");
	event.target.closest(".todo").remove();
}
// 할일 삭제처리
function removeTask(event) {
	updateProgress("remove");
	event.target.closest(".todo").remove();
	
	localStorage.setItem("tasks",JSON.stringify(savedTasks));
}

//메모 저장
function saveMemo(memoString=memo.value) {
	savedMemo = memoString;
	localStorage.setItem("memo", savedMemo);
}

// 메모 삭제
function clearMemo() {
	let answer = window.confirm("정말 지우시겠습니까?");
	if (answer) saveMemo("");
}

// 4. 이벤트 연결
addTaskBtn.addEventListener("click", toggleAddTask);
addConfirmBtn.addEventListener("click", addTaskConfirm);
addCancelBtn.addEventListener("click", addTaskCancel);
saveBtn.addEventListener("click", () => {saveMemo();});
eraseBtn.addEventListener("click", clearMemo);

// 5. 시작 코드

displayToday();
memo.value = savedMemo;
initTasks();
updateProgress();