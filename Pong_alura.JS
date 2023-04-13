function movimentarBolinha()
{
   //Movimentação da bolinha
  xBolinha += VelocidadeXbolinha;
  yBolinha += VelocidadeYbolinha;
}
function mostraBolinha()
{
  circle(xBolinha,yBolinha,diametro);
}
function raquetePlayer()
{
  //Tamanho e local da raquete do player
  rect(xRaquete,yRaquete,raqueteComprimento,raqueteAltura);
}
function movimentarRaquetePlayer()
{
  //movimentando a raquete do player
  if (keyIsDown(UP_ARROW)) 
  {
    yRaquete -= 10;
  }
  if (keyIsDown(DOWN_ARROW)) 
  {
    yRaquete += 10;
  }

}
function colisaoRaquetePlayer()
{
   if (xBolinha - raio < xRaquete+raqueteComprimento && yBolinha - raio - yRaquete + raqueteAltura && yBolinha + raio > yRaquete)
   {
     VelocidadeXbolinha *= -1;
   }
}
function bibliotecaColisaoRaquetePlayer()
{
  //Verificar a colisão nas bordas
  colidiu =
  collideRectCircle(xRaquete,yRaquete,raqueteComprimento,raqueteAltura,xBolinha, yBolinha,raio);
  if (colidiu)
  {
    VelocidadeYbolinha *= -1;
  }
}

//Diamentro e posição da bolinha
let xBolinha = 300;
let yBolinha = 200;
let diametro = 15;
let raio = diametro/2;

let colidiu = false

//velocidade da bolinha
let VelocidadeXbolinha = 6;
let VelocidadeYbolinha = 6;

//Tamanho e posição da raquete1
let xRaquete = 5
let yRaquete = 150
let raqueteComprimento = 10
let raqueteAltura = 90

//Tamanho da tela de fundo
function setup() 
{
  createCanvas(600, 400);
}

//código principal
function draw() 
{
  //cor de fundo
  background(0);
  //chamando funções
  movimentarBolinha();
  mostraBolinha();
  verificaColisãoBorda();
  raquetePlayer();
  movimentarRaquetePlayer();
  bibliotecaColisaoRaquetePlayer();
}
