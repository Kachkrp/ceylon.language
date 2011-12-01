package ceylon.language;

import com.redhat.ceylon.compiler.metadata.java.Name;
import com.redhat.ceylon.compiler.metadata.java.TypeParameter;
import com.redhat.ceylon.compiler.metadata.java.TypeParameters;

@TypeParameters({@TypeParameter(value="Value")})
public class ThreadLocal<Value> {
    final java.lang.ThreadLocal<Value> value;
    
    public ThreadLocal(@Name("initialValue") final Value initialValue) {
        this.value = new java.lang.ThreadLocal<Value>() {
            @Override public Value initialValue() { 
                return initialValue; 
            }
        };
    }
    
    public void setValue(Value value) {
        this.value.set(value);
    }
    public Value getValue() {
        return this.value.get();
    }
    
    public void clear() {
        this.value.remove();
    }
    
}
