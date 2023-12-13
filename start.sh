rm -r libs
mvn clean dependency:copy-dependencies -DoutputDirectory=libs compile
java -Dfile.encoding=UTF-8 -cp "./target/classes:./libs/*" io.github.kloping.kzero.main.DevMain
