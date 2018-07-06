####Eureka实现服务注册中心

+ 配置高可用
```markdown

---
spring:
  profiles: eureka1
  application:
    name: eureka1
server:
  port: 8761
eureka:
  instance:
    hostname: eureka1
  client:
    serviceUrl:
      defaultZone: http://eureka2:8762/eureka/

---
spring:
  profiles: eureka2
  application:
    name: eureka2
server:
  port: 8762
eureka:
  instance:
    hostname: eureka2
  client:
    serviceUrl:
      defaultZone: http://eureka1:8761/eureka/

      
```

+ 启动方法

```markdown

sudo vi /etc/hosts
增加127.0.0.1  eureka1, eureka2

java -jar kxw-spring-cloud-server-1.0.0-SNAPSHOT.jar --spring.profiles.active=eureka1 &
java -jar kxw-spring-cloud-server-1.0.0-SNAPSHOT.jar --spring.profiles.active=eureka2 &

浏览器打开eureka1:8761和eureka2:8762，查看是否正确

```
