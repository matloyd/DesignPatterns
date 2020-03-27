package com.matloyd.behavioral.command.example2;

interface ICommand {
    void Do();
}

class MyUndoCommand implements ICommand {
    private Receiver receiver;

    MyUndoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void Do() {
        receiver.performUndo();
    }
}

class MyRedoCommand implements ICommand {
    private Receiver receiver;

    MyRedoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void Do() {
        receiver.performRedo();
    }
}

class Receiver {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }

    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}

class Invoke {
    ICommand cmd;

    public void ExecuteCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.Do();
    }
}

class CommandPatternEx {
    public static void main(String[] args) {

        Receiver intendedreceiver = new Receiver();
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}
