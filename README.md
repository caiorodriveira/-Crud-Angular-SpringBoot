# Crud-Angular-SpringBoot
Projeto crud com Angular, Springboot, REST e PostgreeSql
<br>IDEs e programas utilizados:
<br>VSCode: Angular CLI
<br>SpringTools 4: SpringBoot
<br>PostgreSQL: Gerenciamento de banco de dados
<br>Postman: Testes e verificação de APIs

# Instruções
Siga as instruções na ordem em que estão, para poder testar e rodar o projeto corretamente.
#
Inicialmente é necessário que tenha instalado o SGBD `PostgreSql`. Crie um banco `pessoas-db` 
### crud-backend-pessoas
Na pasta de back-end, navegue até `src\main\resources` e abra o arquivo `application.properties` com alguma IDE Spring ou editor texto/código (recomendável que utilize o `Spring Tools 4` ou `Visual Studio Code`). Nesse arquivo deve atualizar com suas informações de `datasource` do Postgre, e também desfazer os comentários já presentes no arquivo (remova o símbolo `#`).
<br><b>PS</b>: na primeria vez que rodar o back-end, na linha `spring.jpa.hibernate.ddl-auto=update`, modifique o update para `create-drop` criando assim as tabelas inicialmente, depois de criadas, altere novamente para `update` conforme for inserindo os paises e estados.<br>
Em seguida realize os inserts de países e estados presentes nesse repositório: <a>https://github.com/guerreroeileen/paises_estados_del_mundo/tree/master/sql</a>
<br><b>PS:</b> Nos inserts da table `estado`, as colunas de `id_pais` e `nome` estão trocadas, ordene essas colunas no insert (INSERT INTO estados (id, id_pais, nome) VALUES...)<br>
Compile o código alterando o `create-drop` da linha `spring.jpa.hibernate.ddl-auto` para `update`, e verifique se está funcionando no Postgre. Após testar, recomente as ultimas tres linhas de `application.properties`
### crud-frontend-pessoas
Na pasta de front-end, instale as dependências do angular com `npm install` (recomendável que faça pelo terminal de sua máquina antes de abrir o projeto em alguma IDE ou editor de código).
<br><br>
Seguidas a instruções, com o Postgre rodando, compile o código back-end e em seguida o front-end com `npm run start` ou `ng serve` pelo terminal (lembrando que precisa estar dentro da pasta de front-end).
<br>
### Extras 
Versão do Angular: 14.0.7
<br>Versão do Java: 17.0.3.1 2022-04-22 LTS
