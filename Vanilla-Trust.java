document.addEventListener('DOMContentLoaded', function() {
  var titleText = document.querySelector('.title-text');
  var messageElement = document.createElement('div');
  messageElement.id = 'message';
  messageElement.style.display = 'none';
  messageElement.textContent = 'Текст скопирован!';
  document.body.appendChild(messageElement);

  titleText.addEventListener('click', function() {
      var text = titleText.textContent;
      copyToClipboard(text);
      showMessage();
  });

  function copyToClipboard(text) {
      var textarea = document.createElement('textarea');
      textarea.value = text;
      textarea.style.position = 'fixed';
      textarea.style.opacity = 0;
      document.body.appendChild(textarea);
      textarea.select();
      document.execCommand('copy');
      document.body.removeChild(textarea);
  }

  function showMessage() {
      messageElement.style.display = 'block';
      setTimeout(function() {
          messageElement.style.display = 'none';
      }, 2000);
  }
  
});


