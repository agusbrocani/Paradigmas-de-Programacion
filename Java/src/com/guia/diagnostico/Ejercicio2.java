package com.guia.diagnostico;

public class Ejercicio2 
{
	public static boolean productoDeTodoNumeroEnMatrizDaCero(int mat[][]) throws Exception
	{
		int cantidadDeColumnas = mat[0].length; //variable
		int cantidadDeFilas = mat.length; //fija
		int f;
		int c;
		
		for(f = 1; f < cantidadDeFilas; f++)
		{
			if(mat[f].length != cantidadDeColumnas)
			{
				throw new Exception("Matriz no matematica.");
			}
		}
		
		for(f = 0; f < cantidadDeColumnas; f++) //procesamiento por si es cuadrada o cf < cc
		{
			for(c = f; c < cantidadDeColumnas; c++)
			{
				if(0 == mat[f][c] || 0 == mat[c][f])
				{
					return true;
				}
			}
		}
		
		while(f < cantidadDeFilas) //procesamiento de filas remanentes
		{
			for(c = 0; c < cantidadDeColumnas; c++)
			{
				if(0 == mat[f][c])
				{
					return true;
				}
			}
			
			f++;
		}
		
		return false;
	}
}
