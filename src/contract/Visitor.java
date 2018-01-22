package contract;

import impl.ElementA;
import impl.ElementB;

public interface Visitor {
    void accept(ElementA eA);
    void accept(ElementB eB);
}
