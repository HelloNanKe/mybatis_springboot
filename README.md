配置文件
```$xslt
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/springbootdb?useUnicode=true&characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

mybatis.typeAliasesPackage=com.zt.mybatis_springboot.domain
mybatis.mapperLocations=classpath:mapper/*.xml

logging.level.com.zt.mybatis_springboot: DEBUG
server.port=8080
```

在使用springboot2.0整合mybatis时会报错:
```$xslt
Unregistering JMX-exposed beans on shutdown；
Unregistering JMX-exposed beans
```
网上很多人说是因为tomcat未完成下载，只下载了一部分，其实并不是这样。
只需要将tomcat插件的<scope>由provided改为compiler即可，或者注释掉scope
