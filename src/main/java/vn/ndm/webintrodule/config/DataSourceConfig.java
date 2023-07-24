package vn.ndm.webintrodule.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    public static final String COM_MYSQL_CJ_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String COM_ORACLE_CJ_JDBC_DRIVER = "oracle.jdbc.OracleDriver";

    @Primary
    @Bean(name = "oracle")
    public DataSource oracleDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(COM_ORACLE_CJ_JDBC_DRIVER);
        dataSourceBuilder.url("jdbc:oracle:thin:@//localhost:1521/orcl");
        dataSourceBuilder.username("manhnd");
        dataSourceBuilder.password("123456");
        return dataSourceBuilder.build();
    }
}
