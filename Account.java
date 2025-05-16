import java.time.Duration;

abstract public class Account {

    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData){
        myData = _myData;

        myData.execute();
    }
}



class Admin extends Account{

    private String AuthPassword;

    public Admin(int _id, String _name, String _password){

        id = _id;

        name = _name;

        AuthPassword = _password;

    }

}
interface DataSource {

    public void execute();

}



class Delete implements DataSource{


    @Override

    public void execute() {

        System.out.println("Data has been deleted.");

    }

}


class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(152531, "Maxwell", "xa1@LW42%3");

        User curUser = new User(1123, "John");

        curAdmin.performOperation(new Update());

        curUser.performOperation(new View());
    }
}


class Update implements DataSource{

    @Override

    public void execute() {
try {
    System.out.println("Initializing...");
    Thread.sleep(2000);
    System.out.println("ConnectionEstablished.\nRunning update.");
    Thread.sleep(2000);
    System.out.println("Update successful");
    Thread.sleep(2000);
}
catch (InterruptedException e) {
    System.out.println(e);
}

    }

}


class User extends Account {

    public User(int _id, String _name){

        id = _id;

        name = _name;

    }

}

class View implements DataSource {

    @Override

    public void execute() {

        System.out.println("You don't have access to view this account.");
    }
}