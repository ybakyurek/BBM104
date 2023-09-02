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


  <!-- İngilizce içerik -->

  <div id="english-content">
    <h1>Todo Application</h1>
    <!-- İngilizce içeriği buraya ekleyin -->
  </div>


  <!-- Türkçe içerik -->

  <div id="turkish-content" style="display: none;">
    <h1>Todo Uygulaması</h1>
    <!-- Türkçe içeriği buraya ekleyin -->
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
