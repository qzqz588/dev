package CH36.Domain.Common.Dao;

import java.sql.Connection;

public class ConnectionItem {
    private Connection conn;
    private boolean isUse;
    public ConnectionItem(Connection conn){
        this.conn = conn;
        isUse = true;
    }
    //toString

    @Override
    public String toString() {
        return "ConnectionItem{" + "conn=" + conn + ", isUse=" + isUse + '}';
    }
    //Getter and Setter

    public Connection getConn() {
        return conn;
    }


    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        this.isUse = isUse;
    }
}
