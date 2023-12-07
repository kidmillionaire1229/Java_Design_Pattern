package Behavior.Memento;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();
        Command care = new Command();

        //1st memento
        editor.setText("design pattern 1 - Behavior.Memento");
        editor.setPos(10, 24);
        System.out.println(editor);
        //stack에 1st memento push
        care.makeBackUp(editor);

        //2nd memento
        editor.setText("design pattern 2 - Behavior.Memento");
        editor.setPos(22,24);
        System.out.println(editor);
        care.makeBackUp(editor);

        //3rd memento
        editor.setText("design pattern 3 - Behavior.Memento");
        editor.setPos(44,24);
        System.out.println(editor);
        care.makeBackUp(editor);

        System.out.println("\n===복구===\n");

        //3rd memento pop
        Editor obj = care.undo(editor);
        System.out.println(obj);

        //2nd memento pop
        obj = care.undo(editor);
        System.out.println(obj);

        //1st memento pop
        obj = care.undo(editor);
        System.out.println(obj);
    }
}
