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
public class AnimalNursery {

     private Animal animal;

     public void accept(Animal animal) {
          this.animal = animal;

     }

     public void takeCareAll() {
          animal.eat("Food");
     }
}
