欢迎来到我的第一个 bot 项目

此rep是本人从学习阶段开始编写的 所以结构设计的有些 ~~屎~~

所以这(坨)代码 更像是 ~~屎山~~

但是涵盖的功能 和 代码量 还是很多的

该rep也包含(运用)了 我所学的 大部分 知识(编程)

~~所以还请 大佬勿喷~~

该项目 由于经过几次的框架更改 变成如今的面孔

* [Project](https://github.com/gdpl2112/mirai-bot-first-src/tree/master/main/java/Project) 
    为主体内容 <br>
    其入口  将消息转化为 string 依靠 [SpringTool](https://github.com/Kloping/my-spring-tool) 匹配 Action的形式执行<br>
  * [具体入口实现](https://github.com/gdpl2112/mirai-bot-first-src/blob/master/main/java/io/github/gdpl2112/Mirai/Main/Handlers/MyHandler.java#L75)
  * [具体出口实现](https://github.com/gdpl2112/mirai-bot-first-src/blob/master/main/java/io/github/gdpl2112/Mirai/Main/Resource.java#L135)
* mirai 的 [启动目录](https://github.com/gdpl2112/mirai-bot-first-src/tree/master/main/java/io/github/gdpl2112/Mirai/Main)
  * 通过 [BotStarter](https://github.com/gdpl2112/mirai-bot-first-src/blob/master/main/java/io/github/gdpl2112/Mirai/Main/BotStarter.java) 
    获取配置文件中的 bot id password 登录
  * 以及消息通道注册,处理 

- 该rep 以转移至 [gdpl2112](https://github.com/gdpl2112) organization
- <br>且仅对其内成员可见
- 