# pluginDemo
简单开发一个java 插件式demo(https://blog.csdn.net/blog_zxb/article/details/79477429)

### pluginMain
主程序项目

### plginA
A插件项目

### 使用方式
```
1、使用maven将pluginMain安装到本地库：mvn install
（原因是pluginA会依赖pluginMain项目中org.bing.plugin.PluginService接口；可以考虑将这个接口单独做为一个jar包，这样pluginA就不用依赖pluginMain项目了）
2、打包pluginA项目：mvn package
（在plugin.xml中需要配置jar包文件路径）
3、在plugin.xml中配置pluginA的jar包位置
4、运行pluginMain项目中的org.bing.plugin.Main类
```