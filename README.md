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

```

## Back end
Pré-requisitos: 
Java versão 17
PostgreSQL versão 13

# Autor
Paulo Rosmaninho

https://www.linkedin.com/in/paulorosmaninho
