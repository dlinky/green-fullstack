document.addEventListener("DOMContentLoaded", function() {
    const messageButton = document.querySelector("#messageButton");
    const message = document.querySelector("message");

    messageButton.addEventListener("click", function() {
        message.textContent = "반가워요! JavaScript가 버튼 클릭을 처리했어요.";
    });
});