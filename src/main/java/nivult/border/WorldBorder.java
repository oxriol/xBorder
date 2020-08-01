package nivult.border;

import nivult.border.cmd.WBCommand;
import nivult.border.data.BorderData;
import nivult.border.data.Config;
import nivult.border.listener.WBListener;
import org.bukkit.plugin.java.JavaPlugin;


public class WorldBorder extends JavaPlugin
{
	private static WorldBorder plugin;

	public WorldBorder() {
		plugin = this;
	}



	@Override
	public void onEnable()
	{
		// Load (or create new) config file
		Config.load(this, false);
		getCommand("wborder").setExecutor(new WBCommand(this));
		// keep an eye on teleports, to redirect them to a spot inside the border if necessary
		getServer().getPluginManager().registerEvents(new WBListener(), this);
	}

	@Override
	public void onDisable()
	{
		Config.StopBorderTimer();
		Config.StoreFillTask();
		Config.StopFillTask();
	}


	public static WorldBorder get() { return plugin; }

	public BorderData GetWorldBorder(String worldName)
	{
		return Config.Border(worldName);
	}
}
