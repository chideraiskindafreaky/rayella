<!DOCTYPE html java css>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>A Special Letter</title>

  <style>
    body {
      background: linear-gradient(135deg, #ffeef2, #ffd6e0);
      font-family: "Georgia", serif;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    /* PASSWORD SCREEN */
    .lock {
      background: white;
      padding: 30px;
      border-radius: 16px;
      box-shadow: 0 15px 40px rgba(0,0,0,0.2);
      text-align: center;
      width: 300px;
      animation: fadeIn 1s ease;
    }

    .lock h2 {
      color: #e63946;
      margin-bottom: 15px;
    }

    input {
      width: 100%;
      padding: 12px;
      border-radius: 10px;
      border: 1px solid #ccc;
      font-size: 16px;
      margin-bottom: 15px;
      outline: none;
    }

    button {
      background: #e63946;
      color: white;
      border: none;
      padding: 12px 25px;
      font-size: 16px;
      border-radius: 25px;
      cursor: pointer;
      transition: 0.3s ease;
    }

    button:hover {
      background: #d62839;
      transform: scale(1.05);
    }

    .error {
      color: red;
      font-size: 14px;
      display: none;
      margin-top: 10px;
    }

    /* LETTER */
    .letter {
      background: white;
      padding: 35px;
      max-width: 520px;
      border-radius: 16px;
      box-shadow: 0 15px 40px rgba(0,0,0,0.2);
      display: none;
      animation: fadeIn 1.2s ease;
      position: relative;
    }

    h1 {
      text-align: center;
      color: #e63946;
      margin-bottom: 20px;
    }

    p {
      font-size: 16px;
      line-height: 1.8;
      color: #444;
      margin-bottom: 15px;
      text-align: justify;
    }

    .signature {
      margin-top: 25px;
      text-align: right;
      font-style: italic;
      color: #555;
    }

    .letter::before,
    .letter::after {
      content: "❤";
      position: absolute;
      font-size: 22px;
      color: #e63946;
      opacity: 0.7;
    }

    .letter::before {
      top: 15px;
      left: 20px;
    }

    .letter::after {
      bottom: 15px;
      right: 20px;
    }

    @keyframes fadeIn {
      from {
        opacity: 0;
        transform: translateY(25px);
      }
      to {
        opacity: 1;
        transform: translateY(0);
      }
    }
  </style>
</head>

<body>

  <!-- PASSWORD BOX -->
  <div class="lock" id="lockBox">
    <h2>🔒 Enter Password</h2>
    <input type="password" id="password" placeholder="Enter secret password">
    <button onclick="checkPassword()">Open Letter 💌</button>
    <div class="error" id="error">Wrong password 😅</div>
  </div>

  <!-- LETTER -->
  <div class="letter" id="letter">
    <h1>Dear Rayella 💖</h1>

    <p>
      Spending these past few days with you has been really amazing,
      and I honestly don’t know what to say. I wouldn’t want to rush
      things, but I feel good when I’m around you — your vibes,
      your energy, your smile… everything. I’d love to know you more
      if you’re interested.
    </p>

    <p>
      You might think I don’t really know what I’m doing or what I’m
      going for, because at first it was Mitchelle and now it’s you.
      But I believe everything happens for a reason — we cross paths
      for a reason.
    </p>

    <p>
      I’m willing to see where life takes us both, if at least you’re
      interested. Though you’ve said you’re not ready for a relationship
      or anything like that.
    </p>

    <div class="signature">
      — From your son 😂💌
    </div>
  </div>

  <script>
    function checkPassword() {
      const correctPassword = "Rayella"; // 🔑 CHANGE PASSWORD HERE
      const input = document.getElementById("password").value;
      const error = document.getElementById("error");

      if (input === correctPassword) {
        document.getElementById("lockBox").style.display = "none";
        document.getElementById("letter").style.display = "block";
      } else {
        error.style.display = "block";
      }
    }
  </script>

</body>
</html>
