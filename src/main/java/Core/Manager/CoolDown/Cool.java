package Core.Manager.CoolDown;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Cool {

    public static void Check(Player player, Material wand) {
        if (player.hasCooldown(wand)) {
            player.sendActionBar("쿨타임이 남아있습니다: " + player.getCooldown(wand)/20 + "초");
            throw new NoCoolException();
        }
    }
}