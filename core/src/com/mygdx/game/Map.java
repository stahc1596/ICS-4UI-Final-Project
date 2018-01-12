/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game;

import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 *
 * @author slatz8075
 */
public class Map {

    //create a 2D array of screens 
    private MapScreen[][] screens;
    //create variable to store the width and height of the screen when dislayed

    //initilizer for the map
    public void map(int width, int height) {
        //create the map[][] to the desired dimensions
        screens = new MapScreen[width][height];
    }

    //setter for the screen
    public void setScreen(int row, int col, MapScreen Screen) {
        //set the screen at the desired part in the map array
        screens[row][col] = Screen;
    }

    //getter for the screen - returning the ascreen at this desired position
    public MapScreen getScreen(int row, int col) {
        //return the screen
        return screens[row][col];
    }

    //for the render method pass in the camera, and the screen we are currently looking at
    public void render(OrthographicCamera camera, int currentScreenX, int currentScreenY) {
        //get the height and width of the screen
    }
    
    
}
