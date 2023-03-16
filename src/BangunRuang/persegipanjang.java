package BangunRuang;


public class persegipanjang implements menghitungBidang {
    private double p, l;
    
        public persegipanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getPanjang() {
        return p;
    }

    public void setPanjang(double p) {
        this.p = p;
    }

    public double getLebar() {
        return l;
    }

    public void setLebar(double l) {
        this.l = l;
    }
    
    //Override
    public double keliling() {
        return 2*( p + l );
    }

    //Override
    public double luas() {
        return p * l;
    }
}
