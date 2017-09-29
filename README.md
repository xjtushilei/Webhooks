# Webhooks

java执行预设命令，通过http调用，兼容linux和windows


## 举例

远程调用：
```
http://ip:port/execLinux/mvn
```

且数据库里存了“mvn”命令对应的是“mvn -v”，则执行得到的结果是：

```
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-11T00:41:47+08:00)
Maven home: /home/ubuntu/apache-maven-3.3.9
Java version: 1.8.0_131, vendor: Oracle Corporation
Java home: /home/ubuntu/jdk1.8.0_131/jre
Default locale: en_US, platform encoding: ANSI_X3.4-1968
OS name: "linux", version: "4.4.0-53-generic", arch: "amd64", family: "unix"
```

