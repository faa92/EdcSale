package elements;

public interface IDropDown extends ILabel {

    void expand();

    void selectValue(String value);

    boolean isExpanded();

}
