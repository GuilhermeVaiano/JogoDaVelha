# **Sobre o Projeto**
O projeto consiste no desenvolvimento do clássico Jogo da Velha. O código foi desenvolvido com o objetivo de colocar em prática os tópicos fundamentais de Java aprendidos (como matrizes, orientação a objetos, funções, entre outros).

# **Descrição do projeto**
O projeto em si consiste no jogo de velha, feito para rodar em qualquer compilador Java ou em um outro terminal (como o Prompt de Comando do Windows). A figura abaixo mostra o funcionamento do código desenvolvido:

<a href="https://imgur.com/9M95XGx"><img src="https://i.imgur.com/9M95XGx.png" title="source: imgur.com" width="600" height="300"/></a>

<p>
</p>

O jogo foi desenvolvido a partir de duas classes: 

- **'Campo':** Classe responsável por armazenar o valor de um dos nove campos do tabuleiro. Pode receber o valor 'X' ou 'O' e possui um método que verifica se o campo está preenchido ou não.
- **'Tabuleiro':** Classe responsável por "rodar" o jogo. Ela cria os 9 campos, armazenando os valores válidos a cada jogada e exibe o tabuleiro na tela após cada rodada.

# **Status do Projeto**  
Como primeira versão, o jogo está pronto para ser executado e ser jogado por dois jogadores através de um compilador ou terminal.  
Para futuras versões, quando obter mais conhecimento da linguagem, pretendo criar uma interface para o Jogo da Velha e desenvolver a classe Jogador, que armazenará as estatísticas de um jogador cadastrado no sistema.

# **Tecnologias utilizadas**
- Linguagem Java;  
- Eclipse IDE.

# **Como utilizar**
**Pré-requisitos:** Java 18 ou superior.

```bash
# Passo 1: Clonar o repositorio:
git clone https://github.com/GuilhermeVaiano/JogoDaVelha.git

# Passo 2: Acessar a pasta do projeto com o Prompt de Comando
# (Obs.: O comando a seguir é feito a partir de onde a pasta do projeto foi salva):
cd JogoDaVelha\src\tic_tac_toe

# Passo 3: Compilar o arquivo 'Main.java' através do seguinte comando:
javac -cp .. Main.java

# Passo 4: Executar o programa:
java -cp .. Main.java

```  
Feito isso, o jogo está pronto para ser utilizado!  
Para jogar, basta informar o número da linha e da coluna que deseja preencher de acordo com a sua vez. O primeiro a jogar sempre será o 'X'.  

![](https://i.imgur.com/hJO3P4m.png "Exemplo de jogada")


# Autor
**Guilherme Vaiano Nogueira Mendonça**  
LinkedIn: https://www.linkedin.com/in/guilherme-mendon%C3%A7a-12a83720b/  
