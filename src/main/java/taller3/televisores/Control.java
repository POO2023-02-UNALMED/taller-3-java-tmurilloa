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
		tv.set
	}
}
