package androidx.constraintlayout.solver.widgets.analyzer;

import b.e.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements Dependency {
    public boolean delegateToWidgetRun = false;
    public List<Dependency> dependencies = new ArrayList();
    public int margin;
    public DimensionDependency marginDependency = null;
    public int marginFactor = 1;
    public boolean readyToSolve = false;
    public boolean resolved = false;
    public WidgetRun run;
    public List<DependencyNode> targets = new ArrayList();
    public Type type = Type.UNKNOWN;
    public Dependency updateDelegate = null;
    public int value;

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.run = widgetRun;
    }

    public void addDependency(Dependency dependency) {
        this.dependencies.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public void clear() {
        this.targets.clear();
        this.dependencies.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String str;
        StringBuilder sb;
        String debugName = this.run.widget.getDebugName();
        Type type2 = this.type;
        if (type2 == Type.LEFT || type2 == Type.RIGHT) {
            sb = a.y(debugName);
            str = "_HORIZONTAL";
        } else {
            sb = a.y(debugName);
            str = "_VERTICAL";
        }
        sb.append(str);
        StringBuilder B = a.B(sb.toString(), ":");
        B.append(this.type.name());
        return B.toString();
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.run.widget.getDebugName());
        sb.append(":");
        sb.append(this.type);
        sb.append("(");
        sb.append(this.resolved ? Integer.valueOf(this.value) : "unresolved");
        sb.append(") <t=");
        sb.append(this.targets.size());
        sb.append(":d=");
        sb.append(this.dependencies.size());
        sb.append(">");
        return sb.toString();
    }

    public void update(Dependency dependency) {
        for (DependencyNode dependencyNode : this.targets) {
            if (!dependencyNode.resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.run.update(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i2 = 0;
        for (DependencyNode next : this.targets) {
            if (!(next instanceof DimensionDependency)) {
                i2++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i2 == 1 && dependencyNode2.resolved) {
            DimensionDependency dimensionDependency = this.marginDependency;
            if (dimensionDependency != null) {
                if (dimensionDependency.resolved) {
                    this.margin = this.marginFactor * dimensionDependency.value;
                } else {
                    return;
                }
            }
            resolve(dependencyNode2.value + this.margin);
        }
        Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }
}
