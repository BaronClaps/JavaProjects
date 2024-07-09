package Baron_Engine.test;

import Baron_Engine.core.EngineManager;
import Baron_Engine.core.WindowManager;
import Baron_Engine.core.utils.Consts;

public class Launcher {
    private static WindowManager window;
    private static EngineManager engine;

    public static void main(String[] args) {

        window = new WindowManager(Consts.TITLE, 1600, 900, false);
        engine = new EngineManager();

        try {
            engine.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow() {
        return window;
    }
}
