package BangunRuang;


public class tabung extends lingkaran implements menghitungRuang {
    private double t;
    
        public tabung(double t, double r) {
        super(r);
        this.t = t;
        }
    
    public void setTinggi(double t)
	{
		this.t = t; //memberikan nilai variabel tinggi dengan nilai yang ada di dalam parameter
	}
	
	public double getTinggi()
	{
		return t; //memberikan nilai kembalian
	}
        
        
   

    @Override
    public double volume() {
        return luas()*t;
    }

    @Override
    public double luas_permukaan() {
        return ((keliling()*t)+2*luas()); 
    }
        
}
