
## [项目部署教程](https://afdian.net/p/6b382ac0e73611edb9b652540025c377)

欢迎来到我的第一个 bot 项目

此rep是本人从学习阶段开始编写的 所以结构设计的有些 ~~屎~~

但是涵盖的功能 和 代码量 还是很多的

该rep也包含(运用)了 我所学的 大部分 知识(编程)

该项目 由于经过几次的框架更改 变成如今的面孔

## **[菜单/介绍/功能](./docs/menu.md)**

<hr>

* [Project](https://github.com/gdpl2112/mirai-bot-first-src/tree/master/main/java/Project)
  为主体内容 <br>
  其入口 将消息转化为 string 依靠 [SpringTool](https://github.com/Kloping/my-spring-tool) 匹配 Action的形式执行<br>
- 该rep 以转移至 [gdpl2112](https://github.com/gdpl2112) organizations
- 且仅对其内成员可见
- 同时[欢迎加入QQ群聊](https://jq.qq.com/?_wv=1027&k=30zOUA9B)

## 使用

创建数库并执行 文件 [sql](https://gitee.com/kloping/mirai-bot-first/blob/master/sql/init.sql)

脚本

1. [x] linux [kloping-bot](kloping-bot.sh)
2. [x] win [kloping-bot](kloping-bot.bat)

配置

- application.yml

```yaml
spring:
   datasource:
    #     数据源配置 localhost:3306 数据库位置 gdb1 数据库名 根据自己情况修改
     url: jdbc:mysql://localhost:3306/gdb1?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true
     #数据库用户名
     username: root
     #数据库密码
     password: root
     driver-class-name: com.mysql.jdbc.Driver
   resources:
     static-locations: classpath:static,file:./images,file:./static,file:./temp
   web:
     resources:
       static-locations: classpath:static,file:./images,file:./static,file:./temp

   server:
     #web端口
     port: 20049
     tomcat:
       remote-ip-header: x-forward-for
       uri-encoding: UTF-8
       max-threads: 1000
       max-http-header-size: 8096

   web:
     url: http://localhost
     pwd: 123456

   auth:
     super:
       pwd: 000000
     pwd: 123456
```  
- conf.txt

```text
//非法名词
Illegal.txt=
//非法名词
Illegal.send=
//超级权限QQ号 , #逗号分割
superQL=1,2
//机器人自称(名字 
bot.myName=0号
//是否为测试环境
env.test=false
```

<details> 
<summary>笔记</summary> 


Linux 依赖下载

    git clone https://github.com/kloping/mirai-bot-first

确保maven已经安装

    mvn -f pom.xml dependency:copy-dependencies -X

</details>