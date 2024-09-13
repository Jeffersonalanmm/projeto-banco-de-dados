# Projeto de Conexão com Banco de Dados

Este projeto demonstra como conectar-se a um banco de dados Oracle usando Java e executar uma consulta SQL para recuperar e exibir dados. O exemplo usa JDBC (Java Database Connectivity) para estabelecer a conexão e manipular dados.

## Pré-requisitos

Antes de executar o projeto, verifique se você possui os seguintes itens instalados:

1. **Java Development Kit (JDK)**: Certifique-se de ter o JDK instalado e configurado no seu ambiente. A versão recomendada é a JDK 8 ou superior.

2. **Driver JDBC para Oracle**: O driver JDBC necessário para conectar-se ao banco de dados Oracle deve estar disponível no classpath do projeto. Baixe o driver JDBC Oracle (`ojdbc8.jar` ou versão equivalente) a partir do [site oficial da Oracle](https://www.oracle.com/database/technologies/jdbc-driver-downloads.html).

3. **Banco de Dados Oracle**: Um banco de dados Oracle deve estar configurado e em execução. Atualize as credenciais de conexão e a URL no código conforme necessário.

## Configuração

1. **Configuração do Driver JDBC**: Certifique-se de que o driver JDBC da Oracle (`ojdbc8.jar`) está incluído no classpath do seu projeto. Se estiver usando um sistema de gerenciamento de dependências como Maven, adicione a dependência correspondente ao `pom.xml`.

2. **Atualização das Credenciais**: No código, substitua as variáveis `user` e `password` pelos detalhes da sua instância do banco de dados Oracle. Ajuste a URL `url` se necessário.

```java
String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Atualize com sua URL de conexão
String user = "system"; // Substitua pelo seu usuário
String password = "1234"; // Substitua pela sua senha
