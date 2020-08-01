package nivult.border.event;

import nivult.border.data.BorderData;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WorldFillerTaskCompleteEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final String worldName;
    private final BorderData borderData;

    public WorldFillerTaskCompleteEvent(String worldName, BorderData borderData) {
        this.worldName = worldName;
        this.borderData = borderData;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getWorldName() {
        return worldName;
    }

    public BorderData getBorderData() {
        return borderData;
    }
}
