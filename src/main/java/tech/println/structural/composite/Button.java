package tech.println.structural.composite;

public class Button extends Component {

    public Button(String description) {
        super(description);
    }

    @Override
    void draw() {
        System.out.println("Draw button " + description);
    }
}
