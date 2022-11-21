package tech.println.creational.builder;

import java.util.Date;

public class House {


    private int floors;
    private TypeMaterial typeMaterial;
    private String project;
    private Date creationDate;

    private House(Builder builder){
        this.floors = builder.floors;
        this.typeMaterial = builder.typeMaterial;
        this.project = builder.project;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "New house from " + typeMaterial +
                " and " + this.floors + " floors. House was created at " + creationDate;
    }

    public static class Builder {

        private int floors;
        private TypeMaterial typeMaterial;
        private String project;


        public Builder floors(int floors){
            this.floors = floors;
            return this;
        }

        public Builder typeMaterial(TypeMaterial typeMaterial){
            this.typeMaterial = typeMaterial;
            return this;
        }

        public Builder project(String project){
            this.project = project;
            return this;
        }

        public House build () {
            House house = new House(this);
            house.creationDate = new Date();
            validateHouse(house);
            return house;
        }

        private void validateHouse(House house) {
            if(house.typeMaterial.equals(TypeMaterial.STRAW) && house.floors > 1) {
                throw  new IllegalArgumentException("From STRAW house may be only 1 floor");
            }
            if(house.typeMaterial.equals(TypeMaterial.WOOD) && house.floors > 2) {
                throw  new IllegalArgumentException("From WOOD house may be only 2 floor");
            }
            if(house.typeMaterial.equals(TypeMaterial.BRICK) && house.floors > 5) {
                throw  new IllegalArgumentException("From BRICK house may be only 5 floor");
            }
            if(house.typeMaterial.equals(TypeMaterial.CONCRETE) && house.floors > 200) {
                throw  new IllegalArgumentException("From CONCRETE house may be only 200 floor");
            }
        }
    }
}
