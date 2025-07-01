public class Admin extends Account {

    private String AuthPassword;

    public Admin(int _id, String _name, String _password) {
        id = _id;
        name = _name;
        AuthPassword = _password;
    }
}
