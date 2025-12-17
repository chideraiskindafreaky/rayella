<script>
  let countdown;

  function checkPassword() {
    const correctPassword = "rayella";
    const input = document.getElementById("password").value;
    const error = document.getElementById("error");

    if (input === correctPassword) {
      document.getElementById("lockBox").style.display = "none";
      document.getElementById("letter").style.display = "block";
      startSelfDestruct();
    } else {
      error.style.display = "block";
    }
  }

  function startSelfDestruct() {
    let timeLeft = 15;
    const timer = document.getElementById("timer");

    countdown = setInterval(() => {
      timeLeft--;
      timer.textContent = `This letter will self-destruct in ${timeLeft} seconds 💣`;

      if (timeLeft <= 0) {
        clearInterval(countdown);
        document.getElementById("letter").style.display = "none";
        alert("💥 Letter destroyed");
        location.reload();
      }
    }, 1000);
  }

  /* 🚫 Disable right click */
  document.addEventListener("contextmenu", e => e.preventDefault());

  /* 🚫 Block common screenshot / dev keys */
  document.addEventListener("keydown", e => {
    if (
      e.key === "PrintScreen" ||
      (e.ctrlKey && e.key.toLowerCase() === "s") ||
      (e.ctrlKey && e.key.toLowerCase() === "p") ||
      (e.ctrlKey && e.shiftKey && e.key.toLowerCase() === "i")
    ) {
      e.preventDefault();
      hideLetter();
      alert("🚫 Screenshotting is disabled");
    }
  });

  /* 👀 Detect tab switch / minimize */
  document.addEventListener("visibilitychange", () => {
    if (document.hidden) {
      hideLetter();
    }
  });

  function hideLetter() {
    const letter = document.getElementById("letter");
    letter.classList.add("blur");
    setTimeout(() => {
      letter.style.display = "none";
    }, 300);
  }
</script>
