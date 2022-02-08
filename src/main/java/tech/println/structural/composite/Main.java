package tech.println.structural.composite;


public class Main {

    public static void main(String[] args) {

        Component mainFrame = new Frame("Main");
        Component leftFrame = new Frame("Left frame");
        Component rightFrame = new Frame("Right frame");
        mainFrame.add(leftFrame);
        mainFrame.add(rightFrame);

        Component radio1 = new RadioButton("First radio");
        Component radio2 = new RadioButton("Second radio");
        leftFrame.add(radio1);
        leftFrame.add(radio2);

        Component buttonYes = new RadioButton("Button yes");
        Component buttonNo = new RadioButton("Button no");
        rightFrame.add(buttonNo);
        rightFrame.add(buttonYes);

        mainFrame.draw();
    }
}
