package com.guia.diagnostico;


public class Ejercicio3 
{
	public static int[][] sumatoriaDeArribaAbajoIzquierdaDerechaDePosicion(int mat[][]) throws Exception
	{
		int cantidadDeColumnas = mat[0].length;
		int cantidadDeFilas = mat.length;
		int f;
		int c;
		int matrizResultado[][] = new int[cantidadDeFilas][cantidadDeColumnas];
		
		for(f = 1; f < cantidadDeFilas; f++)
		{
			if(mat[f].length != cantidadDeColumnas)
			{
				throw new Exception("Matriz no matematica.");
			}
		}
		
		for(f = 0; f < cantidadDeFilas; f++)
		{
			for(c = 0; c < cantidadDeColumnas; c++)
			{
				if(0 != f && 0 != c && cantidadDeFilas - 1 != f && cantidadDeColumnas - 1 != c)
				{
					//VALOR + ABAJO + ARRIBA + IZQ + DER
					matrizResultado[f][c] = mat[f][c] + mat[f + 1][c] + mat[f - 1][c] + mat[f][c - 1] + mat[f][c + 1];
				}
				
			}
		}
		
		return matrizResultado;
	}
	
	public static void mostrarMatriz(int mat[][])
	{
		int cantidadDeFilas = mat.length;
		int cantidadDeColumnas = mat[0].length;
		int f;
		int c;
		
		for(f = 0; f < cantidadDeFilas; f++)
		{
			for(c = 0; c < cantidadDeColumnas; c++)
			{
				System.out.print("[" + mat[f][c] +"] ");
			}
			System.out.println();
		}
		
	}
}
