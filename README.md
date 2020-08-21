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

```xml
<ScrollPane maxHeight="-Infinity" maxWidth="-Infinity"
	minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0"
	prefWidth="600.0" xmlns="http://javafx.com/javafx/10.0.1"
	xmlns:fx="http://javafx.com/fxml/1">
	<content>
		<VBox prefHeight="326.0" prefWidth="513.0">
			<children>
				<MenuBar>
					<menus>
						<Menu mnemonicParsing="false" text="Registration">
							<items>
								<MenuItem mnemonicParsing="false" text="Seller" />
								<MenuItem mnemonicParsing="false" text="Departments" />
							</items>
						</Menu>
						<Menu mnemonicParsing="false" text="Help">
							<items>
								<MenuItem mnemonicParsing="false" text="About" />
							</items>
						</Menu>
					</menus>
				</MenuBar>
			</children>
		</VBox>
	</content>
</ScrollPane>
```
