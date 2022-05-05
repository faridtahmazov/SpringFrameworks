public class DBConnection {
    private String url;
    private String username;
    private String password;

    public DBConnection(){}

    public DBConnection(String url, String username, String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public DBConnection(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void openConnection(){
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        System.out.println("Connection is open!");
    }

}
