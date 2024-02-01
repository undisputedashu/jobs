//package com.example.jobs.configs;
//
//import com.example.jobs.properties.QuartzDatabaseConfigProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class QuartzDataSourceConfig {
//    @Autowired
//    private QuartzDatabaseConfigProperties quartzDatabaseConfigProperties;
//
//    @Bean(name = "quartzDataSource")
//    public DataSource quartzDataSource() {
//        return DataSourceBuilder.create()
//                .url(quartzDatabaseConfigProperties.getUrl())
//                .username(quartzDatabaseConfigProperties.getUsername())
//                .password(quartzDatabaseConfigProperties.getPassword())
//                .build();
//    }
//
//    @Bean(name = "transactionManager")
//    public PlatformTransactionManager schedulerTransactionManager() {
//        final DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(quartzDataSource());
//        return transactionManager;
//    }
//}