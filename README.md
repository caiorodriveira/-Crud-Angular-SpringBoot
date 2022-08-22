# Crud-Angular-SpringBoot
Projeto crud com Angular, Springboot, REST e PostgreeSql

# Instruções
Siga as instruções na ordem em que estão, para poder testar e rodar o projeto corretamente.
#
Inicialmente é necessário que tenha instalado o SGBD `PostgreSql`. Crie um banco `pessoas-db` 
### crud-backend-pessoas
Na pasta de back-end, navegue até `src\main\resources` e abra o arquivo `application.properties` com algum editor de texto (recomendável que utilize o `Spring Tools 4` ou `Visual Studio Code`). Nesse arquivo deve atualizar com suas informações de `datasource` do Postgre, e também desfazer os comentários já presentes no arquivo (remova o símbolo `#`).<br>
<b>PS</b>: na primeria vez que rodar o back-end, na linha `spring.jpa.hibernate.ddl-auto=update`, modifique o update para `create-drop` criando assim as tabelas inicialmente, depois de criadas, altere novamente para `update` conforme for inserindo os paises e estados.<br>
Em seguida realize os inserts de países e estados presentes nesse repositório: <a>https://github.com/guerreroeileen/paises_estados_del_mundo/tree/master/sql</a>
<br>`em breve...`
