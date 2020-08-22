# [Curso: Java COMPLETO - Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/)

## Seção 23:Projeto: Aplicação desktop com JavaFX e banco de dados MySQL com JDBC

### Prof. Dr. Nelio Alves

## Capítulo: Projeto JavaFX com JDBC

**Objetivo geral:**
- Introduzir o aluno ao desenvolvimento de aplicações JavaFX com JDBC
- Permitir que o aluno conheça os fundamentos e a utilização das ferramentas, de modo que ele possa
depois prosseguir estudando, de forma confortável, as especificidades que desejar

**REQUISITOS:** OO & Lambda & JDBC & JavaFX

**PROJETO DO PROFESSOR:** https://github.com/acenelio/workshop-javafx-jdbc

## Github project

**Checklist:**
- Gitignore: Java

## Local project created

**Checklist:**
- User libraries: JavaFX, MySQLConnector
- Run configurarions -> VM arguments:
`--module-path E:\java-libs\javafx-sdk-11.0.2\lib --add-modules=javafx.fxml,javafx.controls`
- Git:
  - git init
  - git remote add origin https://github.com/Edufreitass/workshop-javafx-jdbc.git
  - git pull origin master
- Gitignore:
    
      # build folders
      bin/
      target/
      nbproject/private/
      build/
      nbbuild/
      dist/
      nbdist/

## Main view

**Checklist:**
- Create FXML "MainView" (package "gui")
- Load FXML in Main
- Update Main.java

```java
@Override
public void start(Stage primaryStage) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
        Parent parent = loader.load();
        
        Scene mainScene = new Scene(parent);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Sample JavaFX application");
        primaryStage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

## Main view design

**Checklist:**
- Design MainView.fxml
- Customize menu items
- Update Main.java

![image](https://user-images.githubusercontent.com/56324728/90935228-29fbd600-e3d9-11ea-9cd8-86189ea9b8ed.png)

## Main view controller

**Checklist:**
- Create controller
- In view, associate controller, ids, events

## About view

**Checklist:**
- Include util classes to the project (Alerts.java, Constraints.java)
https://github.com/acenelio/javafx5/blob/master/src/gui/util/Alerts.java
https://github.com/acenelio/javafx5/blob/master/src/gui/util/Constraints.java
- Create About.fxml (VBox)
- In Main.java, expose mainScene reference
- In MainViewController.java, create loadView method

## DepartmentList view design

**Checklist:**
- Create DepartmentList.fxml (VBox)
- In MainViewController.java, load DepartmentList

![image](https://user-images.githubusercontent.com/56324728/90960280-f53e5c00-e476-11ea-94aa-af84f2e93222.png)

## DepartmentList controller

**Checklist:**
- Create model.entities.Department.java
https://github.com/acenelio/demo-dao-jdbc/blob/master/src/model/entities/Department.java
- Create DepartmentListController.java
- In view, associate controller, ids, events
