package sda._200523.Lista1kierunkowa;

public class StringListElement {
    private String value;
    private StringListElement nextElement;

    public StringListElement(){

    }

    public StringListElement(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringListElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(StringListElement nextElement) {
        this.nextElement = nextElement;
    }
}
