#!/bin/sh

echo "check java version";

if ! type java >/dev/null 2>&1; then
  	echo "please use java 11-16 version to ensure that the program runs properly";
else
    echo "The device does not have java installed;Please restart the script after installing java11 \n https://adoptopenjdk.net/archive.html";
fi

echo "check git version";

if ! type git >/dev/null 2>&1; then
  	echo "git is installed";
else
    echo "The device does not have git installed;Please restart the script after installing git \n https://repo.huaweicloud.com/git-for-windows/v2.33.0.windows.2/Git-2.33.0.2-64-bit.exe";
fi

