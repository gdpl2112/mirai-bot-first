package io.github.klopin.test0.kp;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author github.kloping
 */
public class Utils {
    /**
     * function f(t) {
     * var a, i, o = Math.abs(parseInt((new Date).getTime() * Math.random() * 1e4)).toString(), n = 0;
     * for (a = 0; a < o.length; a++) n += parseInt(o[a]);
     * return i = function (t) {
     * return function (a, i) {
     * return i - "" + a.length <= 0 ? a : (t[i] || (t[i] = Array(i + 1).join(0))) + a
     * }
     * }([]), n += o.length, n = i(n, 3 - n.toString().length), t.toString() + o + n
     * }
     */


    public static String f(int t) {
        if (ENGINE instanceof Invocable) {
            Invocable in = (Invocable) ENGINE;
            Object o = null;
            try {
                o = in.invokeFunction("getR", t);
            } catch (ScriptException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            return o.toString();
        }
        return null;
    }

    private static final ScriptEngineManager MANAGER = new ScriptEngineManager();
    private static final ScriptEngine ENGINE = MANAGER.getEngineByName("javascript");

    static {
        try {
            ENGINE.eval("function getR(t) {\n" +
                    "        var a, i, o = Math.abs(parseInt((new Date).getTime() * Math.random() * 1e4)).toString(), n = 0;\n" +
                    "        for (a = 0; a < o.length; a++) n += parseInt(o[a]);\n" +
                    "        return i = function (t) {\n" +
                    "            return function (a, i) {\n" +
                    "                return i - \"\" + a.length <= 0 ? a : (t[i] || (t[i] = Array(i + 1).join(0))) + a\n" +
                    "            }\n" +
                    "        }([]), n += o.length, n = i(n, 3 - n.toString().length), t.toString() + o + n\n" +
                    "    }");

        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
