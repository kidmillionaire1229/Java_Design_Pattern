package Memento;

import Memento.Editor.Snapshot;
import java.util.Stack;

public class Command {
    private Stack<Editor.Snapshot> stack;

    public Command() {
        this.stack = new Stack<>();
    }

    public void makeBackUp(Editor origin){
        Snapshot snapshot = origin.create();
        stack.push(snapshot);
    }

    public Editor undo(Editor editor){
        Snapshot memento = stack.pop();
        editor.restore(memento);
        return editor;
    }
}
