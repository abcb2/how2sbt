.
├── build.sbt
├── project
│ └── Build.scala
└── src
    ├── main
    │ ├── java
    │ ├── resources
    │ └── scala
    └── test
       ├── java
       ├── resources
       └── scala

----------
上記のtreeはベースディレクトリ以下の構成
・sbtはmavenと同じディレクトリ構成を使う
・src内の上記以外の他のディレクトリは無視される
・ベースディレクトリにbuild.sbtを配置し、他のsbt関連のファイルは
　projectサブディレクトリに配置する
・projectディレクトリには.scalaファイルを含むことができ、.sbtファイルと
　組み合わせてビルド定義を構成する
・ビルド成果物はベースディレクトリ以下のtargetに配置される

