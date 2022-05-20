/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispraktikumpbo;

import java.util.Scanner;
/**
 *
 * @author Agil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int form,pil;
        boolean ulang = true;
        
        System.out.println("FORM PENDAFTARAN PT UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        form = input.nextInt();
        
        System.out.println("");
        
        switch(form){
                   
        
            case 1 : {
            
                AndroidDev andro = new AndroidDev();
                
                Scanner inputnim = new Scanner(System.in);
                Scanner inputnama = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                System.out.print("");
                System.out.print("Input NIM : ");
                andro.setNim(inputnim.nextLine());
                System.out.print("Input Nama : ");
                andro.setNama(inputnama.nextLine());
                
                editAndro(andro,input);
                
                while(ulang == true){
                 
                     System.out.println("Menu :");
                     System.out.println("1. Edit");
                     System.out.println("2. Tampil");
                     System.out.println("3. Exit");
                     System.out.print("Pilih : ");
                     pil = input.nextInt();
                     
                     switch(pil){
                         case 1 : {
                            System.out.println("\nFORM EDIT");
                            editAndro(andro,input);
                            break;
                         }case 2 : {
                            hasilAndro(andro);
                            break;
                         }case 3 : {
                            ulang = false;
                            break;
                         }                         
                     }
                 }break;
            }
     
            case 2 : {
            
                WebDev web = new WebDev();
                
                Scanner inputnim = new Scanner(System.in);
                Scanner inputnama = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                System.out.print("");
                System.out.print("Input NIM : ");
                web.setNim(inputnim.nextLine());
                System.out.print("Input Nama : ");
                web.setNama(inputnama.nextLine());
                
                editWeb(web,input);
                
                while(ulang == true){
                 
                     System.out.println("Menu :");
                     System.out.println("1. Edit");
                     System.out.println("2. Tampil");
                     System.out.println("3. Exit");
                     System.out.print("Pilih : ");
                     pil = input.nextInt();
                     
                     switch(pil){
                     
                         case 1 : {
                            System.out.println("\nFORM EDIT");
                            editWeb(web,input);
                            break;
                         }case 2 : {
                            hasilWeb(web);
                            break;
                         }case 3 : {
                            ulang = false;
                            break;
                         }
                     }
                 }break;
            }
        }    
    }
    
    public static void editAndro(AndroidDev andro,Scanner input){

         System.out.print("Input Nilai Tes Tulis : ");
         andro.setTulis(input.nextFloat());
         System.out.print("Input Nilai Tes Coding : ");
         andro.setCoding(input.nextFloat());
         System.out.print("Input Nilai Tes Wawancara : ");
         andro.setWawan(input.nextFloat());

    }
    
    public static void hasilAndro(AndroidDev andro){
        
        andro.hitungNilai();
   
        System.out.println("Nilai Akhir : " + andro.getNilai());
        if(andro.getNilai()>= 85){
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat kepada " + andro.getNama() + " telah diterima sebagai Android");
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + andro.getNama() + " telah ditolak sebagai Android");
        } 
    
    }
    
    public static void editWeb(WebDev web,Scanner input){
        
         
         System.out.print("Input Nilai Tes Tulis : ");
         web.setTulis(input.nextFloat());
         System.out.print("Input Nilai Tes Coding : ");
         web.setCoding(input.nextFloat());
         System.out.print("Input Nilai Tes Wawancara : ");
         web.setWawan(input.nextFloat());

    }
    
    public static void hasilWeb(WebDev web){
        
        web.hitungNilai();
        
        System.out.println("Nilai Akhir : " + web.getNilai());
        if(web.getNilai()>= 85){
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat kepada " + web.getNama() + " telah diterima sebagai Web");
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + web.getNama() + " telah ditolak sebagai Web");
        } 
    }  
}
