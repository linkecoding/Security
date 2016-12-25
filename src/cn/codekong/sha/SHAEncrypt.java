package cn.codekong.sha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import cn.codekong.util.Utils;

/**
 * SHA类算法
 * @author szh
 *
 */
public class SHAEncrypt {
	
	/**
	 * 对指定字符串进行SHA-1 SHA-224 SHA-256  SHA-512加密
	 * @param src
	 * @return
	 */
	public static String shaEncrypt(String src, String method){
		String res = null;
		method = method.substring(0, 3) + "-" + method.substring(3);
		try {
			MessageDigest md = MessageDigest.getInstance(method);
			byte[] bytes = md.digest(src.getBytes());
			res = Utils.bytesToHexString(bytes);
		} catch (NoSuchAlgorithmException e) {
		}
		return res;
	}
}
