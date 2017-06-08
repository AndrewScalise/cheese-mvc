package org.launchcode.cheesemvc.models;

/**
 * Created by Mugen on 5/22/2017.
 */
public class Cheese {

    private String cheeseName;
    private String cheeseDescription;

    public Cheese(String cheeseName, String cheeseDescription){
        this.cheeseName = cheeseName;
        this.cheeseDescription = cheeseDescription;
    }

    public String getCheeseName() {
        return cheeseName;
    }

    public void setCheeseName(String cheeseName) {
        this.cheeseName = cheeseName;
    }

    public String getCheeseDescription() {
        return cheeseDescription;
    }

    public void setCheeseDescription(String cheeseDescription) {
        this.cheeseDescription = cheeseDescription;
    }
}
