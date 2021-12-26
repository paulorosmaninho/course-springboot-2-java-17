# Projeto web services com Spring Boot e JPA / Hibernate


![GitHub repo size](https://img.shields.io/github/repo-size/paulorosmaninho/course-springboot-2-java-17)
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/paulorosmaninho/course-springboot-2-java-17/blob/master/LICENSE) 

# Sobre o projeto

https://course-spring-boot-java-17.herokuapp.com/

Este projeto faz parte do curso de Java do professor Nélio Alves.

É um projeto de web services RESTful com Spring Boot e JPA/Hibernate. Utiliza bancos de dados H2 para testes unitários e PostgreSQL para testes em desenvolvimento e implantação em produção.

O objetivo do curso foi demonstrar conceitos do Spring Boot para a construção de um CRUD de cliente, e recuperação de informações de categoria de produto, produto, pedido, item de pedido e pagamentos.

Os recursos ficam acessíveis aos clientes através da utilização das URIs (Uniform Resource Identifiers) disponibilizadas pela aplicação. 
Esses recursos podem ser acessados ou manipulados a partir das operações abaixo, utilizando o protocolo HTTP: 
* Criar (POST)
* Ler (GET) 
* Alterar (PUT) 
* Apagar (DELETE)

## Operações feitas via POSTMAN
* Cadastrar.
* Método POST: https://course-spring-boot-java-17.herokuapp.com/users
![Web 1](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/post.png)

* Listar.
* Método GET: https://course-spring-boot-java-17.herokuapp.com/users
![Web 2](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/get.png)

* Alterar.
* Método PUT: https://course-spring-boot-java-17.herokuapp.com/users
![Web 3](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/put.png)

* Consultar.
* Método GET: https://course-spring-boot-java-17.herokuapp.com/users/1
![Web 4](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/consulta.png)

* Deletar.
* Método DELETE: https://course-spring-boot-java-17.herokuapp.com/users
![Web 5](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/delete.png)

## Tratamento de Exception
* Consultar.
* Método GET: https://course-spring-boot-java-17.herokuapp.com/users/7
![Web 6](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/exception.png)


## Modelo conceitual
![Web 7](https://github.com/paulorosmaninho/assets/blob/master/course-springboot-2-java-17/modelo-conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Front end
- Simulado via POSTMAN

## Implantação em produção
- Back end: Heroku
- Banco de dados: PostgreSQL

# Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/paulorosmaninho/course-springboot-2-java-17.git

# entrar na pasta local do projeto
exemplo: cd course-springboot-2-java-17

# há duas formas de testar local. Com banco de dados H2, que 
# carrega as tabelas automaticamente e com PostgreSQL, que é preciso cadastrar.

# forma 1) testar com o banco de dados H2, que carrega as tabelas automaticamente:
# a. acessar a pasta \src\main\resources
exemplo: cd \src\main\resources
# b. localizar o arquivo application.properties e editá-lo.
# c. localizar a linha: #spring.profiles.active=test e tirar o jogo da velha.
# c.1. ficará desta forma: spring.profiles.active=test
# d. localizar a linha: spring.profiles.active=dev e colocar o jogo da velha.
# d.1. ficará desta forma: #spring.profiles.active=dev

# forma 2) testar com banco de dados PostgreSQL
# a. basta manter a configuração atual, mas as tabelas precisão ser populadas.

# para executar o projeto, basta rodar o comando abaixo dentro da pasta principal
mvnw spring-boot:run
# utilizar o POSTMAN para executar os métodos
```
## Back end
Pré-requisitos: 
Java versão 17
PostgreSQL versão 13

# Autor
Paulo Rosmaninho

https://www.linkedin.com/in/paulorosmaninho
