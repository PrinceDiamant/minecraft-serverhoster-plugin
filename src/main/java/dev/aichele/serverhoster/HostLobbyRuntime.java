package dev.aichele.serverhoster;

import java.util.List;

/** Runtime tweaks for the named outer lobby world only. Other worlds are ignored. */
final class HostLobbyRuntime {
    static final List<String> RULES_OFF = List.of(
            "doMobSpawning", "spawn_mobs", "doPatrolSpawning", "doTraderSpawning",
            "doWardenSpawning", "doWeatherCycle", "doFireTick");

    interface World {
        String name();
        void spawnFlags(boolean monsters, boolean animals);
        void keepSpawnInMemory(boolean keep);
        void ruleOff(String name);
    }

    private HostLobbyRuntime() {}

    static int apply(Iterable<World> worlds, String lobbyName) {
        if (!HostMinimize.worldNameSafe(lobbyName)) return 0;
        int changed = 0;
        for (World world : worlds) {
            if (world == null || !lobbyName.equals(world.name())) continue;
            world.spawnFlags(false, false);
            world.keepSpawnInMemory(false);
            for (String rule : RULES_OFF) world.ruleOff(rule);
            changed++;
        }
        return changed;
    }
}
