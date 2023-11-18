## Cora

### Contextualizando

Pedimos pra um estagiário desenvolver uma api que cria uma conta ativa com um saldo de 10 R$.

Ele conseguiu desenvolver mas a aplicação tem problemas de bugs, estrutura, code smells, más práticas em geral.

Hoje, a aplicação é pequena e tem o escopo reduzido, mas no futuro essa aplicação vai crescer e aumentar a complexidade.

Você é o responsável por melhorar a aplicação, faça o que achar necessário para melhorar o código e deixar a aplicação
em melhores condições para os desenvolvedores que irão implementar novas features. 

O payload que o endpoint deve receber é o seguinte:

```
{
    "name": "Adriano Ribeiro",
    "cpf": "12345678901"
}

```

### Instruções básicas
Assim que a aplicação subir, acesse: `http://localhost:8080/h2-console` para ter acesso ao banco em momória h2.

Utilize as seguintes credenciais para logar no banco:

JDBC URL: jdbc:h2:mem:testdb

User Name: sa

Pasword: `Deixar em branco`

O endpoint que cria as contas está disponibilizado na seguinte url: `localhost:8080/corabank` e ele responde um GET com 
o seguinte payload: 


```
{
    "id": 1,
    "name": "José",
    "cpf": "12345678901",
    "balance": 10.00,
    "active": true
}
```

