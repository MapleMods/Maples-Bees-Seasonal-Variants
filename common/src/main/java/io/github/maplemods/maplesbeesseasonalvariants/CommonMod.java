package io.github.maplemods.maplesbeesseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesbeesseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "christmas", "holiday", 12, 1, 12, 26);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", "*", "flannel_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", "*baby", "flannel_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", "entity/bee/bee_angry", "flannel_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", "entity/bee/bee_angry_nectar", "flannel_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "flannel_bee", "entity/bee/bee_nectar", "flannel_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", "*", "pumpkin_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", "*baby", "pumpkin_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", "entity/bee/bee_angry", "pumpkin_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", "entity/bee/bee_angry_nectar", "pumpkin_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "autumn", "pumpkin_bee", "entity/bee/bee_nectar", "pumpkin_bee_nectar");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", "*", "candycane_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", "*baby", "candycane_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", "entity/bee/bee_angry", "candycane_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", "entity/bee/bee_angry_nectar", "candycane_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "candycane_bee", "entity/bee/bee_nectar", "candycane_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", "*", "gingerbread_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", "*baby", "gingerbread_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", "entity/bee/bee_angry", "gingerbread_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", "entity/bee/bee_angry_nectar", "gingerbread_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "gingerbread_bee", "entity/bee/bee_nectar", "gingerbread_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", "*", "rudolph_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", "*baby", "rudolph_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", "entity/bee/bee_angry", "rudolph_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", "entity/bee/bee_angry_nectar", "rudolph_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "rudolph_bee", "entity/bee/bee_nectar", "rudolph_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", "*", "santa_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", "*baby", "santa_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", "entity/bee/bee_angry", "santa_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", "entity/bee/bee_angry_nectar", "santa_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "santa_bee", "entity/bee/bee_nectar", "santa_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", "*", "xmastree_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", "*baby", "xmastree_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", "entity/bee/bee_angry", "xmastree_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", "entity/bee/bee_angry_nectar", "xmastree_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "christmas", "xmastree_bee", "entity/bee/bee_nectar", "xmastree_bee_nectar");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", "*", "cherry_blossom_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", "*baby", "cherry_blossom_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", "entity/bee/bee_angry", "cherry_blossom_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", "entity/bee/bee_angry_nectar", "cherry_blossom_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "cherry_blossom_bee", "entity/bee/bee_nectar", "cherry_blossom_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", "*", "flower_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", "*baby", "flower_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", "entity/bee/bee_angry", "flower_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", "entity/bee/bee_angry_nectar", "flower_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "spring", "flower_bee", "entity/bee/bee_nectar", "flower_bee_nectar");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", "*", "midsommar_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", "*baby", "midsommar_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", "entity/bee/bee_angry", "midsommar_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", "entity/bee/bee_angry_nectar", "midsommar_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "midsommar_bee", "entity/bee/bee_nectar", "midsommar_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", "*", "watermelon_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", "*baby", "watermelon_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", "entity/bee/bee_angry", "watermelon_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", "entity/bee/bee_angry_nectar", "watermelon_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "summer", "watermelon_bee", "entity/bee/bee_nectar", "watermelon_bee_nectar");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", "*", "frozen_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", "*baby", "frozen_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", "entity/bee/bee_angry", "frozen_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", "entity/bee/bee_angry_nectar", "frozen_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "frozen_bee", "entity/bee/bee_nectar", "frozen_bee_nectar");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", "*", "snow_covered_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", "*baby", "snow_covered_bee");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", "entity/bee/bee_angry", "snow_covered_bee_angry");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", "entity/bee/bee_angry_nectar", "snow_covered_bee_angry_nectar");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.BEE, "winter", "snow_covered_bee", "entity/bee/bee_nectar", "snow_covered_bee_nectar");
    }
}
