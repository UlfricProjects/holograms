package com.ulfric.holograms;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Hologram {

	List<String> getLines();

	void setLines(List<String> lines);

	List<Location> getLocations();

	void setLocations(List<Location> locations);

	boolean isVisibleTo(Player player);

	void showTo(Player player);

	void hideFrom(Player player);

	void delete();

}