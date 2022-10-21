package HW2.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();



    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
    public abstract void createWebsite();

    public Website(){
        this.createWebsite();
    }
}
