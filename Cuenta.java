package poo;

public class Cuenta {
	
	private String nombre;
	private String numCuenta;
	private double interes;
	private double saldo;
	
	public Cuenta(String nombre,String numCuenta,double interes,double saldo)
	{
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		ingreso(saldo);
		this.interes = interes;
	}
	////////////////////////////
	public Cuenta()
	{
		
	}
	////////////////////////////
	public Cuenta(Cuenta copia)
	{
		nombre = copia.nombre;
		numCuenta = copia.numCuenta;
		ingreso(saldo);
		interes = copia.interes;
	}
	///////////////////////////
	public String getNombre()
	{
		return nombre;
	}
	//////////////////////////
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	//////////////////////////
	public String getNumCuenta()
	{
		return numCuenta;
	}
	//////////////////////////
	public void setNumCuenta(String numCuenta)
	{
		this.numCuenta = numCuenta;
	}
	/////////////////////////
	public double getInteres()
	{
		return interes;
	}
	/////////////////////////
	public void setInteres(double interes)
	{
		this.interes = interes;
	}
	//////////////////////////////
	public double getSaldo()
	{
		return saldo;
	}
	//////////////////////////////
	public void ingreso(double cantidad)
	{
		if (cantidad <= 0)
				System.err.println("La cantidad a ingresar no puede ser menor o igual a 0");
		else
			saldo = saldo + cantidad;
	}
	//////////////////////////////
	public void reintegro(double cantidad)
	{
		if(cantidad > saldo)
			System.out.println("El reintegro ha superado al saldo de la cuenta.");
		else
		{
			if(cantidad > 0)
				saldo = saldo - cantidad;
			else
				System.err.println("El reintegro no puede ser superior al saldo.");		
		}
	}
	////////////////////////////////////////
	public void mostrar()
	{
		System.out.println("El titular es: " + nombre);
		System.out.println("El numero de cuenta es: " + numCuenta);
		System.out.println("El tipo de interes es: " + interes);
		System.out.println("El saldo de la cuenta es: " + saldo);
	}
}
