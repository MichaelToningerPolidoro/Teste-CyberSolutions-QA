package br.com.test.core.interactions;

import br.com.test.core.interactions.actions.Attribute;
import br.com.test.core.interactions.actions.Text;
import br.com.test.core.interactions.actions.Wait;
import lombok.Getter;

/**
 * TODO: Javadocs
 * */
@Getter
public final class Interactions {

    private final Wait wait = new Wait();
    private final Text text = new Text();
    private final Attribute attribute = new Attribute();
}
