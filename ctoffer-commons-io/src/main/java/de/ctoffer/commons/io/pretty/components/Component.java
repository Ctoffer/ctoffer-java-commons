package de.ctoffer.commons.io.pretty.components;

import de.ctoffer.commons.io.pretty.Style;
import de.ctoffer.commons.io.pretty.dto.BorderVisibility;
import de.ctoffer.commons.io.pretty.dto.Padding;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(fluent = true)
@Getter
@Setter
public abstract class Component {

    protected Style style;
    protected Padding padding;
    protected BorderVisibility visibility;

    protected Component() {
        this.style = Style.singleLineStyle();
        this.padding = Padding.zero();
        this.visibility = BorderVisibility.allVisible();
    }

    public boolean topVisibility() {
        return this.visibility.top();
    }

    public boolean leftVisibility() {
        return this.visibility.left();
    }

    public boolean rightVisibility() {
        return this.visibility.right();
    }

    public boolean botVisibility() {
        return this.visibility.bot();
    }

    public void topVisibility(boolean topVisibility) {
        this.visibility.top(topVisibility);
    }

    public int requestedWidth() {
        return this.padding.left() + padding.right()
                + toInt(visibility.left()) + toInt(visibility.right())
                + requestedContentWidth();
    }

    private int toInt(final boolean b) {
        return b ? 1 : 0;
    }

    protected abstract int requestedContentWidth();

    public abstract List<String> render(int maxWidth);

}
