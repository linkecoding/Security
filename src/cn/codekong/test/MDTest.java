package cn.codekong.test;

import cn.codekong.md.MDEncrypt;

public class MDTest {
	public static void main(String[] args) {
		System.out.println(MDEncrypt.mdEncrypt("123", "MD2"));
		System.out.println(MDEncrypt.mdEncrypt("123", "MD4"));
		System.out.println(MDEncrypt.mdEncrypt("123", "MD5"));
	}
}
