/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.training.animal;

/**
 *
 * @author mbk_i
 */
class Dolphin implements AquaticAnimal {

     @Override
     public void eat(String food ) {
          System.out.println("Dolphin Eat " + food);
     }

}
