# pluginDemo
简单开发一个java 插件式demo(https://blog.csdn.net/blog_zxb/article/details/79477429)

### pluginMain
主程序jar包

### plginA
A插件jar包

### 使用方式
```
1、将pluginMain使用maven安装到本地库：mvn install
2、打包pluginA项目：mvn package
3、配置plugin.xml中的jar包位置
4、运行pluginMain项目中的org.bing.plugin.Main类
```