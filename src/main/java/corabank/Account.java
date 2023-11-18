package corabank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private String cpf;
    private Double balance;
    private boolean active;


    //CONTRUCTOR


    public Account() {
    }

    public Account(String name, String cpf) {

        //this.id = setId();
        //this.id =  Math.random();
        this.name = name;
        this.cpf = cpf;
        this.balance = 10.00;
        this.active = true;

    }

    //GETTERS AND SETTERS
//    public Inte getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean getActive() {
        return active;
    }

//    public Account setId() {
//
//        double generatedId = Math.random();
//        this.id = generatedId;
//
//        return this;
//    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public Account setBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    public Account setActive(boolean active) {
        this.active = active;
        return this;
    }


    //SOBRECARGA


    @Override
    public String toString() {
         return this.name + this.cpf + this.balance;

        //return super.toString();

    }
}
