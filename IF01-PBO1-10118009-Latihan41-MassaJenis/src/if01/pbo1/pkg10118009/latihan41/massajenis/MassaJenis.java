/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan41.massajenis;

/**
 *
 * @author LENOVO
 */
public class MassaJenis {
  private int sisi;
  private int massa;
    private int parMassa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    
    public int hitungVolume(int parSisi){
      return (int) Math.pow(parSisi, 3);
        
    }
    public int hitungMassaJenis(int parMassa, int volume){
      return parMassa / volume;
        
    }
  
}
