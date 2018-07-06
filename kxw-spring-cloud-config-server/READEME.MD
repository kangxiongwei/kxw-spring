####配置文件的http访问方式
```markdown
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```

####访问配置文件的示例
```markdown
http://localhost:8888/cloud-config-client/dev/master
http://localhost:8888/cloud-config-client-dev.properties
http://localhost:8888/master/cloud-config-client-dev.properties
```