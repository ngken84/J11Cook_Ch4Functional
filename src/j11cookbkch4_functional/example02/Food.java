/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11cookbkch4_functional.example02;

/**
 *
 * @author ngke
 */
public class Food {
    public static String getFavorite() { return "Donut!"; }
    public static String getFavorite(int num) {
        return num > 1 ? String.valueOf(num) + " donuts!" : "Donut!";
    }
}
