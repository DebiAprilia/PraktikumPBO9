/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;
/**
 *
 * @author user
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    //Metode kelas abstrak
    abstract void berjalan();
    
    //Metode dengan implementasi
    void info(){
        System.out.println("Ini adalah kendaraan.");
    }
}
