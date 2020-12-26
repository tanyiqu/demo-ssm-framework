# 整合ssm框架的模板

## 1 创建maven项目

选择webapp骨架

## 2 pom.xml

### 2.1 导入依赖

```xml
<!-- junit 数据库驱动 连接池 servlet jsp mybatis mybatis-spring spring -->


```

### 2.2 资源放行

```xml
<build>
    <resources>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>false</filtering>
        </resource>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>false</filtering>
        </resource>
    </resources>
</build>
```

## 3 补充项目结构

新建所有该有的文件夹

创建com.pojo、com.mapper、com.service、com.controller包

## 4 新建配置文件

### 4.1 mybatis-config.xml

```xml

```

### 4.2 applicationContext.xml

```xml

```

