<!DOCTYPE html>
<html>
<head>
  <style>
    /* Stil düzenlemelerini yapabilirsiniz */
    .language-button {
      background-color: #007BFF;
      color: #fff;
      padding: 5px 10px;
      border: none;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <!-- Dil seçim düğmesi -->
  <button class="language-button" id="english-button">English</button>
  <button class="language-button" id="turkish-button">Türkçe</button>
# İçerik



  <div id="english-content">
    <h1>Todo Application</h1>
    1. [JS_Q&A](https://github.com/ybakyurek/techCareerAssignments/tree/main/JS_Q%26A): JS ile verilen problemler ve çözümleri
   1. [Q&A.md](https://github.com/ybakyurek/techCareerAssignments/blob/main/JS_Q%26A/Q%26A.md):Markdown dosyası
  </div>
# İçerik

  <div id="turkish-content" style="display: none;">
    <h1>Todo Uygulaması</h1>
   1. [RegistrationForm](https://github.com/ybakyurek/techCareerAssignments/tree/main/RegisterForm): İlk hafta sonunda verilen RegisterForm html, css ve png dosyası
  </div>

  <script>
    // Dil seçim düğmelerini ve içerikleri işleme
    const englishButton = document.getElementById('english-button');
    const turkishButton = document.getElementById('turkish-button');
    const englishContent = document.getElementById('english-content');
    const turkishContent = document.getElementById('turkish-content');

    englishButton.addEventListener('click', () => {
      englishContent.style.display = 'block';
      turkishContent.style.display = 'none';
    });
    
    turkishButton.addEventListener('click', () => {
      turkishContent.style.display = 'block';
      englishContent.style.display = 'none';
    });
  </script>
</body>
</html>

# İçerik

1. [JS_Q&A](https://github.com/ybakyurek/techCareerAssignments/tree/main/JS_Q%26A): JS ile verilen problemler ve çözümleri
   1. [Q&A.md](https://github.com/ybakyurek/techCareerAssignments/blob/main/JS_Q%26A/Q%26A.md):Markdown dosyası

2. [RegistrationForm](https://github.com/ybakyurek/techCareerAssignments/tree/main/RegisterForm): İlk hafta sonunda verilen RegisterForm html, css ve png dosyası<img src="https://github.com/ybakyurek/techCareerAssignments/blob/main/RegisterationForm/RegistrationForm.png?raw=true" alt="Resim Açıklaması" width="500">
