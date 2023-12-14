package Behavior.Memento;

import Behavior.Memento.Editor.Snapshot;
import java.util.Stack;

/**
 * CareTaker
 */
public class Command {

    //History : Memento들을 저장하는 Stack
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
