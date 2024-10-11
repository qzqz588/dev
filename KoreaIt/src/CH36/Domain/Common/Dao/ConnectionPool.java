package CH36.Domain.Common.Dao;

import CH36.Domain.Common.Dao.ConnectionItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private List<ConnectionItem> connectionPool;
    //ConnectionPool 에 저장될 Connection 을 위한 변수
    private final int size=10;
    private String url="jdbc:mysql://localhost:3306/bookDB";;
    private String id="root";
    private String pw="1111";

    //싱글톤 패턴 코드 추가
    private ConnectionPool() throws SQLException {

        this.connectionPool = new ArrayList();
        for(int i=0;i<size;i++) {
            Connection conn = DriverManager.getConnection(url,id,pw);
            connectionPool.add(new ConnectionItem(conn));
        }
        System.out.println("connection size : " + size);

    }
    private static ConnectionPool instance;
    public static ConnectionPool getInstance() throws SQLException {
        if(instance==null)
            instance = new ConnectionPool();
        return instance;
    }

    //
    public synchronized ConnectionItem getConnection() throws Exception {
        for(ConnectionItem connItem : connectionPool) {
            if(connItem.isUse()) {
                connItem.setUse(false); 	//사용중인 상태로 변경
                return connItem;	//Connection 리턴
            }
        }

        throw new Exception("모든 Connection이 사용중인 상태입니다.");
    }

    public synchronized void releaseConnection(ConnectionItem connItem) {
        connItem.setUse(true);
    }






}