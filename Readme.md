# Example Git Project

## Criando a conexão entre o Git e o GitHub
- Criar uma pasta com o nome "Exemplo_Git_Projeto"
- Abra a pasta e clickar com o botão direito para abrir o **Git Bash**
<img src = "imagens\image.png" 
heigth = "300" width = "420">
- Escreva o comando **git init** para criar um repositório .git na sua pasta
- Escreva **git add Readme.md** (**git add .** é a forma de enviar todos) para enviar o arquivo para a área de espera
- Escreva **git status** para ver o status dos arquivos
- Escreva **git commit -m "First commit"** para escrever um commit
- Agora crie um repositório vazio no **GitHub**
- Volte para **Git Bash** e escreva **git remote add origin link_of_your_repository.git** para ligar a pasta com o repositório do Github
- Por ultimo escreva **git push -u origin main** para enviar o seu arquivo na área de espera até o seu repositório do **GitHub**