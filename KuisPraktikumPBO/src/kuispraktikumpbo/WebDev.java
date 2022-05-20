/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispraktikumpbo;

/**
 *
 * @author Agil
 */
public class WebDev extends Identitas implements Hitung{

    public WebDev() {
    }
    
    @Override
    public void hitungNilai() {
        
        float nilai;
        nilai = (float) ((0.4*this.nilaitulis) + (0.35*this.nilaicoding) + (0.25*this.nilaiwawan));
        this.nilai = nilai;
    }

    @Override
    public void editNilai(float tulis,float coding,float wawan) {
        this.nilaitulis = tulis;
        this.nilaicoding = coding;
        this.nilaiwawan = wawan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public float getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setTulis(float tulis) {
        this.nilaitulis = tulis;
    }

    public void setCoding(float coding) {
        this.nilaicoding = coding;
    }

    public void setWawan(float wawan) {
        this.nilaiwawan = wawan;
    }
    
}
