/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xrpl2;

/**
 *
 * @author MOKLET1
 */
public class settergetter_siswa {
  
    //akses modifier
    private String nisn;
    private String nama;
    protected String alamat;
    protected String ttl;
    protected String telp;
    
    //setter nisn
    public void setNISN(String nisn){
        this.nisn = nisn;
    }
    //getter nisn
    public String getNISN(){
        return nisn; //pengembalian nilai nisn
    }
    //setter nama
    public void setNama(String nama){
        this.nama = nama;
    }
    //getter nama
    public String getNama(){
        return nama; //pengembalian nilai nama
    }
    //setter alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    //getter alamat
    public String getAlamat(){
        return alamat; //pengembalian nilai alamat
    }
    //setter tempat tanggal lahir
    public void setTTL(String ttl){
        this.ttl = ttl;
    }
    //getter tempat tanggal lahir
    public String getTTL(){
        return ttl; //pengembalian nilai ttl
    }
    //setter nomor telepon
    public void setTelp(String telp){
        this.telp = telp;
    }
    //getter nomor telepon
    public String getTelp(){
        return telp; //pengembalian nilai telp
    }
}

