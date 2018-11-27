javac  -d out/  meocomando/*.java
rm meo.jar
cd out
jar -cvfm meo.jar manifest meocomando
cd ..
