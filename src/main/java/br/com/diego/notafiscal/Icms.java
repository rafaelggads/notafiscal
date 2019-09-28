package br.com.diego.notafiscal;

import java.math.BigDecimal;

public class Icms implements Imposto
{
	public BigDecimal valorImposto ()
	{
		return  BigDecimal.valueOf(0.11);
	}
}
