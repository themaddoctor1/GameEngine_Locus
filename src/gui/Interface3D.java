/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import gui.shapes.CurvedPolygon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import physics.Coordinate;

/**
 *
 * @author WHS-D4B1W8
 */
public class Interface3D extends Interface {
    private Camera camera;
    
    
    //Pixels per radian
    protected double PPR = 400;
    
    protected Interface3D(String name, Camera c){
        this(name,800,600, c);
    }
    
    protected Interface3D(String name, int width, int height, Camera c){
        super(name,width,height);
        camera = c;
    }
    
    public void paint(Graphics g){
    }
    
    
    public static void initialize(String name, Camera c){
        gui = new Interface3D(name, 800, 600, c);
    }
    
    public static void initialize(String name, int width, int height, Camera c){
        gui = new Interface3D(name, width, height, c);
    }
    
    public static Interface3D getInterface3D(){
        return (Interface3D) gui;
    }
    
    
    
    
    
    public void setPixelsPerRadian(double ppr){ PPR = ppr; }
    
    public void setDegreesPerRadian(double dpr){
        setPixelsPerRadian(dpr*180.0/Math.PI);
    }
    
    public double getPixelsPerDegree(){
        return PPR * Math.PI/180.0;
    }
    
    public double getPixelsPerRadian() { return PPR; }
    
    
}
