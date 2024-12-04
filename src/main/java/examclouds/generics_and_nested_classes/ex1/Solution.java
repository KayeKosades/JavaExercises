package examclouds.generics_and_nested_classes.ex1;

public class Solution {

    public static void main(String[] args) {
        User user = new User("user1", "1234");
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
        new User("user2", "1234").new Query().printToLog();
    }

}
