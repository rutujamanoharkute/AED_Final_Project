/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author Harshada
 */
public abstract class Role {
      
        public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),
        Doctor("Doctor"),
        Trainer("Trainer"),
        PersonalCoach("PersonalCoach"),
        Nutritionist("Nutritionist"),
        Physiotherapist("Physiotherapist"),
        DeliveryMan("DeliveryMan"),
        Pharmacist("Store Manager");
               
      private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
