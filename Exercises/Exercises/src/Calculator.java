class Calculator {
    private int value;

    Calculator add(int n){
        this.value += n;
        return this;
    }

    Calculator subtract(int n){
        this.value -= n;
        return this;
    }

    void displayDetails(){
        System.out.println("value: " + this.value);

    }

}
