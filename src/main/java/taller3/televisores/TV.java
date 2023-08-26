package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++ ;
			
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	public Control getControl() {
		return control;
	}
	
	public void canalUp() {
		if(estado == true)
		{
			if (canal < 120 && canal >= 1)
			{
				canal++ ;
			}

		}
	}
	public void canalDown() {
		if(estado == true) {
			if (canal <= 120 && canal > 1)
			{
				canal-- ; 
			}
		}
	}
	
	public void volumenUp() {
		if (estado == true) {
			if (volumen < 7 && volumen >= 0) 
			{
				volumen++ ;
			}
		}
	}
	public void volumenDown() {
		if (estado == true) {
			if (volumen <= 7 && volumen > 0) 
			{
				volumen-- ;
			}
		}
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	static public void setNumTV(int numTv) {
		numTV = numTv;
	}
	static public int getNumTV() {
		return numTV;
	}
}
