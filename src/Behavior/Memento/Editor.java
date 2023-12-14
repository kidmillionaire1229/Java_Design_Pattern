package Behavior.Memento;

/**
 * Originator
 */
public class Editor {
    private String text;
    private int posX, posY;

    //스냅샷 생성
    public Snapshot create(){
        System.out.println("Create from Editor");
        return new Snapshot();
    }

    //스냅샷 복원
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

    /**
     * Memento
     * 필드, 메서드가 private해도 originator에서 접근 가능함
     */
    final class Snapshot {
        private String text;
        private int posX, posY;

        //Behavior.Memento
        Snapshot(){
            this.text = Editor.this.text;
            this.posX = Editor.this.posX;
            this.posY = Editor.this.posY;
        }
    }
}
