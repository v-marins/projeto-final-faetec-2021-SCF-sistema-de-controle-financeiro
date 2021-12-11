<div align=center>
 <img width=400 src='https://github.com/v-marins/projeto-final-faetec-2021-SCF-sistema-de-controle-financeiro/blob/ca0c75fb810a91b31a19d86ac751d750b9cdd55b/src/imagens/logoBig.png'/>
 </div>
 
<h1 align=center> SCF Controle Financeiro - Projeto Final FAETEC 2021 </h1>

<h3 align=center><i>~Em Construção :construction:~</i></h3>

## :link: Índice

- [Sobre o Projeto](#dart-sobre-o-projeto)
- [Introdução](#bookmark_tabs-introdução)
- [Layout](#art-layout)
- [Features](#mega-features)
- [Tecnologias Utilizadas](#wrench-tecnologias-utilizadas)
- [Como Executar o Projeto](#computer-como-executar-o-projeto)
- [Autor](#raising_hand-autor)


## :dart: Sobre o Projeto

Trabalho de Conclusão do Curso apresentado à banca examinadora do Curso Técnico em Informática do Instituto Superior de Educação do Rio de Janeiro como requisito para a obtenção do Título de Técnico em Informática. O objetivo do projeto é o desenvolvimento de um software desktop de controle financeiro pessoal, com ferramentas open source como a linguagem Java e o sistema gerenciador de banco de dados MySQL. O software é para que os usuários tenham controle sobre sua condição financeira, obtendo assim uma visão mais detalhada das entradas e saídas do seu “fluxo de caixa” pessoal. A intenção é oferecer um software que atenda às necessidades do usuário de maneira fácil e de rápida adaptação.

## :bookmark_tabs: Introdução

Para o desenvolvimento do trabalho, foi escolhido o ramo de finanças domésticas, pois alguns softwares já existentes nessa categoria de gestão financeira são complexos e tem maior foco na área empresarial. Este software foi concentrado no controle doméstico de forma simples, para que qualquer usuário possa utilizá-lo com eficácia.
O objetivo geral foi utilizar as técnicas e conhecimentos adquiridos ao longo do curso para desenvolver um software desktop capaz de auxiliar o gerenciamento e controle de despesas pessoais utilizando a linguagem de programação Java, com banco de dados MySQL. Este software de organização financeira foi nomeado “SCF – Controle Financeiro”.
Para realização deste trabalho utilizei como fonte de pesquisa livros, sites e vídeos referentes ao assunto de Desenvolvimento de software, além dos sites oficiais das ferramentas utilizadas. O sistema foi desenvolvido na linguagem Java utilizando o pacote de desenvolvimento JDK 8.2 com a ferramenta NetBeans 8.2, o banco de dados MySQL versão 8.0 e o sistema de gerenciamento de banco de dados MySQL WorkBench 8.0, também utilizei a biblioteca “rs2xml” para manipulação e comunicação entre as tabelas disponíveis na aplicação, o banco de dados e o java. O diagrama de classe do software e o diagrama de caso de uso foram criados a partir do software Visual
Paradigm, O modelo físico do banco foi gerado na própria ferramenta MySQL WorkBench.

## :art: Layout

<p float="left">
  <img src="https://user-images.githubusercontent.com/58406515/145662820-0e1bacf2-ee18-41f4-bfb4-dbb570b7c058.png" width="500" />
  <img src="https://user-images.githubusercontent.com/58406515/145662820-0e1bacf2-ee18-41f4-bfb4-dbb570b7c058.png" width="500" /> 
  <img src="https://user-images.githubusercontent.com/58406515/145662820-0e1bacf2-ee18-41f4-bfb4-dbb570b7c058.png" width="500" />
</p>


## :mega: Features

## :wrench: Tecnologias Utilizadas

- [Java SE 8.2](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)
- [MySQL 8](https://dev.mysql.com/downloads/installer/)
- [Biblioteca rs2xml](https://sourceforge.net/projects/finalangelsanddemons/files/rs2xml.jar/download)
- [Netbeans 8.2](https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)

## :computer: Como executar o projeto
Pré-requisitos:

```
Sistema operacional Microsoft Windows 7 Service Pack 2 ou mais recente,Linux ou Mac.

Pacote Java JDK 8 instalado.

IDE Netbeans 8.2 instalado.

MySQL versão 8 e MySQL WorkBench 8 CE instalados.

```
Após todas as intalações:

- Crie o banco de dados utilizando esse script [AQUI](https://github.com/v-marins/projeto-final-faetec-2021-SCF-sistema-de-controle-financeiro/blob/48e583f13df7d4ff7c502c25722752f3cfa9fe4e/Scripts%20DDL%20das%20tabelas%20de%20banco%20de%20dados%20MySQL.md)
- Faça o download do projeto.
- Adicione o conector que se encontra no diretório *src/driver* às depêndencias do projeto.
- Adicione a biblioteca rs2xml que se encontra no diretório *src/rs2xml* às depêndencias do projeto.
- Altere as informaçoes de *user* e *pass* na classe *src/dal/ModuloConexao* com as informações referentes ao BD instalado na máquina local.
- Execute o projeto.

## :raising_hand: Autor
- **Vinicius Marins** - [Linkedin](https://www.linkedin.com/in/vinicius-marins/) 
