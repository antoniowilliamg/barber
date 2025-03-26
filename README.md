# Barber Management System

Este é um sistema de gerenciamento de barbearia desenvolvido com **Spring Boot**. O projeto permite a criação, listagem, atualização e exclusão de agendamentos, barbeiros e clientes. Ele utiliza um banco de dados H2 em memória para persistência de dados e está configurado para suportar operações básicas de CRUD.

---

## Estrutura do Projeto

### Pacotes Principais:
- **`controller`**: Contém os controladores REST para manipulação de agendamentos, barbeiros e clientes.
- **`model`**: Define as classes de modelo JPA (entidades).
- **`repository`**: Interfaces que estendem `JpaRepository` para acessar o banco de dados.

### Principais Arquivos:
- **`AgendamentoController`**: Gerencia as operações de agendamentos.
- **`BarbeiroController`**: Gerencia as operações de barbeiros.
- **`ClienteController`**: Gerencia as operações de clientes.
- **`application.properties`**: Configurações da aplicação, incluindo banco de dados H2 e JPA.

---

## Endpoints da API

### Agendamentos
- `POST /api/agendamentos`: Cria um novo agendamento.
- `GET /api/agendamentos`: Lista todos os agendamentos.
- `GET /api/agendamentos/{id}`: Busca um agendamento pelo ID.
- `PUT /api/agendamentos/{id}`: Atualiza os detalhes de um agendamento.
- `DELETE /api/agendamentos/{id}`: Remove um agendamento.

### Clientes
- `POST /api/clientes`: Cadastra um novo cliente.
- `GET /api/clientes`: Lista todos os clientes.
- `GET /api/clientes/{id}`: Busca um cliente pelo ID.
- `PUT /api/clientes/{id}`: Atualiza os detalhes de um cliente.
- `DELETE /api/clientes/{id}`: Remove um cliente.

### Barbeiros
- `POST /api/barbeiros`: Cadastra um novo barbeiro.
- `GET /api/barbeiros`: Lista todos os barbeiros.
- `GET /api/barbeiros/{id}`: Busca um barbeiro pelo ID.
- `PUT /api/barbeiros/{id}`: Atualiza os detalhes de um barbeiro.
- `DELETE /api/barbeiros/{id}`: Remove um barbeiro.

---

## Banco de Dados H2

- **URL**: `jdbc:h2:mem:testdb`
- **Usuário**: `sa`
- **Senha**: `password123`
- **Console**: `http://localhost:8080/h2-console`

---

## Melhorias Futuras

- Implementar paginação e ordenação para listagem de recursos.
- Adicionar testes unitários e de integração.
- Configurar Swagger para documentar a API.
- Melhorar validações de entrada usando `@Valid` e `@NotNull`.

---

Sinta-se à vontade para ajustar e personalizar o conteúdo com base nas suas necessidades!
