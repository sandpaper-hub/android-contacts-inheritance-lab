package ru.yandex.practicum.contacts.presentation.base;

public abstract class ContactsOrderTypeUi {

    protected final String type;
    protected final boolean isSelected;

    public ContactsOrderTypeUi(String type, boolean isSelected) {
        this.type = type;
        this.isSelected = isSelected;
    }

    public String getType(){
        return type;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public abstract String createLogMessage();
}
