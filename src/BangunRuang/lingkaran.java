/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;


public class lingkaran implements menghitungBidang {
    
    private double r;
    
    public lingkaran(double r){
    this.r = r;
    }
    
    public void setR(double r){
		this.r = r; //memberikan nilai variabel panjang dengan nilai yang ada di dalam parameter
	}
	
	public double getR(){
		return r; //memberikan nilai kembalian
	}
        
        @Override
        public double keliling(){
            return 2*Math.PI*r;
        }
        
        @Override
        public double luas(){
            return Math.PI*r*r;
        }


}
   
