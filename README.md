#java常见的加密算法封装

```
目前支持的加密种类
```
1. MD2
2. MD4
3. MD5
4. SHA-1
5. SHA-224
5. SHA-256
5. SHA-512

**注：JDK中未实现MD4加密,故使用第三方包,第三方包在项目根目录的lib目录下,如果不使用MD4加密可以不引入第三方包**

> `MDEncrypt`类加密使用方法

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
/**
 * MD类算法使用实例
 */
//MD2加密
System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD2.toString()));
//MD4加密
System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD4.toString()));
//MD5加密
System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD5.toString()));
```

> `SHAEncrypt`类加密使用方法

```
方法一
```
> 将项目根目录的jar文件夹下的jar包引入项目即可

```
方法二
```

1. 将cn.codekong.md目录和cn.codekong.util目录拷贝到项目中

2. 调用方法

```
/**
* SHA类算法使用实例
*/
//SHA1加密
System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA1.toString()));
//SHA-224加密
System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA224.toString()));
//SHA-256加密
System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA256.toString()));
//SHA-512加密
System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA512.toString()));
```
**注：cn.codekong.test目录下为使用方法示例**
