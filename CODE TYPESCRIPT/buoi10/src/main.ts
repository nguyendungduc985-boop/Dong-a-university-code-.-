const form = document.getElementById("loginForm") as HTMLFormElement;
const usernameInput = document.getElementById("username") as HTMLInputElement;
const passwordInput = document.getElementById("password") as HTMLInputElement;
const message = document.getElementById("message") as HTMLParagraphElement;

// submit form
form.addEventListener("submit", (e) => {
    e.preventDefault();

    const username = usernameInput.value.trim();
    const password = passwordInput.value.trim();

    if (!username || !password) {
        message.style.color = "red";
        message.innerText = "Vui lòng nhập đầy đủ thông tin!";
        return;
    }

    if (username === "admin" && password === "123") {
        message.style.color = "green";
        message.innerText = "Đăng nhập thành công!";
    } else {
        message.style.color = "red";
        message.innerText = "Sai tài khoản hoặc mật khẩu!";
    }
});

// reset form
form.addEventListener("reset", () => {
    message.innerText = "";
});