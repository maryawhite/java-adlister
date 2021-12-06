import java.sql.*; //using this for the connect, not sure which one would have been correct
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;
    private Config config = new Config();


    public MySQLAdsDao(Config config) {

        try {
            new Driver();
            this.connection = DriverManager.getConnection(
                    this.config.getUrl(),
                    this.config.getUser(),
                    this.config.getPassword()
            );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";
        Statement statement = null;
        ResultSet resultSet = null;
        List<Ad> adList = new ArrayList<>();

        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                Ad currentAd = new Ad(resultSet.getLong("id"), resultSet.getLong("user_id"), resultSet.getString("title"), resultSet.getString("description"));

                adList.add(currentAd);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return adList;
    }

    @Override
    public Long insert(Ad ad) {
        Long lastInsertedId = 0L;
        try {
            Statement statement = null;
            ResultSet resultSet = null;
            statement = connection.createStatement();
            String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES (ad.getUserId(), ad.getTitle(), ad.getDescription())";

            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS); //use executeUpdate, not executeQuery here
            resultSet = statement.getGeneratedKeys();
            resultSet.next();
            lastInsertedId = resultSet.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lastInsertedId;
    }
}
