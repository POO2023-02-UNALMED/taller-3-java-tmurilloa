package taller3.televisores;

public class Control {
	 TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
		
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}
	public void canalUp() {
		if(tv.estado == true)
		{
			if (tv.canal < 120)
			{
				tv.canal++ ;
			}

		}
	}
	public void canalDown() {
		if(tv.estado == true) {
			if (tv.canal > 1)
			{
				tv.canal-- ; 
			}
		}
	}
	
	public void volumenUp() {
		if (tv.estado) {
			if (tv.volumen < 7) 
			{
				tv.volumen++ ;
			}
		}
	}
	public void volumenDown() {
		if (tv.estado) {
			if (tv.volumen > 0) 
			{
				tv.volumen-- ;
			}
		}
	}
	public void setCanal(int canal) {
		if (tv.estado && canal  >= 1 && canal <= 120) {
			tv.setCanal(canal);
		}
	}
	public void setVolumen(int volumen) {
		if (tv.estado && volumen >= 0 && volumen <= 7) {
		tv.setVolumen(volumen);
		}
	}
	
}
