/**
 * Settings class that stores the configuration options for rendering
 *
 * @author Dewan Mukto
 * @version 2024-10-07 1.0
 */
public class Settings {

    // Define the possible modes
    public enum Mode {
        FAST,
        SCALED
    }

    private Mode currentMode;
    private int maxIterations = 100;

    /**
     * Constructor initializes the default mode as Fast Mode
     */
    public Settings() {
        this.currentMode = Mode.FAST;
    }

    /**
     * Sets the mode to either Fast or Scaled
     */
    public void setMode(Mode mode) {
        this.currentMode = mode;
    }

    /**
     * Returns the current mode
     */
    public Mode getMode() {
        return currentMode;
    }

    public int getMaxIterations(){
            return maxIterations;
        }
        
    public void setMaxIterations(int maxIterations){
        this.maxIterations = Math.max(100, maxIterations);
    }
}
