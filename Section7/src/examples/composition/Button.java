package examples.composition;

public class Button {
    String name;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pressButton(){
        System.out.println(name + " Button pressed");
    }
}
