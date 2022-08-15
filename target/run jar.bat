@echo off
java -jar --add-opens java.base/java.lang=ALL-UNNAMED %1
pause