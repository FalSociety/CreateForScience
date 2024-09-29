package net.falsociety.forscience;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateForScience implements ModInitializer {
	public static final String MOD_ID = "create_for_science";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Now we're thinking with Science.");
	}
}