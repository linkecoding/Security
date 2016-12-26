package cn.codekong.mac;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import cn.codekong.util.MACKind;
import cn.codekong.util.Utils;

/**
 * MAC¿‡º”√‹À„∑®
 * @author szh
 *
 */
public class MACEncrypt {
	
	public static String macEncrypt(String src, MACKind macKind){
		String method = macKind.toString();
		String res = null;
		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance(method);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] key = secretKey.getEncoded();
			SecretKey restoreSecretKey = new SecretKeySpec(key, method);
			Mac mac = Mac.getInstance(restoreSecretKey.getAlgorithm());
			mac.init(restoreSecretKey);
			byte[] hmacBytes = mac.doFinal(src.getBytes());
			res = Utils.bytesToHexString(hmacBytes);
		} catch (NoSuchAlgorithmException e) {
		} catch (InvalidKeyException e) {
		}
		return res;
	}

}
