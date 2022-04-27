@echo off
set java=%JAVA_HOME%/bin/java
cd project/mirai-bot-first-master
%java% -Dfile.encoding=UTF-8 -classpath classpath/*.jar io.github.kloping.mirai0.Main.BotStarter
PAUSE