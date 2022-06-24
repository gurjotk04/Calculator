import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class SE {
    public Object calculation(String s) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("Javascript");
        return engine.eval(s).toString();
    }
}
