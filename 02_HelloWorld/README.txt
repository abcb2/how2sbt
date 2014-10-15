# hello world
http://www.scala-sbt.org/0.13/tutorial/ja/Hello.html をおべんきょ

## 01
カレントディレクトリにhw.scalaを置いてsbtを起動。  
コンソールでrunを打ち込んで動作させる。
sbt runでもok。  
targetディレクトリが自動で作られる

## 02
下記のように./src/main/scala ./src/test/scala ./libを自動検知する。  
01と同様にsbt runで動作する。targetディレクトリも作られる。  

>./
>├── lib
>└── src
>    ├── main
>    │   └── scala
>    │       └── hw.scala
>    └── test
>        └── scala

## 03
ビルド定義とsbtバージョンの指定
・ベースディレクトリにbuild.sbtを設置する
・build.propertiesにsbtバージョンの指定もできる

