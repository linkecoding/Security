#java常见的加密算法封装

```
目前支持的加密种类
```
1. MD2
2. MD4
3. MD5


**注：JDK中未实现MD4加密,故使用第三方包,第三方包在项目根目录的lib目录下**

> MD类加密使用方法

```
方法一
```
> 将项目根目录的jar文件夹下的jar包引入项目即可

```
方法二
```

1. 将cn.codekong.md目录和cn.codekong.util目录拷贝到项目中

2. 如果需要使用MD4加密,还需要将项目根目录下的lib目录的jar包添加到项目的BuildPath

3. 调用方法

```
System.out.println(MDEncrypt.mdEncrypt("123", "MD2"));
System.out.println(MDEncrypt.mdEncrypt("123", "MD4"));
System.out.println(MDEncrypt.mdEncrypt("123", "MD5"));
```
**注：cn.codekong.test目录下为使用方法示例**