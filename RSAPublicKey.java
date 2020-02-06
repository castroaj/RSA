package Utilities;

import java.io.Serializable;
import java.math.BigInteger;

public class RSAPublicKey implements Serializable {

	private static final long serialVersionUID = 1L;
	private BigInteger e;
	private BigInteger n;
	
	public RSAPublicKey(BigInteger e, BigInteger n)
	{
		this.e = e;
		this.n = n;
	}
	
	public BigInteger getE() {
		return e;
	}

	public void setE(BigInteger e) {
		this.e = e;
	}

	public BigInteger getN() {
		return n;
	}

	public void setN(BigInteger n) {
		this.n = n;
	}
}
