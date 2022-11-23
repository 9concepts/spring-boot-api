# REST API with Spring Boot

## Troubleshooting

### `UnsupportedClassVersionError`

ランタイムとして Java 17 (61) を期待しているけど、58 で動かそうとしてると言われている。

```bash
エラー: メイン・クラスcom.kotlinspring.coursecatalogservice.CourseCatalogServiceApplicationKtのロード中にLinkageErrorが発生しました
	java.lang.UnsupportedClassVersionError: com/kotlinspring/coursecatalogservice/CourseCatalogServiceApplicationKt has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 58.0

Process finished with exit code 1
```

Mac ユーザーわしは https://www.oracle.com/java/technologies/downloads/#jdk17-mac から Java 17 をダウンロードしてインストールして解決した。
InteliJ を使っている場合はプロジェクトで Java 17 を使うように設定する必要がある。

![Project Structure](./images/intelij-project-structure-java17.png)

#### References

- [How to Fix UnsupportedClassVersion Error in Java | Rollbar](https://rollbar.com/blog/java-unsupportedclassversionerror/)