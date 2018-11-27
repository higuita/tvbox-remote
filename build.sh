javac  -d out/  meocomando/*.java
rm tvbox-remote.jar
cd out
jar -cvfm tvbox-remote.jar manifest meocomando
cd ..
