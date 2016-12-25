package cn.codekong.test;

import cn.codekong.md.MDEncrypt;
import cn.codekong.sha.SHAEncrypt;
import cn.codekong.util.MDKind;
import cn.codekong.util.SHAKind;

public class MDTest {
	public static void main(String[] args) {
		/**
		 * MD类算法使用实例
		 */
		//MD2加密
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD2.toString()));
		//MD4加密
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD4.toString()));
		//MD5加密
		System.out.println(MDEncrypt.mdEncrypt("123", MDKind.MD5.toString()));
		
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
	}
}
