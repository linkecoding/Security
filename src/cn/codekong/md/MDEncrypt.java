package cn.codekong.md;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD4Digest;

import cn.codekong.util.Utils;

public class MDEncrypt {
	
	/**
	 * 对指定字符串进行MD2、MD4、MD5进行加密
	 * @param src
	 * @param method
	 * @return
	 */
	public static String mdEncrypt(String src, String method){
		String res = null;
		if(method.equals("MD2") || method.equals("MD5")){
			try {
				MessageDigest md = MessageDigest.getInstance(method);
				byte[] mdBytes = md.digest(src.getBytes());
				res = Utils.bytesToHexString(mdBytes);
			} catch (NoSuchAlgorithmException e) {
			}
		}else if(method.equals("MD4")){
			Digest digest = new MD4Digest();
			digest.update(src.getBytes(), 0, src.getBytes().length);
			byte[] md4Bytes = new byte[digest.getDigestSize()];
			digest.doFinal(md4Bytes, 0);
			res = org.bouncycastle.util.encoders.Hex.toHexString(md4Bytes);
		}
		return res;
	}
}
