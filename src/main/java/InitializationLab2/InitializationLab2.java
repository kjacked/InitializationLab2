package InitializationLab2;

import java.util.Arrays;


class ThingContainer {


    private ColorfulThing[] colorfulThings;

    public ThingContainer(int n) {
        colorfulThings = new ColorfulThing[n];
    }

    public void printThings() {
        System.out.println(Arrays.toString(this.getColorfulThings()));
    }



    public void add(ColorfulThing color){
        for(int i=0; i<colorfulThings.length;i++){
            if(colorfulThings[i]==null){
                colorfulThings[i]= color;
                return;
            }
        }
        System.out.println("ThingContainer is full, sorry.");

    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;

    }

    public ColorfulThing Pop(){
        for(int x = colorfulThings.length-1; x >= 0; x--){
            if(colorfulThings[x] != null){
                ColorfulThing y = colorfulThings[x];
                colorfulThings[x] = null;
                return y;
            }
        }

        return null;

    }
    public ColorfulThing removeAll(ColorfulThing aura){
        for (int x = colorfulThings.length - 1; x >= 0; x--) {
            if (colorfulThings[x] == aura) {

                ColorfulThing y = colorfulThings[x];
                colorfulThings[x] = null;
                return y;

            }

        }
        return null;
    }
    public ColorfulThing remove(ColorfulThing.Color deleteC) {
        for (int x= 0; x <= colorfulThings.length - 1; x++) {
            if (colorfulThings[x].getColor() == deleteC) {
                ColorfulThing y = colorfulThings[x];
                colorfulThings[x] = null;
                return y;

            }
        }
        return null;


    }

}