package com.guia.diagnostico;

public class Ejercicio1 
{
	public static boolean diagonalIgualSumaAnteriores(int mat[][]) throws Exception //throws Exception, Exception2, Exception3, ... [SI NO TENGO UN BLOQUE TRY-CATCH que englobe a donde lanzo la exception]
	{
		int suma = 0;
		int cantidadDeFilas = mat.length;	//QUIERO PERDER ALMACENAMIENTO PARA GANAR PROCESAMIENTO[la otra es a la inversa]
	
		for(final int fila[]: mat)
		{
			if(fila.length != cantidadDeFilas)
			{
				throw new Exception("Matriz no cuadrada.");
			}
		}
		
		for(int i = 1; i < mat[0].length; i++)
		{
			suma += mat[i - 1][i - 1];
			if(suma != mat[i][i])
			{
				return false;
			}
		}
		return true;
	}
}
