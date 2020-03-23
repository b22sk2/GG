package mn.artifex.entities;

import java.util.List;

public class PersisitentMenu {
    String locale = "default";
    boolean composer_input_disabled = false;
    List <Button> persistentMenu;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean isComposer_input_disabled() {
        return composer_input_disabled;
    }

    public void setComposer_input_disabled(boolean composer_input_disabled) {
        this.composer_input_disabled = composer_input_disabled;
    }

    public List<Button> getPersistentMenu() {
        return persistentMenu;
    }

    public void setPersistentMenu(List<Button> persistentMenu) {
        this.persistentMenu = persistentMenu;
    }

    public PersisitentMenu() {
    }
}
