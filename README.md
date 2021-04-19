# Massaにプラグインの作り方を教える

paper serverを使用するなら
pom.xml はこう記述するべき
```
  <repository>
      <id>papermc</id>
      <url>https://papermc.io/repo/repository/maven-public/</url>
  </repository>
  
  <dependency>
      <groupId>com.destroystokyo.paper</groupId>
      <artifactId>paper-api</artifactId>
      <version>1.16.5-R0.1-SNAPSHOT</version>
      <scope>provided</scope>
  </dependency>
```

EventHandlerを使うなら
class に継承が必要
```
class MassaLobbyPlugin extends JavaPlugin implements Listener{
 クラスの記述
}
```
