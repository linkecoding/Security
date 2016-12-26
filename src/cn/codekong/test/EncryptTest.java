package cn.codekong.test;

import cn.codekong.mac.MACEncrypt;
import cn.codekong.md.MDEncrypt;
import cn.codekong.sha.SHAEncrypt;
import cn.codekong.util.MACKind;
import cn.codekong.util.MDKind;
import cn.codekong.util.SHAKind;

/**
 * 加密算法测试类
 * @author szh
 *
 */
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
