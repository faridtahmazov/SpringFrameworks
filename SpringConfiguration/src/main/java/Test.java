import bean.DBConnection;

public class Test {

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();

        dbConnection.openConnection();
        dbConnection.closeConnection();
    }
}
