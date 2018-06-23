/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author valdecir
 */
public class FoodsHealth {
    private float Level_protein;
    private float Level_carbohydrates;
    private float Level_trans_fat;
    private String typeFood;
    private int dish;
    
    // This constructor is not necessary anymore 
    // It was used just do my own list without DB....  
    public FoodsHealth( String typeFood, float Level_protein, float Level_carbohydrates, float Level_trans_fat) {
        this.Level_protein = Level_protein;
        this.Level_carbohydrates = Level_carbohydrates;
        this.Level_trans_fat = Level_trans_fat;
        this.typeFood = typeFood;
    }
    


    public FoodsHealth() {
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }
    
    public float getLevel_protein() {
        return Level_protein;
    }

    public void setLevel_protein(float Level_protein) {
        this.Level_protein = Level_protein;
    }

    public float getLevel_carbohydrates() {
        return Level_carbohydrates;
    }

    public void setLevel_carbohydrates(float Level_carbohydrates) {
        this.Level_carbohydrates = Level_carbohydrates;
    }

    public float getLevel_trans_fat() {
        return Level_trans_fat;
    }

    public void setLevel_trans_fat(float Level_trans_fat) {
        this.Level_trans_fat = Level_trans_fat;
    }
    public int getDish() {
        return dish;
    }

    public void setDish(int dish) {
        this.dish = dish;
    }
  

}
