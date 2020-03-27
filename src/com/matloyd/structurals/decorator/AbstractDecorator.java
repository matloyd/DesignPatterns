package com.matloyd.structurals.decorator;

public abstract class AbstractDecorator extends Component {
    protected Component component;

    public void SetTheComponent(Component c) {
        component = c;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}
