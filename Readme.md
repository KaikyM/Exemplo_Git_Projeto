# Exemplo_Git_ Projeto
Esse é um tutorial básico de como criar um projeto usando o "Git" para ligar uma pasta de seu computador, onde está o projeto para um repositória vazio no GitHub.

Aqui você aprenderá os conceitos de Branch Main, Branches e Merge, além de sua implementação

## Criando a conexão entre o Git e o GitHub
- Criar uma pasta com o nome "Exemplo_Git_Projeto"
- Abra a pasta, click com o botão direito e abra o **Git Bash**
<br>
<img src = "imagens\image.png" 
height = "300" width = "300">
<br>
- Escreva o comando **git init** para criar um repositório **.git** na sua pasta
- Escreva **git add Readme.md** ( **git add .** é uma forma de enviar todos) para enviar o arquivo para a área de espera
- Escreva **git status** para ver o status dos arquivos
- Escreva **git commit -m "First commit"** para escrever um commit
- O comando **git branch -M "main"** muda o nome da "Branch". Nesse caso o nome mudou de master para main
- Agora crie um repositório vazio no **GitHub**
- Volte para **Git Bash** e escreva **git remote add origin link_of_your_repository.git** para ligar a pasta com o repositório do Github (esse comando só precisará ser feito uma vez para ligar a pasta com o endereço do repositório)
- Por ultimo escreva **git push -u origin main** para enviar o seu arquivo na área de espera até o seu repositório do **GitHub**

## Criando um arquivo **.java** como exemplo de um projeto
- Crie um arquivo **HelloWorld.java** e escreva o código para dar um print "Hello World"
- Agora repita o passo a passo usando o **Git Bash** para transferir os arquivos da pasta para o seu repositório **GitHub**
<br>
<img src = "imagens\image1.png" 
heigth = "300" width = "300">
<br>
- O arquivo **HelloWorld.java** será o exemplo de projeto da "branch main" que irá ser modificado posteriormente com "Merge"

## Criando uma Branch do Projeto
- Escreva **git checkout -b "HWChoice"** para sair da "branch main" e criar uma ramificação chamada "HWChoice"
<br>
<img src = "imagens\image2.png" 
heigth = "300" width = "300">
<br>
- Repetindo os passos anteriores a única coisa diferente que terá que ser feita é digitar **git push origin HWChoice**, pois não estamos mais na "branch main"
- Caso queira voltar para a "branch main" basta digitar **git checkout main**