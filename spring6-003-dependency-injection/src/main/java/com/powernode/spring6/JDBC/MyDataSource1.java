package com.powernode.spring6.JDBC;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class MyDataSource1 implements DataSource {
//    private String driver;
//    private String url;
//    private String username;
//    private String password;
    private Properties properties;
    public void setProperties(Properties properties)
    {
        this.properties = properties;
    }
    /**
     * @return
     * @throws SQLException
     */
    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    /**
     * @param username the database user on whose behalf the connection is
     *                 being made
     * @param password the user's password
     * @return
     * @throws SQLException
     */
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    /**
     * @param out the new log writer; to disable logging, set to null
     * @throws SQLException
     */
    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    /**
     * @param seconds the data source login time limit
     * @throws SQLException
     */
    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    /**
     * @return
     * @throws SQLFeatureNotSupportedException
     */
    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    /**
     * @param iface A Class defining an interface that the result must implement.
     * @param <T>
     * @return
     * @throws SQLException
     */
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    /**
     * @param iface a Class defining an interface.
     * @return
     * @throws SQLException
     */
    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
