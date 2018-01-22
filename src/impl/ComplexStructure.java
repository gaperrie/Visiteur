package impl;

import contract.Element;
import contract.Visitor;

import java.util.Iterator;

public class ComplexStructure implements Iterable<Element>, Element {
    @Override
    public Iterator<Element> iterator() {
        return null;
    }

    @Override
    public void accept(Visitor v) {

    }
}
