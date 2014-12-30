■インタラクティブモード
$ sbt
> compile
> run
> exit

■バッチモード
$ sbt clean compile "testOnly TestA TestB"
  testOnlyにTestA と TestBの二つの引数を渡す。testOnlyなんてアクション(?)あるのかな？

■継続的ビルドとテスト
インタラクティブモードで下記のようにすることで、ソースに変更があったときに
自動でコンパイルしてくれる。でもrunさせる時は一度監視モードを抜ける必要あり？
> ~ compile

■よく使われるコマンド
clean   .. targetディレクトリ以下の不要ファイルの削除(target自体は残る..)
compile .. src/main/scalaとsrc/main/javaディレクトリにあるソースをコンパイル
test    .. 全てのテストを実行
console .. コンパイル済みソースと依存ライブラリにclasspathを通してscalaコンソール起動
run     .. sbtと同じ仮想マシン上でプロジェクトのメインクラスを実行
package .. src/main/resources内のファイルとsrc/main/scalaとsrc/main/javaから
           コンパイルされたクラスを含むjarを作る
help    .. help <command>でコマンドの詳細ヘルプ sbt "help project"などとする。。
reload  .. ビルド定義(build.sbt, project/*.scala, project/*.sbt)を再読み込みする
!       .. historyコマンドのヘルプ
