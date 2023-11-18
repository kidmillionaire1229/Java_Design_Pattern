package Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component{
    private List<Component> componentList;
    private String name;

    public Box(String name) {
        componentList = new ArrayList<>();
        this.name = name;
    }

    public void addComponent(Component component){
        componentList.add(component);
    }
    public List<Component> getComponentList() {
        return componentList;
    }

    @Override
    public int getPrice(){
        int totalPrice = componentList.stream()
                .map(Component::getPrice)
                .reduce(0, Integer::sum)
                .intValue();
        return totalPrice;
    }
    @Override
    public String getName() {
        return name;
    }
}
