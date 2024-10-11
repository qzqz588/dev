package CH36.Domain.Common.Dao.connectionPool;


import CH36.Domain.Common.Dao.ConnectionItem;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ConnectionPoolByHikari {

    private final int size=10;
    private String url="jdbc:mysql://localhost:3306/bookDB";;
    private String id="root";
    private String pw="1111";

    private HikariDataSource dataSource;

    //싱글톤 패턴
    private ConnectionPoolByHikari(){
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl(url);
        config.setUsername(id);
        config.setPassword(pw);
        //Size
        config.setMaximumPoolSize(size);

        this.dataSource = new HikariDataSource(config);

    };
    private static ConnectionPoolByHikari instance;

    public static ConnectionPoolByHikari getInstance() {
        if(instance == null)
            instance = new ConnectionPoolByHikari();
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }



}
