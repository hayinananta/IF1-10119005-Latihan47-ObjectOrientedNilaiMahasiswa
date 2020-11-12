/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan47.objectorientednilaimahasiswa;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan nilai mahasiswa berbasis objek
 */
public class NilaiMahasiswa {
    private double uts, uas, quiz, nilaiAkhir;
    
    public double getNilaiUts() {
        return this.uts;
    }
    
    public void setNilaiUts(double uts) {
        this.uts = uts;
    }
    
    public double getNilaiUas() {
        return this.uas;
    }
    
    public void setNilaiUas(double uas) {
        this.uas = uas;
    }
    
    public double getNilaiQuiz() {
        return this.quiz;
    }
    
    public void setNilaiQuiz(double quiz) {
        this.quiz = quiz;
    }
    
    public double nilaiAkhir(double quiz, double uts, double uas) {
        return (0.20 * quiz) + (0.30 * uts) + (0.50 * uas);
    }
    
    public char index(double nilaiAkhir) {
        char index;
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            index = 'A';
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
        } else {
            index = 'E';
        }
        return index;
    }
    
    public String keterangan(String index) {
        String keterangan;
        
            switch (index) {
            case "A" : return "Sangat Baik";
            case "B" : return "Baik";
            case "C" : return "Cukup";
            case "D" : return "Kurang";
            default : return "Sangat Kurang";
        }   
    }
}
