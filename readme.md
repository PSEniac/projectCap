# Projeto

- Sobre este projeto, o mesmo contém 3 algoritmos distintos e organizados separadamente, pois, não possuem nenhuma relação entre si.

- Esse projeto é baseado nos requisitos e questões do desafio capgemini 2022.

## Instalação

                                                                  Usuário

                                                                  Windows

* Obs: É importante ter o java jdk instalado, preferencialmente as últimas versões para executar os arquivos .jar. Você pode baixar [aqui](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)

* Basta baixar os algoritmos.jar da pasta executáveis e colocar em uma pasta de fácil acesso (preferencialmente área de trabalho).


                                                                 Linux
* Usarei o debian como exemplo. Os seus derivados como ubuntu, lubuntu e todas as outras distribuições baseadas no debian. Note que pode ser que para algumas distribuições tenha algumas diferenças e outras SOs como Fedora, RedHat e etc, podem ser totalmente diferentes...


                                                       sudo apt-get install vim

* Feito isso, vá para o terminal e digite o seguinte:


                                                sudo apt-get install openjdk-11-jdk


* Digite y quando o terminal linux requisitar
* Digite java -version para saber se foi instalado corretamente
* Caso apareça: openjdk version "11.0.14" 2022-01-18
OpenJDK Runtime Environment (build 11.0.14+9-post-Debian-1deb10u1)
OpenJDK 64-Bit Server VM (build 11.0.14+9-post-Debian-1deb10u1, mixed mode, sharing), é que foi instalado corretamente

* Digite no terminal: sudo update-alternatives --config java

* Digte cd /usr/lib/jvm/java-11-openjdk-amd64 
* Em seguida, digite vim /etc/profile
* Com o editor vim aberto, vá até a última linha para inserção, depois de ''fi'' onde as linhas são identificadas com ~ (linhas vazias) e aperte insert
* Coloque:

* No espaço entre as " " apenas no segundo export ,  apague-as e coloque o cifrão $ 

export JAVA_HOME="path that you found"

export PATH=" "JAVA_HOME/bin:" "PATH

* Para sair do modo edição e ir para o modo comando, aperte esc 2x
* No modo comando, digite :wq! e aperte enter
* Reinicie a sua distribuição


## Funcionalidades

- O primeiro algoritmo é de impressão de uma cadeia de asteristicos com base na inserção de um número inteiro pelo usuário.
- O segundo algoritmo  tem a função de tornar uma senha forte e segura, checando os parâmetros necessários e os dados inseridos pelo usuário.
- O terceiro algoritmo serve para identificar anagramas de uma palavra inserida pelo usuário, analisar se há pares ou não de substrings da palavra que o usuário inseriu.
 

## Instruções

                                                              Windows

* Abra o prompt do windows

*  Digite no prompt: cd desktop/pastateste (exemplo de nome de pasta)

* Olhe a númeração dos algoritmos no final, escolha um e digite. 

  Exemplo: java -jar Algoritmo01.jar e aperte enter

                                                              Linux

* Baixe os arquivos executáveis (exemplo: Algoritmo01.jar, Algoritmo03.jar e etc...) e salve preferencialmente na pasta que você preferir. Pessoalmente, aconselho a pasta home apenas para testar o algoritmo.jar que você quer executar
* Abra o terminal e digite cd /home/(seusuario)
* Em seguida java -jar Algoritmo01.jar e aperte enter


Pronto, o seu algoritmo será executado. No caso do "seu usuario" é o usuário que você estabeleceu na sua distribuição e também é visível no terminal linux antes do @debian (exemplo: teste@debian). Você não só poderá executar essses algoritmos instalando o JDK 11 no linux, como programar em Java utilizando apenas editores de textos como Atom, Nano, Vim e etc... E vendo o resultado no bash do linux :D

                                                              Código

- Abra o bash do git
- Em seguida, digite git clone
- Copie o link desse repositório do github: https://github.com/PSEniac/projectCap.git
- Cole o link depois do git clone e aperte enter
- Pelo git clone, basta digitar cd projectCap/ 
- Você pode acessar os arquivos tanto pelo padrão de pastas e arquivos quanto pelo bash do git


## Tecnologias

* Java
* Eclipse Installer 2020‑12-R

## Ajuda
- Documentação Java: [aqui](https://docs.oracle.com/javase/10/)
- Este readme.md

## Autor

- PSEniac

## Considerações do Autor

- Me perdoem por não ser um projeto de alto nível e me desculpem qualquer erro que acontecer, como todo algoritmo, o seu lançamento quer dizer que apenas funciona, mas, que ainda precisa de uma série de aprimoramentos, correções e etc...

- Esse projeto me ajudou muito a melhorar como pessoa tanto quanto tecnicamente em java, passei muitas horas à fio tentando montar as estruturas desses algoritmos e os seus cálculos para ler a entrada e gerar exatidão na saída. Como podem ver, faltam várias correções e funcionalidades adicionais, mas, em breve terá novas atualizações. Apesar de ser iniciante, estou orgulhoso da luta pra chegar até aqui e de pelo menos ter entregado algoritmos que funcionem.

- Espero que tenham gostado!
