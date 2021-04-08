package cn.example.ssh.demo.config;

import org.hibernate.dialect.MySQLDialect;

public class MySQL5DialectUTF8 extends MySQLDialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}