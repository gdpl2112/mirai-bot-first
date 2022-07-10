@echo off

echo "check java version"

set java=java

call %java% -version

if %errorlevel%==0 (
	echo "please use java 11-16 version to ensure that the program runs properly"
) else (
    echo "The device does not have java installed;Please restart the script after installing java11 \n https://adoptopenjdk.net/archive.html"
    pause
    exit
)

echo "check git version"

call git --version

if %errorlevel%==0 (
	echo "git is installed"
) else (
    echo "The device does not have git installed;Please restart the script after installing git \n https://repo.huaweicloud.com/git-for-windows/v2.33.0.windows.2/Git-2.33.0.2-64-bit.exe"
    pause
    exit
)

echo "check maven version"

call mvn -v

if %errorlevel%==0 (
	echo "maven is installed"
) else (
    echo "The device does not have maven installed;Please restart the script after installing maven \nhttps://maven.apache.org/install.html"
    pause
    exit
)

echo "check Finish"

echo "start get projects"

set dir=.\mirai-bot-first

if not exist %dir% (
    echo "clone"
    call git clone https://gitee.com/kloping/mirai-bot-first
) else (
    echo "pull"
    call cd ./mirai-bot-first
    call git pull origin master
    call git fetch --all
    call git reset --hard origin/master
    call cd ../
)

call cd ./mirai-bot-first

call  mvn -f pom.xml dependency:copy-dependencies -X

call copy .\out\artifacts\installer_jar\installer.jar ..\

call cd ..\

set /P pid=<./pid

taskkill /T /F /PID %pid%

call %java% -Dfile.encoding=UTF-8 -jar installer.jar

pause