package examclouds.generics_and_nested_classes.ex1;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.println("\nЗапрос отправил пльзователь со следующими данными:\n");
            System.out.printf("\nLogin: %s", login);
            System.out.printf("\nLogin: %s", password);
        }
    }

    public void createQuery() {
        new Query().printToLog();
    }
}
