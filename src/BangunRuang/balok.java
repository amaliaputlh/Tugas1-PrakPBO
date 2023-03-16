package BangunRuang;

public class balok extends persegipanjang implements menghitungRuang {
    
    private double t;
    
    public balok(double t, double p, double l){
    super(p, l);
    this.t= t;
    }
    
    public double getTinggi(){
        return t;
    }
    
    public void setTinggi(double t){
        this.t = t;
    }
    
   @Override
    public double luas_permukaan(){
        return 2*(luas()+super.getPanjang()*t)+(super.getLebar()*t);
    }
    
    
    @Override
    public double volume(){
        return luas()*t;
    }
}
