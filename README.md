#java常见的加密算法封装

## 目前支持的加密种类

**MD类加密算法**

```
1. MD2
2. MD5
```

**注：JDK中未实现MD4加密,如若需要可以借助于项目根目录下的lib文件夹中的包进行MD4加密**

**SHA类加密算法**

```
1. SHA-1
2. SHA-224
3. SHA-256
4. SHA-384
5. SHA-512
```

**MAC类加密算法**
```
1. HmacMD5
2. HmacSHA1
3. HmacSHA224
4. HmacSHA256
5. HmacSHA384
6. HmacSHA512
```
**注：JDK中未实现HmacMD2 HmacMD4加密,如若需要可以借助于项目根目录下的lib文件夹中的包进行加密实现**

> 加密类加密使用方法

```
将项目根目录的jar文件夹下的jar包引入项目即可
```

> 调用方法

```
public class EncryptTest {
	public static void main(String[] args) {
		/**
		 * MD类算法使用实例
		 */
		//MD2加密
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD2));
		//MD5加密
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD5));
		
		/**
		 * SHA类算法使用实例
		 */
		//SHA1加密
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA1));
		//SHA-224加密
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA224));
		//SHA-256加密
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA256));
		//SHA-384加密
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA384));
		//SHA-512加密
		System.out.println(SHAEncrypt.shaEncrypt("123", SHAKind.SHA512));
		
		/**
		 * MAC类算法测试
		 */
		//HmacMD5加密
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacMD5));
		//HmacSHA1加密
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA1));
		//HmacSHA224加密
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA224));
		//HmacSHA256加密
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA256));
		//HmacSHA384加密
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA384));
		//HmacSHA512加密
		System.out.println(MACEncrypt.macEncrypt("123", MACKind.HmacSHA512));
	}
}

```

**注：cn.codekong.test目录下为使用方法示例**
