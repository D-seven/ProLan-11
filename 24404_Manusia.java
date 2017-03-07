package UTS;

 public class Manusia {
	private String nama;
	private int posisix=0;
	private int posisiy=0;
	
	Manusia(String nama){
		this.nama=nama;
		posisix=0;
		posisiy=0;
	}
	public Manusia(String nama, int x, int y){
		this.nama=nama;
		this.posisix=x;
		this.posisiy=y;
	}
	public void setPosisiX(int x){
		this.posisix=x;
	}
	public void setPosisiY(int y){
		this.posisiy=y;
	}
	
	public int getPosisiX(){
		return this.posisix;
	}
	public int getPosisiY(){
		return this.posisiy;
	}
	public String getNama(){
		return this.nama;
	}
	
	public String posisiSekarang(){
	    return this.posisix+","+this.posisiy;
	}

}
