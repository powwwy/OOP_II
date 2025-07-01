public class Main {

    public static void main(String[] args) {
        Admin curAdmin = new Admin(0003, "Natalie", "NaTpass_03");
        User curUser = new User(4567, "Fidel");

        curAdmin.performOperation(new Update());
        curUser.performOperation(new View());
    }
}
