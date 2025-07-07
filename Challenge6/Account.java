package Challenge6;

import javax.sql.DataSource;

public abstract class Account {

    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
      //  myData.execute();
    }
}
