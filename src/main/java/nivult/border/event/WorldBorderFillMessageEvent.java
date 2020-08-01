package nivult.border.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WorldBorderFillMessageEvent  extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final String message;
    private final double percentage;


    public WorldBorderFillMessageEvent(String message, double percentage) {
        this.message = message;
        this.percentage = percentage;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getMessage() {
        return message;
    }

    public double getPercentage(){ return percentage;}
}
