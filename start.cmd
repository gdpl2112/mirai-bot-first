rmdir libs

mvn clean dependency:copy-dependencies -DoutputDirectory=libs compile

java -classpath ".\target\classes;.\libs\*" io.github.kloping.kzero.main.DevMain -Dfile.encoding=UTF-8
