<h1> Aula 2 </h2>
<h2> O que é um objeto? </h2>
"Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentos e estados atual."

<h2>Três questões da Programação Orientada a Objetos</h2>
Atributos - Coisas que há no objeto, como, propriedades, características e dados. </br>
Metódos - Coisas que se pode fazer com o objeto, comportamento, rotinas e procedimentos. </br>
Estado - Estado que o objeto se encontra, características no momentos em que se está analisando o objeto. </br>

<h2> Classe </h2>
Classe é o molde para o objeto, características que segue para a produção de um objeto. </br>
"Classe - Define atributos e metódos comuns que serão compartilados por um objeto." <br>
"Objeto - É uma instância de um objeto."

<h3> Exemplo: Caneta </h3>
Classe caneta </br>
<ol>
  modelo; </br>
  cor; </br>
  ponta; </br>
  carga; </br>
  tampada. </br>
</ol>
metodos <br>
<ol>
  Rabiscar() <br>
  Tampar() <br>
  Pintar() <br>
  Destampar()
</ol>
Instanciar é gerar um objeto a partir da classe. </br>
<ol>
  c1 = nova caneta - objeto instanciado </br>
  c2 = nova caneta - outro objeto instanciado que vem da mesma classe
</ol>

<h1> Aula 3 </h1>
<h2> Linguagem de Modelagem Unificada </h2>
Diagrama de classes - Descreve uma classe por um retângulo 

![Diagrama em branco - Página 1](https://github.com/Mello8266/Java/assets/95052043/04ecac6a-d308-4867-9da2-ebb48767cf79)

Na parte superior em negrito é o nome da classe, em maiúscula. </br>
Logo abaixo, são as características da classe. </br>
E no final os metódos, em minúsculo.

<h2> Modificadores de Visibilade </h2>
"Indicam o nível de acesso aos componentes internos de uma classe" <br>
Símbolos: 
<ol>
  + Pública - Pode ser utilizada por qualquer classe <br>
  - Privada - Utilizada somente pela classe atual <br>
  # Protegido - Só pode ser utilizada pela classe atual e todas as sub-classes <br>
</ol>

![Diagrama em branco - Página 1](https://github.com/Mello8266/Java/assets/95052043/6f0e7dd3-3edd-495b-8e09-72d407cc40c1)

<h1> Aula 4</h1>
<h2> Métodos especiais </h2>
<h3> Métodos acessores - getters </h3>
Método que pega alguma informação. <br>
Exemplo: getSaldo() - método que retorna a informação do atributo saldo, ou seja, a quantidade de dinheiro na conta.

<h3> Métodos modificadores - setters</h3>
Método que adiciona informação ao atributo. <br>
Exemplo: setsaldo(100) - método que adiciona 100 de dinheiro (parâmetro) ao atributo saldo. 

<h3> Método construtor - construct </h3>
Método que automatiza o instânciamento de um objeto, definindo como será a construção do objeto. 

<h1> Aula 5 </h1>
<h2> Prática com objeto </h2>
Elaboração de um projeto que simula uma conta bancária, tranformando a conta bancária numa classe e os clientes em objetos.

<h1> Aula 6 </h1>
<h2> Pilares da programação orientada a objetos </h2>
<h3> Encapsulamento </h3>
  Serve para capsular um código fazendo um padrão de usabilidade, tornando mudanças invisíveis, reduzindo os efeitos colaterais e assim protegendo o código do usuário. O encapsulamento, também, facilita a reutilização do código.
  "Encapsular é ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior" <br>
  Mensagem é o jeito de interagir com uma capsula por meio de sua interface, sem precisar mexer diretamente no sistema. <br>
  "Interface é uma lista de serviços fornecidas por um componente. É o contato com o mundo exterior que define o que pode ser feito com um objeto dessa classe". <br>
  Não há atributos na interface, apenas métodos abstrados - Apenas é mostrado a função dele, sem que o código esteja exposto.

<h1> Aula 7 </h1>
<h2> Prática com relacionamente entre classes</h2>
Começo do projeto do UEC.

<h1> Aula 8 </h1>
<h2> Relacionamento de agregação </h2>
Tipo abstrado de dados - transforma a classe em tipos de dados abstrados, cada instância da classe estará numa variável.

<h1> Aula 9 </h1>
<h2> Exercícos de POO</h2>
Exercícios de concurso sobre programação orientada a objetos.
<a href="https://github.com/Mello8266/Java/blob/main/exercicios.md"> Exercícios </a>

<h1> Aula 10 </h1>
<h2> Herança </h2>
"Permite basear uma nova classe na definição de uma outra classe previamente existente." </br>
"A herança será aplicada tanto para as características quanto para os comportamentos." </br>
A classe que será herdada é a classe mãe/progenitora/superclasse. Já a classe gerada a parti da herança, é a classe filha/subclasse.

# Aula 11
## Herança 2
### Subclasses também podem ser progenitoras de outras classes 
Exemplo, a classe progenitora A e a sua subclasse B. A subclasse B também pode ser progenitora de outras subclasses, fazendo com que as subclasses de B herdem, caracarísticas e comportamentos, tanto da classe A quanto da classe B. Do ponto de vista da classe B, ela é subclasse da classe progenitora A. Do ponto de vista das subclasses de B (BA e BB), elas são subclasses da superclasse B.
Tanto a classe BA quanto a BB, também podem ser progenitoras de novas subclasses, daí se segue o mesmo padrão descrito anteriormente. </br>
Uma classe que não é subclasse de nehnuma classe é considerada a raiz da árvore hierárquica. As classes sem subclasses são denominadas de folhas. </br>
Resumindo o exemplo, a classe A, raiz da hierarquia de classes, é mãe da subclasse B que é superclasse das classes BA e BB. A classe A é ancestral das classes BA e BB, e BA e BB são descendentes de A.

### Tipos de herança
**Herança de implementação**
* Herança pobre
* Faz a implementação de uma classe abstrata.

**Herança para a diferença**
* Herança que aplica algo em métodos já existentes
* Sobrescrição de método

### Classe abstrata
"Não pode ser instanciada. Só pode servir como progenitora."

### Método abstrato
"Declarado, mas não implementado na progenitora." </br>
Só pode ser colocado dentro de uma interface ou classe abstrata.

### Classe final
"Não pode ser herdada por outra classe. Obrigatoriamente folha."

### Método final
"Não pode ser sobrescrito por suas sub-classes. Obrigatoriamente herdado."

# Aula 12
## Polimorfismo 
Permite que o mesmo nome represente vários comportamentos diferentes. </br>
Poli = muitas </br>
morfo = formas

### Assinatura do método
Quantidade e tipos de parâmetros.

![code](https://github.com/Mello8266/Java/assets/95052043/2a04f6ac-fe85-47f7-9e73-2f759f785dfe)

### Tipos de polimorfismo
#### Sobreposição
Sobrescreve o código do método da superclasse na sua subclasse, usando a mesma assinatura, e não, necessariamente, tendo o mesmo retorno.
