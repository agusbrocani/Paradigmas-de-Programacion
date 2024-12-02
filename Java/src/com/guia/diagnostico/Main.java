package com.guia.diagnostico;

public class Main 
{
	public static void main(String[] args) 
	{
		int mat[][] = 
		{
				{1,1,1},
				{1,1,1},
				{1,1,2}
		};
		
		System.out.println("Ejercicio 1:");
		try
		{
			if(!Ejercicio1.diagonalIgualSumaAnteriores(mat))
			{
				System.out.println("La matriz NO cumple la condicion.");
			}
			else
			{
				System.out.println("La matriz cumple la condicion.");
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("Ejercicio 2:");
		try
		{
			if(!Ejercicio2.productoDeTodoNumeroEnMatrizDaCero(mat))
			{
				System.out.println("La multiplicacion NO da 0.");
			}
			else
			{
				System.out.println("La multiplicacion da 0.");
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("Ejercicio 3:");
		try
		{
			System.out.println("Faltan contemplar casos borde");
			Ejercicio3.mostrarMatriz(Ejercicio3.sumatoriaDeArribaAbajoIzquierdaDerechaDePosicion(mat));
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}
}
