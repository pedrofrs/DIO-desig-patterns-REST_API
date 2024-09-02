# DIO Design Patterns REST API

## Introduction

Welcome to the DIO Design Patterns REST API project! This project is a practical demonstration of the skills and knowledge gained from the Digital Innovation One's Spring Boot and RESTful API course. It highlights my ability to design and implement a robust RESTful API using modern design patterns. 
The project simulated virtual commerce, but it is worth making it clear that the focus was not on business logic, but rather on getting used to the Spring environment and consuming APIs.

## Project Overview

### Features

- **Custom Entities and Relationships**: In this project, I had the opportunity to create additional entities and delve deeper into their relationships, enhancing the overall data model and system design.
- **In-Memory Database**: The application uses an H2 in-memory database, which simplifies development and testing by providing a lightweight, temporary database solution.
- **API Documentation**: Swagger was utilized for comprehensive API documentation, making it easier to understand and interact with the API endpoints.

<img width="1418" alt="Project Screenshot" src="https://github.com/user-attachments/assets/7ee1077a-b0e7-45f2-abc4-2e04d8a49fad">

### Address Lookup Integration

The application integrates with the ViaCep API to fetch customer address information. By using the postal code (CEP), the system retrieves a JSON response from ViaCep, which is then used to build a detailed address model.

- **ViaCep API Integration**: This feature demonstrates how external APIs can be seamlessly integrated into the project to enhance functionality.

<img width="270" alt="ViaCep API Integration" src="https://github.com/user-attachments/assets/6fe70827-0bc0-41c2-bc77-5b4f4d98ec7e">
<img width="405" alt="ViaCep JSON Response" src="https://github.com/user-attachments/assets/06680bd9-27dc-4d03-ae99-e44c08ed231d">

The integration allows for efficient address lookups and ensures that address data is accurately and promptly retrieved.

<img width="627" alt="Address Model Construction" src="https://github.com/user-attachments/assets/8e4e8d05-a8ad-4cc1-b70e-2dfcac916747">

## Conclusion

Thank you for exploring the DIO Design Patterns REST API project. This project not only showcases my technical skills but also highlights my ability to effectively integrate external services and document APIs. Feel free to explore the code and documentation to see how the various components come together to create a functional and well-designed RESTful API.

---

# Padrões de Design DIO API REST

## Introdução

Bem-vindo ao projeto Padrões de Design DIO API REST! Este projeto é uma demonstração prática das habilidades e conhecimentos adquiridos no curso de Spring Boot e API RESTful da Digital Innovation One. Ele destaca minha capacidade de projetar e implementar uma API RESTful robusta utilizando padrões de design modernos.
O projeto simulou um comércio virtual, mas vale deixar claro que o foco não foi na lógica de negócio, mas sim se habituar ao ambiente Spring e consumo de APIs.
## Visão Geral do Projeto

### Funcionalidades

- **Entidades e Relações Personalizadas**: Neste projeto, tive a oportunidade de criar entidades adicionais e aprofundar o estudo das relações entre elas, aprimorando o modelo de dados e o design do sistema.
- **Banco de Dados em Memória**: A aplicação utiliza um banco de dados em memória H2, o que simplifica o desenvolvimento e os testes ao fornecer uma solução de banco de dados leve e temporária.
- **Documentação da API**: O Swagger foi utilizado para a documentação abrangente da API, facilitando a compreensão e a interação com os endpoints da API.

<img width="1418" alt="Captura de Tela do Projeto" src="https://github.com/user-attachments/assets/7ee1077a-b0e7-45f2-abc4-2e04d8a49fad">

### Integração com a Busca de Endereços

A aplicação se integra com a API ViaCep para recuperar informações de endereço dos clientes. Utilizando o código postal (CEP), o sistema obtém uma resposta JSON da ViaCep, que é então usada para construir um modelo de endereço detalhado.

- **Integração com a API ViaCep**: Esta funcionalidade demonstra como APIs externas podem ser integradas ao projeto de forma eficaz para aprimorar a funcionalidade.

<img width="270" alt="Integração com API ViaCep" src="https://github.com/user-attachments/assets/6fe70827-0bc0-41c2-bc77-5b4f4d98ec7e">
<img width="405" alt="Resposta JSON da ViaCep" src="https://github.com/user-attachments/assets/06680bd9-27dc-4d03-ae99-e44c08ed231d">

A integração permite buscas de endereços eficientes e garante que os dados de endereço sejam recuperados de forma precisa e rápida.

<img width="627" alt="Construção do Modelo de Endereço" src="https://github.com/user-attachments/assets/8e4e8d05-a8ad-4cc1-b70e-2dfcac916747">

## Conclusão

Obrigado por explorar o projeto Padrões de Design DIO API REST. Este projeto não apenas exibe minhas habilidades técnicas, mas também destaca minha capacidade de integrar serviços externos e documentar APIs de maneira eficaz. Sinta-se à vontade para explorar o código e a documentação para ver como os diversos componentes se unem para criar uma API RESTful funcional e bem projetada.

