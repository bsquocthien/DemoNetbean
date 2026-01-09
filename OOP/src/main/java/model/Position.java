/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class Position {

    String position_ID;
    String position_Name;

    public Position(String position_ID, String position_Name) {
        this.position_ID = position_ID;
        this.position_Name = position_Name;
    }

    public Position() {
    }

    public String getPosition_ID() {
        return position_ID;
    }

    public void setPosition_ID(String position_ID) {
        this.position_ID = position_ID;
    }

    public String getPosition_Name() {
        return position_Name;
    }

    public void setPosition_Name(String position_Name) {
        this.position_Name = position_Name;
    }

    public String getPositionInformation() {
        return this.position_ID + " - " + this.position_Name;
    }

}
