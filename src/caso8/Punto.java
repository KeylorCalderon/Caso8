/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.awt.Color;
/**
 *
 * @author 1001001222
 */
public class Punto {
    int x;
    int y;
    Color color;
    
    public Punto(int pX, int pY){
        x=pX;
        y=pY;
    }
    
    public Punto(int pX, int pY, Color pColor){
        x=pX;
        y=pY;
        color=pColor;
    }
}
