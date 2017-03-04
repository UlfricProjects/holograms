package com.ulfric.holograms;

import java.util.List;

import org.bukkit.entity.Player;

public interface Hologram {

	List<String> getLines();

	void setLines(List<String> lines);

	boolean isVisibleTo(Player player);

	void showTo(Player player);

	void hideFrom(Player player);

}