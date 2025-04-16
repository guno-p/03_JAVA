package ch06.expert;

public class Database {
    private static Database instance;
    private final String connection = "MySQL";

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

    public String getConnection() {
        return connection;
    }
}
