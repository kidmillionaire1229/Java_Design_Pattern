package Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component{
    private List<Component> componentList;
    private String name;

    public Box(String name) {
        componentList = new ArrayList<>();
        this.name = name;
        System.out.printf("name : %s , Class : %s\n",this.name, this.getClass());
    }

    public void addComponent(Component component){
        componentList.add(component);
    }
    public List<Component> getComponentList() {
        return componentList;
    }

    //Box는 복합체이므로, CompositeList에 있는 모든 Composite 구현체의 getPrice를 호출한다.
    //Box 역시 Component의 구현체이므로, 재귀적으로 getPrice를 호출할 수 있다.
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
