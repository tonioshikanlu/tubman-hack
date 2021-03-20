package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

public class DimensionDependency extends DependencyNode {
    public int wrapValue;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        this.type = widgetRun instanceof HorizontalWidgetRun ? DependencyNode.Type.HORIZONTAL_DIMENSION : DependencyNode.Type.VERTICAL_DIMENSION;
    }

    public void resolve(int i2) {
        if (!this.resolved) {
            this.resolved = true;
            this.value = i2;
            for (Dependency next : this.dependencies) {
                next.update(next);
            }
        }
    }
}
