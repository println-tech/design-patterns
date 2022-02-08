package tech.println.structural.composite;

public class RadioButton extends Component{

    public RadioButton(String description) {
        super(description);
    }

    @Override
    void draw() {
        System.out.println("Draw radio button " + description);
    }
}
