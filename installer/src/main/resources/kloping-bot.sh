#!/bin/sh

java=java

echo "check java version"

result1=$(which java)

if [ ! -n "$result1" ]; then
  echo "The device does not have java installed;Please restart the script after installing java11 /n https://adoptopenjdk.net/archive.html"
else
  echo "java installed;please use java 11-16 version to ensure that the program runs properly"
fi

#=========
echo "check git version"

result2=$(which git)

if [ ! -n "$result2" ]; then
  echo "The device does not have git installed;Please restart the script after installing git /n https://repo.huaweicloud.com/git-for-windows/v2.33.0.windows.2/Git-2.33.0.2-64-bit.exe"
else
  echo "git is installed"
fi

#=========
echo "check maven version"

result3=$(which mvn)

if [ ! -n "$result3" ]; then
  echo "The device does not have maven installed;Please restart the script after installing maven /nhttps://maven.apache.org/install.html"
else
  echo "maven is installed"
fi

#======
echo "check Finish"

echo "start get projects"

if [ ! -d "./mirai-bot-first" ]; then
  git clone https://gitee.com/kloping/mirai-bot-first
else
  echo "pull"
  cd ./mirai-bot-first
  git pull origin master
  git fetch --all
  git reset --hard origin/master
  cd ../
fi

cd ./mirai-bot-first

mvn -f pom.xml dependency:copy-dependencies -X

cp ./out/artifacts/installer_jar/installer.jar ../

cd ../

pid=`cat ./pid`

kill -9 ${pid}

${java} -Dfile.encoding=UTF-8 -jar installer.jar

sh ./start.sh


