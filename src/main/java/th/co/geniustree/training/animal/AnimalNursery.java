/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.training.animal;

import java.util.ArrayList;

/**
 *
 * @author mbk_i
 */
public class AnimalNursery {
     
     private Animal animal;
     private ArrayList<Animal> animals = new ArrayList<>(); 
     
     public void accept(Animal animal) {
        //  this.animal = animal;
          animals.add(animal);
     }
     
     public void takeCareAll() {
        //  animal.eat("Food");
          for (Animal animal : animals) {    
           animal.eat("Food");
              
          }
          
     }
}
