package Memento;

public class Editor {
    private String text;
    private int posX, posY;

    public Snapshot create(){
        System.out.println("Create from Editor");
        return new Snapshot();
    }

    public void restore(Snapshot snapshot){
        System.out.println("Restore from Editor");
        this.text = snapshot.text;
        this.posX = snapshot.posX;
        this.posY = snapshot.posY;
    }

    public String getText() {
        return text;
    }

    public Editor setText(String text) {
        this.text = text;
        return this;
    }

    public void setPos(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }

    final class Snapshot {
        private String text;
        private int posX, posY;

        //Memento
        Snapshot(){
            this.text = Editor.this.text;
            this.posX = Editor.this.posX;
            this.posY = Editor.this.posY;
        }
    }
}
